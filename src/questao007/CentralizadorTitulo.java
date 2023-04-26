package questao007;

public class CentralizadorTitulo {
    public static void main(String[] args) {
        String titleTop = "DSIN";
        String titleBottom = "TECNOLOGIA DA INFORMACAO";
        String formattedTitle = gerarTitulo(titleTop, titleBottom);
        System.out.println(formattedTitle);
    }

    private static String gerarTitulo(String titleTop, String titleBottom) {
        int lengthTop = titleTop.length();
        int lengthBottom = titleBottom.length();
        int maxLength = Math.max(lengthTop, lengthBottom);

        int spaceTop = (maxLength - lengthTop) / 2;
        int spaceBottom = (maxLength - lengthBottom) / 2;

        String line = criaLinha(maxLength);
        String formattedTop = formatarTitulo(titleTop, spaceTop, maxLength);
        String formattedBottom = formatarTitulo(titleBottom, spaceBottom, maxLength);

        return line + "\n" + formattedTop + "\n" + formattedBottom + "\n" + line;
    }

    private static String criaLinha(int maxLength) {
        return "| ".repeat(maxLength);
    }

    private static String formatarTitulo(String title, int space, int maxLength) {
        return "| " +
                " ".repeat(Math.max(0, space)) +
                title +
                " ".repeat(Math.max(0, maxLength - space - title.length())) +
                " |";
    }

}
