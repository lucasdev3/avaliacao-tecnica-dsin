package questao004;

import java.util.Scanner;

public class CalculadoraX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (validation(a, b, c)) {
            System.out.println("Valor de X: " + calcularValorX(a, b, c));
        }

    }

    public static boolean validation(int a, int b, int c) {
        if (a + b == 0 && c != 1) {
            System.out.println("Solução impossivel");
            return false;
        }
        return true;
    }

    public static float calcularValorX(int a, int b, int c) {
        return (float) (1 - c) / (a + b);
    }


}
