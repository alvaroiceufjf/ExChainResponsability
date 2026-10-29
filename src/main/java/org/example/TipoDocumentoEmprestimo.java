package org.example;


public class TipoDocumentoEmprestimo implements TipoDocumento {
    private static TipoDocumentoEmprestimo instance = new TipoDocumentoEmprestimo();
    private TipoDocumentoEmprestimo() {}

    public static TipoDocumentoEmprestimo getTipoDocumentoEmprestimo() {
        return instance;
    }
}
