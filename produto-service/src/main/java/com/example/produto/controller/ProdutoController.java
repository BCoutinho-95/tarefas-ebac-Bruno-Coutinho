package com.example.produto.controller;

import com.example.produto.model.Produto;
import com.example.produto.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto salvar(@Valid @RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @Valid @RequestBody Produto produto) {
        return service.atualizar(id, produto);
    }

    @GetMapping("/pesquisar")
    public List<Produto> pesquisar(@RequestParam(required = false, defaultValue = "") String nome) {
        return service.pesquisar(nome);
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }
}
