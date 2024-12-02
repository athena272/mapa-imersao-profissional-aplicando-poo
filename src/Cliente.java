import javax.swing.JOptionPane;

public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private double renda;

    public void cadastrarCliente() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"));
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente");

        do {
            this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente (maior ou igual a 18)"));
            if (this.idade < 18) {
                JOptionPane.showMessageDialog(null, "Idade inválida. O cliente deve ter 18 anos ou mais.");
            }
        } while (this.idade < 18);

        this.renda = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do cliente"));
    }

    public String imprimirResumoCliente() {
        String msg = "Id: " + this.id + "\n" +
                "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Renda: " + this.renda;
        return msg;
    }

    public double getRenda() {
        return this.renda;
    }
}
