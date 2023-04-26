package questao002;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int valor1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int valor2 = scanner.nextInt();
        System.out.println("Informe o terceiro numero: ");
        int valor3 = scanner.nextInt();
        System.out.println("Informe o quarto numero: ");
        int valor4 = scanner.nextInt();

        ComparadorModel model = new ComparadorModel(valor1, valor2, valor3, valor4);

        boolean condicao1 = model.b() > model.c();
        boolean condicao2 = model.d() > model.a();
        boolean condicao3 = model.c() + model.d() > model.a() + model.b();
        boolean condicao4 = model.c() > 0 && model.d() > 0 && model.a() % 2 == 0;

        List<Boolean> condicionais = Arrays.asList(condicao1, condicao2, condicao3, condicao4);

        System.out.println(model.comparar(condicionais));

    }
}
