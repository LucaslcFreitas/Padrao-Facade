import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaEmprestimoEncerrarConta() {
        Cliente cliente = new Cliente();
        Emprestimo.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.encerrarContaCorrente());
    }

    @Test
    void deveRetornarPendenciaChequeEspecialEncerrarConta() {
        Cliente cliente = new Cliente();
        ChequeEspecial.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.encerrarContaCorrente());
    }

    @Test
    void deveRetornarPendenciaFinanciamentoEncerrarConta() {
        Cliente cliente = new Cliente();
        Financiamento.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.encerrarContaCorrente());
    }

    @Test
    void deveRetornarClienteSemPendenciaParaEncerrarConta() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.encerrarContaCorrente());
    }
}