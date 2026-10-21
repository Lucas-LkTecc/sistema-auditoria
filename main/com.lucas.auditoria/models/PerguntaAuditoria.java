package com.lucas.auditoria.models;

public class PerguntaAuditoria {

    private int codPergunta;
    private String descricao;
    private String tipoAuditoria;

    public int getCodPergunta() {
        return codPergunta;
    }
    public void setCodPergunta(int codPergunta) {
        this.codPergunta = codPergunta;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTipoAuditoria() {
        return tipoAuditoria;
    }
    public void setTipoAuditoria(String tipoAuditoria) {
        this.tipoAuditoria = tipoAuditoria;
    }

}
