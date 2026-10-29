package org.example;


public class FuncionarioAtendentePA extends Funcionario {

    public FuncionarioAtendentePA(Funcionario superior) {
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Atendente do PA";
    }
}