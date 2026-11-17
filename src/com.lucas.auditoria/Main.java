package com.lucas.auditoria;

import com.lucas.auditoria.models.Setor;
import com.lucas.auditoria.models.Auditor;
import com.lucas.auditoria.models.Auditoria;
import com.lucas.auditoria.services.AuditoriaService;
import com.lucas.auditoria.util.HibernateUtil;
import org.hibernate.Session;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 1. Passa na porta da fábrica que já está pronta
        // Não estamos criando uma fábrica nova, só pegando a que o HibernateUtil fez.
        org.hibernate.SessionFactory fabrica = HibernateUtil.getSessionFactory();

        // 2. Contrata um operário (Abre uma Session)
        Session operario = fabrica.openSession();

        // 3. Manda o operário começar a trabalhar (Abre a transação com o PostgreSQL)
        operario.beginTransaction();
        try {
            // --- AQUI A MÁGICA ACONTECE ---
            // Você cria seu objeto
            Setor setor = new Setor();
            setor.setCodSetor("10.1");
            setor.setNomeSetor("Estamparia");
            setor.setResponsavelSetor("Wagner");
            setor.setEmailSetor("estammparia@zb.com.br");

            // Manda o operário salvar
            operario.persist(setor);

            // Confirma o trabalho (Commit)
            operario.getTransaction().commit();
            System.out.println("Setor salvo com sucesso!");

        } catch (Exception e) {
            // Se der erro, manda o operário desfazer tudo (Rollback)
            operario.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            // 4. Demite o operário (Fecha a Session) para não travar o banco
            operario.close();
        }
    }
}
