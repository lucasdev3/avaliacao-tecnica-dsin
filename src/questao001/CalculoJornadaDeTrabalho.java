package questao001;

public class CalculoJornadaDeTrabalho {

    Trabalhador trabalhador;

    private Integer qtdHorasDias;

    private Double valorHora;

    private Integer totalDiasTrabalhados;

    private Double desconto;

    public CalculoJornadaDeTrabalho() {
    }

    public CalculoJornadaDeTrabalho(Trabalhador trabalhador, Integer qtdHorasDias, Double valorHora, Integer totalDiasTrabalhados, Double desconto) {
        this.trabalhador = trabalhador;
        this.qtdHorasDias = qtdHorasDias;
        this.valorHora = valorHora;
        this.totalDiasTrabalhados = totalDiasTrabalhados;
        this.desconto = desconto;
    }

    public Trabalhador getTrabalhador() {
        return trabalhador;
    }

    public void setTrabalhador(Trabalhador trabalhador) {
        this.trabalhador = trabalhador;
    }

    public Integer getQtdHorasDias() {
        return qtdHorasDias;
    }

    public void setQtdHorasDias(Integer qtdHorasDias) {
        this.qtdHorasDias = qtdHorasDias;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getTotalDiasTrabalhados() {
        return totalDiasTrabalhados;
    }

    public void setTotalDiasTrabalhados(Integer totalDiasTrabalhados) {
        this.totalDiasTrabalhados = totalDiasTrabalhados;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public boolean calcularSalarioLiquido() {
        try {
            double valorDescontado = trabalhador.getSalarioBruto() * desconto / 100;
            trabalhador.setSalarioLiquido(trabalhador.getSalarioBruto() - valorDescontado);
            return true;
        } catch (Exception exception) {
            System.out.println("Falha ao setar salario do funcionario");
            return false;
        }

    }


}
