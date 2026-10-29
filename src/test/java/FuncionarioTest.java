package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRepassarAssinaturaDeEmprestimoParaOGerente() {
        FuncionarioGerentePA gerente = new FuncionarioGerentePA(null);
        FuncionarioAtendentePA atendente = new FuncionarioAtendentePA(gerente);

        Documento doc = new Documento(TipoDocumentoEmprestimo.getTipoDocumentoEmprestimo());

        // A solicitação entra pelo Atendente, mas quem assina é o Gerente
        assertEquals("Gerente do PA", atendente.assinarDocumento(doc));
    }

    @Test
    void deveRetornarSemAssinaturaSeNinguemNaCadeiaPuderAssinar() {
        FuncionarioAtendentePA atendente = new FuncionarioAtendentePA(null);
        Documento doc = new Documento(TipoDocumentoEmprestimo.getTipoDocumentoEmprestimo());

        assertEquals("Sem assinatura", atendente.assinarDocumento(doc));
    }
}