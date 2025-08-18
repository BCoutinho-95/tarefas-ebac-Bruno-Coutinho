package com.example.produto.service;

import com.example.produto.model.Produto;
import com.example.produto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    @Transactional
    public Produto atualizar(Long id, Produto produto) {
        Produto existente = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
        existente.setNome(produto.getNome());
        existente.setPreco(produto.getPreco());
        return repository.save(existente);
    }

    @Transactional(readOnly = true)
    public List<Produto> pesquisar(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome == null ? "" : nome);
    }

    @Transactional(readOnly = true)
    public List<Produto> listarTodos() {
        return repository.findAll();
    }
}
