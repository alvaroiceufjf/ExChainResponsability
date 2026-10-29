package org.example;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList<TipoDocumento> listaDocumentos = new ArrayList<>();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario superior) {
        this.funcionarioSuperior = superior;
    }

    public abstract String getDescricaoCargo();

    public String assinarDocumento(Documento documento) {
        if (listaDocumentos.contains(documento.getTipoDocumento())) {
            return getDescricaoCargo();
        } else if (funcionarioSuperior != null) {
            return funcionarioSuperior.assinarDocumento(documento);
        } else {
            return "Sem assinatura";
        }
    }
}