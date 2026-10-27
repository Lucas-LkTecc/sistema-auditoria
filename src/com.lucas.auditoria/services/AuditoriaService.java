package com.lucas.auditoria.services;

public class AuditoriaService {
    
    public double calcularPorcentagem(int totalPerguntas, int totalNok) {
        int conformidades = totalPerguntas - totalNok;
        double porcentagem = ((double) conformidades / totalPerguntas) * 100;

        return porcentagem;
    }
}
