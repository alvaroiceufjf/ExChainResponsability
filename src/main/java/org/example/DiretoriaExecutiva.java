package org.example;

public class DiretoriaExecutiva extends AprovadorCredito {

    @Override
    public String aprovar(double valor) {
        if (valor <= 50000.0) {
            return "Aprovado pela Diretoria Executiva";
        } else if (proximo != null) {
            return proximo.aprovar(valor);
        }
        return "Crédito não aprovado: Sem alçada";
    }
}