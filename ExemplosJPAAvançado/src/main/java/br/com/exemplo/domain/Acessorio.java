package br.com.exemplo.domain;

import java.util.List;

@Entity
@Table(name = "acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;

    public Acessorio() {}

    public Acessorio(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
}
