import java.util.ArrayList;
import java.util.List;

public class SepararPorGenero {
    public static void main(String[] args) {
        // Definindo os nomes fixos
        String entrada = "Luana - F, João - M, Carla - F, Pedro - M";

        // Separando os pares Nome - Gênero
        String[] pares = entrada.split(",");

        // Listas para armazenar nomes por gênero
        List<String> femininos = new ArrayList<>();
        List<String> masculinos = new ArrayList<>();

        // Processando cada par
        for (String par : pares) {
            String[] partes = par.trim().split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim().toUpperCase();

                if (genero.equals("F")) {
                    femininos.add(nome);
                } else if (genero.equals("M")) {
                    masculinos.add(nome);
                }
            }
        }

        // Exibindo os nomes separados por gênero
        System.out.println("Nomes Femininos:");
        for (String nome : femininos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Masculinos:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }
    }
}