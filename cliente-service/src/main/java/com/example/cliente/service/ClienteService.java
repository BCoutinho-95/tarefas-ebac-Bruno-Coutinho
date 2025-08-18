package com.example.cliente.service;

import com.example.cliente.model.Cliente;
import com.example.cliente.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Cliente salvar(Cliente cliente) {
        repository.findByEmail(cliente.getEmail()).ifPresent(c -> {
            throw new IllegalArgumentException("Email já cadastrado");
        });
        return repository.save(cliente);
    }

    @Transactional
    public Cliente atualizar(Long id, Cliente cliente) {
        Cliente existente = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado"));
        existente.setNome(cliente.getNome());
        existente.setEmail(cliente.getEmail());
        return repository.save(existente);
    }

    @Transactional(readOnly = true)
    public List<Cliente> pesquisar(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome == null ? "" : nome);
    }

    @Transactional(readOnly = true)
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }
}
