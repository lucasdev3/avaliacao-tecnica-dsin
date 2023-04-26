package questao001;

public class Trabalhador {

    private String nome;

    private Double salarioBruto;

    private Double salarioLiquido;

    public Trabalhador() {
    }

    public Trabalhador(String nome, Double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "nome='" + nome + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }
}
