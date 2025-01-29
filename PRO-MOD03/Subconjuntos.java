import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {
    public static void main(String[] args) {
        List<Integer> S = List.of(1, 2, 3); // aqui é possível colocar os elementos para calcular seus subconjuntos
        int n = 2;

        List<List<Integer>> resultado = gerarSubconjuntos(S, n);
        System.out.println(resultado);
    }

    public static List<List<Integer>> gerarSubconjuntos(List<Integer> S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        gerarCombinacoes(S, new ArrayList<>(), 0, n, resultado);
        return resultado;
    }

    private static void gerarCombinacoes(List<Integer> S, List<Integer> temp, int inicio, int n, List<List<Integer>> resultado) {
        if (temp.size() == n) {
            resultado.add(new ArrayList<>(temp));
            return;
        }

        for (int i = inicio; i < S.size(); i++) {
            temp.add(S.get(i));
            gerarCombinacoes(S, temp, i + 1, n, resultado);
            temp.remove(temp.size() - 1);
        }
    }
}
