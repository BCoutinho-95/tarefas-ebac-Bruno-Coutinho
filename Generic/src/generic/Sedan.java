package generic;

public class Sedan extends Carro {
    public Sedan(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public String descricao() {
        return modelo + " (" + ano + ") é um carro sedan confortável.";
    }

    @Override
    public String tipoMotor() {
        return "Motor 1.6 aspirado";
    }
}