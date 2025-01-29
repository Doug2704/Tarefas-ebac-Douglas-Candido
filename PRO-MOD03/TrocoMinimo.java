import java.util.*;

public class TrocoMinimo {
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedas = {5, 2, 1}; // informar as moedas disponíveis

        Map<Integer, Integer> troco = calcularTroco(quantia, moedas);

        int totalMoedas = 0;
        System.out.println("Troco mínimo para " + quantia + ":");
        for (Map.Entry<Integer, Integer> entry : troco.entrySet()) {
            System.out.println(entry.getValue() + " moeda(s) de " + entry.getKey());
            totalMoedas += entry.getValue();
        }
        System.out.println("Total de moedas: " + totalMoedas);
    }

    public static Map<Integer, Integer> calcularTroco(int quantia, int[] moedas) {
        Map<Integer, Integer> troco = new LinkedHashMap<>();
        Arrays.sort(moedas);
        for (int i = moedas.length - 1; i >= 0; i--) {
            int moeda = moedas[i];
            int qtdMoedas = quantia / moeda;
            if (qtdMoedas > 0) {
                troco.put(moeda, qtdMoedas);
                quantia -= qtdMoedas * moeda;
            }
        }
        return troco;
    }
}
