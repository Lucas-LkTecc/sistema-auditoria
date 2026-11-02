package com.lucas.auditoria.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Auditoria {
    private List<PerguntaAuditoria> perguntas = new ArrayList<>();
    private int codAuditoria;
    private LocalDate data;
    private String maquina;
    private String peca;
    private String turno;
    private double resultadoFinal;
    private Auditor auditor;
    private Setor setor;

    
    public int getCodAuditoria() {
        return codAuditoria;
    }
    public void setCodAuditoria(int codAuditoria) {
        this.codAuditoria = codAuditoria;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getMaquina() {
        return maquina;
    }
    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getPeca() {
        return peca;
    }
    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getResultadoFinal() {
        return resultadoFinal;
    }
    public void setResultadoFinal(double resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }

    public Auditor getAuditor() {
        return auditor;
    }
    public void setAuditor(Auditor auditor) {
        this.auditor = auditor;
    }

    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
