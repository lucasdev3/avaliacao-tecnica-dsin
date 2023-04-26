package questao003;

public record DescontoProduto(Item item) {

    public String relatorioCompra() {
        double totalInicial = item.qtd() * item().valorUnitario();
        double desconto = calculaDesconto(item.qtd(), totalInicial);
        double totalFinal = totalInicial - desconto;
        return String.format("Total inicial: %f | Desconto aplicado em porcentagem: %f | Total final: %f", totalInicial, desconto, totalFinal);
    }

    public Double calculaDesconto(int qtd, double totalInicial) {
        double desconto;
        if (qtd <= 5 && qtd > 0) {
            desconto = totalInicial * 0.055;
        } else if (qtd <= 10) {
            desconto = totalInicial * 0.08;
        } else {
            desconto = totalInicial * 0.125;
        }
        return desconto;
    }

}
