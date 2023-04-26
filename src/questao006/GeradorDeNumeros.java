package questao006;

import java.util.Scanner;

import static questao006.Deteccao.*;

public class GeradorDeNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            if (ehNumeroPerfeito(i)) {
                System.out.println(i + " é um número perfeito");
            }
            if (i % 2 == 0) {
                System.out.println(i + " é um múltiplo de 2");
            }
            if (i % 7 == 0) {
                System.out.println(i + " é um múltiplo de 7");
            }
        }
    }

}
