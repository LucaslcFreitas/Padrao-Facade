public class Financiamento extends Servico {

    private static Financiamento financiamento = new Financiamento();

    private Financiamento() {};

    public static Financiamento getInstancia() {
        return financiamento;
    }
}
