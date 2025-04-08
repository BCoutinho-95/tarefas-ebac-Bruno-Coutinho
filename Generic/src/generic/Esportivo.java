package generic;

public class Esportivo extends Carro {
    public Esportivo(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public String descricao() {
        return modelo + " (" + ano + ") é um carro esportivo de alta performance.";
    }

    @Override
    public String tipoMotor() {
        return "Motor V8 biturbo";
    }
}