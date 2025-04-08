package generic;

abstract class Carro {
    protected String modelo;
    protected int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract String descricao();
    public abstract String tipoMotor();
}