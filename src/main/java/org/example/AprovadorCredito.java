package org.example;

public abstract class AprovadorCredito {

    protected AprovadorCredito proximo;

    public void setProximo(AprovadorCredito proximo) {
        this.proximo = proximo;
    }

    public abstract String aprovar(double valor);
}
