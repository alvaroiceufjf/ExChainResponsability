package org.example;

public class Documento {
    private TipoDocumento tipoDocumento;

    public Documento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
}
