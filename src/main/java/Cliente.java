public class Cliente {

    public boolean encerrarContaCorrente() {
        return ClienteFacade.verificaPendenciasEncerrarConta(this);
    }
}
