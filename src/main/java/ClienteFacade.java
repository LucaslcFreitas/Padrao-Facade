public class ClienteFacade {

    public static boolean verificaPendenciasEncerrarConta(Cliente cliente) {
        if (Emprestimo.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ChequeEspecial.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Financiamento.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }

        return true;
    }
}
