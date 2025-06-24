package br.com.exemplo.domain;

import java.util.List;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    @ManyToMany
    @JoinTable(
        name = "carro_acessorio",
        joinColumns = @JoinColumn(name = "carro_id"),
        inverseJoinColumns = @JoinColumn(name = "acessorio_id")
    )
    private List<Acessorio> acessorios;

    public Carro() {}

    public Carro(String modelo, Marca marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    // Getters e Setters
}
