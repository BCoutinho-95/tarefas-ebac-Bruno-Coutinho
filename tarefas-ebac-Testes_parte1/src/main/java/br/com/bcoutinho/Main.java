package br.com.bcoutinho;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	   public static void main(String[] args) {
	        
	        List<Pessoa> pessoas = Pessoa.criarListaPessoas();

	        
	        System.out.println("Lista completa:");
	        pessoas.forEach(p -> System.out.println(p));

	      
	        List<Pessoa> mulheres = pessoas.stream()
	            .filter(p -> p.getSexo().equals("F"))
	            .collect(Collectors.toList());

	        
	        System.out.println("\nLista de mulheres:");
	        mulheres.forEach(p -> System.out.println(p));
	    }
}
