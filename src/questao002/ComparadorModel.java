package questao002;

import java.util.List;

public record ComparadorModel(int a, int b, int c, int d) {

    public String comparar(List<Boolean> condicionais) {
        for (Boolean condicional : condicionais) {
            if (!condicional) {
                return "Valores não aceitos";
            }
        }
        return "Valores aceitos";
    }

}
