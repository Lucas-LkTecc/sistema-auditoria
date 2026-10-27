package com.lucas.auditoria.models;

public class PlanoAcao {

    private int codPdca;
    private String acao;
    private String dataPlanejada;
    private String dataFechamento;
    private String status;
    private RespostaAuditoria respostaAuditoria;

    public int getCodPdca() {
        return codPdca;
    }
    public void setCodPdca(int codPdca) {
        this.codPdca = codPdca;
    }
    public String getAcao() {
        return acao;
    }
    public void setAcao(String acao) {
        this.acao = acao;
    }
    public String getDataPlanejada() {
        return dataPlanejada;
    }
    public void setDataPlanejada(String dataPlanejada) {
        this.dataPlanejada = dataPlanejada;
    }
    public String getDataFechamento() {
        return dataFechamento;
    }
    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public RespostaAuditoria getRespostaAuditoria() {
        return respostaAuditoria;
    }
    public void setRespostaAuditoria(RespostaAuditoria respostaAuditoria) {
        this.respostaAuditoria = respostaAuditoria;
    }
}
