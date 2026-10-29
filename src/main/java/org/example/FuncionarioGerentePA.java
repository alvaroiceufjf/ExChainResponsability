package org.example;


public class FuncionarioGerentePA extends Funcionario {

    public FuncionarioGerentePA(Funcionario superior) {
        this.listaDocumentos.add(TipoDocumentoEmprestimo.getTipoDocumentoEmprestimo());
        setFuncionarioSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Gerente do PA";
    }
}