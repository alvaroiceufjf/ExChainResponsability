package org.example;

public class GerentePA extends AprovadorCredito {

    @Override
    public String aprovar(double valor) {
        if (valor <= 10000.0) {
            return "Aprovado pelo Gerente do PA";
        } else if (proximo != null) {
            return proximo.aprovar(valor);
        }
        return "Crédito não aprovado: Sem alçada";
    }
}