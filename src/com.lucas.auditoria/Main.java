package com.lucas.auditoria;

import com.lucas.auditoria.models.Setor;
import com.lucas.auditoria.models.Auditor;
import com.lucas.auditoria.models.Auditoria;
import com.lucas.auditoria.services.AuditoriaService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        
        Setor setorEstamparia = new Setor();
        setorEstamparia.setNomeSetor("Estamparia");
        setorEstamparia.setCodSetor("10.1");

        Auditor auditorEmpresa = new Auditor();
        auditorEmpresa.setReAuditor(7830);
        auditorEmpresa.setNomeAuditor("Lucas");

        Auditoria minhaAuditoria = new Auditoria();
        minhaAuditoria.setData(LocalDate.of(2026, 10, 20));
        minhaAuditoria.setMaquina("Prensa 01");

        minhaAuditoria.setSetor(setorEstamparia);
        minhaAuditoria.setAuditor(auditorEmpresa);

        System.out.println("A auditoria foi realizada no setor: " + minhaAuditoria.getSetor().getNomeSetor());
        System.out.println("Auditor responsável: " + minhaAuditoria.getAuditor().getNomeAuditor());

        DateTimeFormatter formatadorBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = minhaAuditoria.getData().format(formatadorBR);
        System.out.println("Data de Auditoria: " + dataFormatada);

        AuditoriaService auditoriaService = new AuditoriaService();
        double resultado = auditoriaService.calcularPorcentagem(10, 2);
        System.out.println("Porcentagem: " + resultado + "%");
    }
}
