package questao005;

import java.util.Scanner;

public class CapturadorMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a placa:");
        String placa = scanner.nextLine().toUpperCase().trim();

// Verifica se a placa está no formato correto
        if (!placa.matches("^[A-Z]{3}[0-9][A-Z0-9][0-9]{2}$") &&
                !placa.matches("^[A-Z]{3}[0-9]{4}$")) {
            System.out.println("Formato inválido.");
            return;
        }

// Verifica se a placa está no padrão Brasil
        if (placa.length() == 6 && Character.isLetter(placa.charAt(3))) {
            String correspondente = placa.substring(0, 3) + placa.charAt(4) + placa.substring(5, 7);
            System.out.println("Padrão: Brasil");
            System.out.println("Correspondente: " + correspondente);
        } else {
            // Placa no padrão Mercosul
            String correspondente = placa.substring(0, 3) + placa.substring(4, 7);
            System.out.println("Padrão: Mercosul");
            System.out.println("Correspondente: " + correspondente);
        }

    }

}
