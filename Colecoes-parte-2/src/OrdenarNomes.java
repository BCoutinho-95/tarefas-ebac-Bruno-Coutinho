import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os nomes separados por vírgula
        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = scanner.nextLine();

        // Separando os nomes e removendo espaços extras
        String[] nomes = entrada.split(",");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordenando os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibindo os nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}


