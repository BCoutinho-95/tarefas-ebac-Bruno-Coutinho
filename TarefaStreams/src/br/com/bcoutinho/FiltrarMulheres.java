package br.com.bcoutinho;

import java.util.*;
import java.util.stream.Collectors;

public class FiltrarMulheres {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Ana", "Feminino"),
            new Pessoa("Bruno", "Masculino"),
            new Pessoa("Carla", "Feminino"),
            new Pessoa("Daniela", "Feminino"),
            new Pessoa("Eduardo", "Masculino")
        );

        System.out.println("Lista completa de pessoas:");
        pessoas.forEach(p -> 
            System.out.println(p.getNome() + " - Sexo: " + p.getSexo())
        );

        List<String> mulheres = pessoas.stream()
            .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
            .map(Pessoa::getNome)
            .collect(Collectors.toList());

        System.out.println("\nMulheres: " + String.join(", ", mulheres));
    }
}

class Pessoa {
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
}
