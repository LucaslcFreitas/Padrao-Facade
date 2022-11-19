public class ChequeEspecial extends Servico {

    private static ChequeEspecial chequeEspecial = new ChequeEspecial();

    private ChequeEspecial() {};

    public static ChequeEspecial getInstancia() {
        return chequeEspecial;
    }
}
