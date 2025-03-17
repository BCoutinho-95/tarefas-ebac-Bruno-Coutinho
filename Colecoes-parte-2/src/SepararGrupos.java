import java.util.*;

class Pessoa {
    String nome;
    String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }
}

public class SepararGrupos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine().trim().toUpperCase();

            if (sexo.equals("M")) {
                masculino.add(new Pessoa(nome, "Masculino"));
            } else {
                feminino.add(new Pessoa(nome, "Feminino"));
            }
        }

        System.out.println("\nGrupo Masculino: " + masculino);
        System.out.println("Grupo Feminino: " + feminino);

        scanner.close();
    }
}
