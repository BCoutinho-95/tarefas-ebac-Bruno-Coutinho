package br.com.bcoutinho.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;

import br.com.bcoutinho.Pessoa;

public class PessoaTest {

    @Test
    public void testSomenteMulheresNaListaFiltrada() {
        List<Pessoa> pessoas = Pessoa.criarListaPessoas();

        List<Pessoa> mulheres = ((Stream<Pessoa>) pessoas.stream()
            .filter(p -> p.getSexo().equalsIgnoreCase("F")))
        	.collect(Collectors.toList())
;

        for (Pessoa mulher : mulheres) {
            Assert.assertEquals("F", mulher.getSexo());
        }
    }
}

