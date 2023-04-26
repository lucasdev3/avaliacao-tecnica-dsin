package questao001;

public class Main {

    public static void main(String[] args) {

        Trabalhador trabalhador = new Trabalhador("Lucas", 1990.0d);

        System.out.println(trabalhador);

        CalculoJornadaDeTrabalho calculoJornadaDeTrabalho = new CalculoJornadaDeTrabalho();
        calculoJornadaDeTrabalho.setTrabalhador(trabalhador);
        calculoJornadaDeTrabalho.setDesconto(21d);
        calculoJornadaDeTrabalho.setQtdHorasDias(10);
        calculoJornadaDeTrabalho.setTotalDiasTrabalhados(30);
        calculoJornadaDeTrabalho.setValorHora(200d);

        if (calculoJornadaDeTrabalho.calcularSalarioLiquido()) {
            System.out.println("Salario do trabalho calculado com sucesso!");
        }

        System.out.println(trabalhador);

    }

}
