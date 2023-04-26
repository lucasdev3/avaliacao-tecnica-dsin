package questao003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a descrição do item: ");
        String descricaoItem = scanner.next();
        System.out.println("Informe a quantidade: ");
        Integer qtd = scanner.nextInt();
        System.out.println("Informe o valor unitario: ");
        Double valorUnitario = scanner.nextDouble();

        Item item = new Item(descricaoItem, qtd, valorUnitario);


        DescontoProduto descontoProduto = new DescontoProduto(item);

        System.out.println(descontoProduto.relatorioCompra());

    }
}
