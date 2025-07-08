package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testPessoa() {
        Pessoa pessoa = new Pessoa("Bruno", 30);
        assertEquals("Bruno", pessoa.getNome());
        assertEquals(30, pessoa.getIdade());
    }
}
