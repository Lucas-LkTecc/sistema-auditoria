package com.lucas.auditoria.models;

public class RespostaAuditoria {

    private int idResposta;
    private Auditoria auditoria;
    private PerguntaAuditoria perguntasAuditoria;
    private String statusResposta;

    public int getIdResposta() {
        return idResposta;
    }
    public void setIdResposta(int idResposta) {
        this.idResposta = idResposta;
    }
    public Auditoria getAuditoria() {
        return auditoria;
    }
    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }
    public PerguntaAuditoria getPerguntasAuditoria() {
        return perguntasAuditoria;
    }
    public void setPerguntasAuditoria(PerguntaAuditoria perguntasAuditoria) {
        this.perguntasAuditoria = perguntasAuditoria;
    }
    public String getStatusResposta() {
        return statusResposta;
    }
    public void setStatusResposta(String statusResposta) {
        this.statusResposta = statusResposta;
    }


}
