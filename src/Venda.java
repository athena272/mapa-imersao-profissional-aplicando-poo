import javax.swing.JOptionPane;

public class Venda {

    private Carro carro;
    private Cliente cliente;

    public void realizarVenda() {
        this.carro = new Carro();
        carro.cadastrarCarro();

        this.cliente = new Cliente();
        cliente.cadastrarCliente();

        double parcela = this.carro.getValorVenda() / 36;

        if (validarVenda(parcela, this.cliente.getRenda())) {
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Venda NÃO realizada!");
        }
    }

    public boolean validarVenda(double valorParcela, double renda) {
        return valorParcela < (renda * 0.3);
    }

    // Métodos getters para acessar carro e cliente
    public Carro getCarro() {
        return carro;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
