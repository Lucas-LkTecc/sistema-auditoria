package com.lucas.auditoria.models;

public class Auditor {
    
    private int reAuditor;
    private String nomeAuditor;
    private String turno;
    private Setor setor;

    public int getReAuditor() {
        return reAuditor;
    }
    public void setReAuditor(int reAuditor) {
        this.reAuditor = reAuditor;
    }
    public String getNomeAuditor() {
        return nomeAuditor;
    }
    public void setNomeAuditor(String nomeAuditor) {
        this.nomeAuditor = nomeAuditor;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Setor getSetorSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }

}
