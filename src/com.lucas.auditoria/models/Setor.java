package com.lucas.auditoria.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Setor {

    @Id
    private String codSetor;
    private String nomeSetor;
    private String responsavelSetor;
    private String emailSetor;

    public String getCodSetor() {
        return codSetor;
    }
    public void setCodSetor(String codSetor) {
        this.codSetor = codSetor;
    }
    public String getNomeSetor() {
        return nomeSetor;
    }
    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
    public String getResponsavelSetor() {
        return responsavelSetor;
    }
    public void setResponsavelSetor(String responsavelSetor) {
        this.responsavelSetor = responsavelSetor;
    }
    public String getEmailSetor() {
        return emailSetor;
    }
    public void setEmailSetor(String emailSetor) {
        this.emailSetor = emailSetor;
    }
}
