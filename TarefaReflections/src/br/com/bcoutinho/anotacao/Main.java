package br.com.bcoutinho.anotacao;

import br.com.bcoutinho.anotacao.Tabela;
import br.com.bcoutinho.anotacao.Usuario;

public class Main {
    public static void main(String[] args) {
        // Obtém a classe Usuario
        Class<Usuario> classe = Usuario.class;

        // Verifica se a anotação @Tabela está presente
        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = classe.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela: " + tabela.value());
        } else {
            System.out.println("A anotação @Tabela não está presente na classe.");
        }
    }
}