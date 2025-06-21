package br.com.bcoutinho.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    public void deveCriarProdutoComValoresCorretos() {
        // Arrange
        String nomeEsperado = "Notebook";
        Double precoEsperado = 2500.00;

        // Act
        Produto produto = new Produto(nomeEsperado, precoEsperado);

        // Assert
        Assertions.assertEquals(nomeEsperado, produto.getNome());
        Assertions.assertEquals(precoEsperado, produto.getPreco());
    }

    @Test
    public void devePermitirAlterarNomeEPreco() {
        // Arrange
        Produto produto = new Produto("Antigo Nome", 1000.00);

        // Act
        produto.setNome("Novo Nome");
        produto.setPreco(1200.00);

        // Assert
        Assertions.assertEquals("Novo Nome", produto.getNome());
        Assertions.assertEquals(1200.00, produto.getPreco());
    }

    @Test
    public void deveTerConstrutorPadrao() {
        // Act
        Produto produto = new Produto();

        // Assert
        Assertions.assertNotNull(produto);
    }
}
