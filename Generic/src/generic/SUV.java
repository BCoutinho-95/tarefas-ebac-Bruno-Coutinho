package generic;

public class SUV extends Carro {
    public SUV(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public String descricao() {
        return modelo + " (" + ano + ") é um SUV robusto, ideal para família e estrada.";
    }

    @Override
    public String tipoMotor() {
        return "Motor 2.0 turbo";
    }
}
