package com.exemplo;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bruno", 30);

        Gson gson = new Gson();
        String json = gson.toJson(pessoa);

        System.out.println("JSON: " + json);

        String nomeMaiusculo = StringUtils.upperCase(pessoa.getNome());
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
