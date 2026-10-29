package org.example;



public class ConselhoAdministracao extends AprovadorCredito {

    @Override
    public String aprovar(double valor) {
        return "Aprovado pelo Conselho de Administração";
    }
}
