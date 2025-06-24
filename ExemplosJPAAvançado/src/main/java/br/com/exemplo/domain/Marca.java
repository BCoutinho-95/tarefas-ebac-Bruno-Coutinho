package br.com.exemplo.domain;

import java.util.List;

@Entity
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    private List<Carro> carros;

    public Marca() {}

    public Marca(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
}

