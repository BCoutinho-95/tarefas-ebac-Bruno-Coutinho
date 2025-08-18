package com.example.cliente.controller;

import com.example.cliente.model.Cliente;
import com.example.cliente.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvar(@Valid @RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @Valid @RequestBody Cliente cliente) {
        return service.atualizar(id, cliente);
    }

    @GetMapping("/pesquisar")
    public List<Cliente> pesquisar(@RequestParam(required = false, defaultValue = "") String nome) {
        return service.pesquisar(nome);
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return service.listarTodos();
    }
}
