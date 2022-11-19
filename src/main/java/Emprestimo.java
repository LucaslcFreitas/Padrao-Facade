public class Emprestimo extends Servico {

    private static Emprestimo emprestimo = new Emprestimo();

    private Emprestimo() {};

    public static Emprestimo getInstancia() {
        return emprestimo;
    }
}
