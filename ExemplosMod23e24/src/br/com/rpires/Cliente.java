package br.com.rpires;

/**
 * @author rodrigo.pires
 */
public class Cliente {

    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNome(String nome) {
        setNome(nome);
    }


    public void adicionarNome1(String nome) {
        setNome(nome);
    }
}