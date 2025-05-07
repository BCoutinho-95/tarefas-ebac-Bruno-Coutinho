package br.com.bcoutinho;

import java.util.List;

public class Pessoa {

    private String nome;
    private String sexo; 

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + " , " + sexo;
    }


    public static List<Pessoa> criarListaPessoas() {
        Pessoa pessoa1 = new Pessoa("Ana", "F");
        Pessoa pessoa2 = new Pessoa("Bruno", "M");
        Pessoa pessoa3 = new Pessoa("Carla", "F");
        Pessoa pessoa4 = new Pessoa("Daniel", "M");
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
    }
}
