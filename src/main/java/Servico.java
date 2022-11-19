import java.util.ArrayList;
import java.util.List;

public abstract class Servico {

    private List<Cliente> clientesPendentes = new ArrayList<>();

    public void addClientePendente(Cliente cliente) {
        this.clientesPendentes.add(cliente);
    }

    public boolean verificarClienteComPendencia(Cliente cliente) {
        return this.clientesPendentes.contains(cliente);
    }
}
