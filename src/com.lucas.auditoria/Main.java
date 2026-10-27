package com.lucas.auditoria;

import com.lucas.auditoria.models.Setor;
import com.lucas.auditoria.models.Auditor;
import com.lucas.auditoria.models.Auditoria;
import com.lucas.auditoria.services.AuditoriaService;

public class Main {
    public static void main(String[] args) {
        
        Setor setorEstamparia = new Setor();
        setorEstamparia.setNomeSetor("Estamparia");
        setorEstamparia.setCodSetor("10.1");

        Auditor auditorEmpresa = new Auditor();
        auditorEmpresa.setReAuditor(7830);
        auditorEmpresa.setNomeAuditor("Lucas");

        Auditoria minhaAuditoria = new Auditoria();
        minhaAuditoria.setData("20/10/2026");
        minhaAuditoria.setMaquina("Prensa 01");

        minhaAuditoria.setSetor(setorEstamparia);
        minhaAuditoria.setAuditor(auditorEmpresa);

        System.out.println("A auditoria foi realizada no setor: " + minhaAuditoria.getSetor().getNomeSetor());
        System.out.println("Auditor responsável: " + minhaAuditoria.getAuditor().getNomeAuditor());

        AuditoriaService auditoriaService = new AuditoriaService();
        double resultado = auditoriaService.calcularPorcentagem(10, 2);
        System.out.println("Porcentagem: " + resultado + "%");
    }
}
