public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.realizarVenda();

        // Exibir resumo do carro
        String resumoCarro = venda.getCarro().imprimirResumoCarro();
        javax.swing.JOptionPane.showMessageDialog(null, "Resumo do Carro:\n" + resumoCarro);

        // Exibir resumo do cliente
        String resumoCliente = venda.getCliente().imprimirResumoCliente();
        javax.swing.JOptionPane.showMessageDialog(null, "Resumo do Cliente:\n" + resumoCliente);

        // Atualizar valor do carro com desconto
        double percentualDesconto = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite o percentual de desconto para o carro"));
        venda.getCarro().atualizarValorDesconto(percentualDesconto);
        javax.swing.JOptionPane.showMessageDialog(null, "Valor do carro após desconto: " + venda.getCarro().getValorVenda());
    }
}
