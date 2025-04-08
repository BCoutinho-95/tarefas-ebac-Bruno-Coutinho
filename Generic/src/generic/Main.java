package generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Sedan("Toyota Corolla", 2022));
        carros.add(new SUV("Jeep Compass", 2023));
        carros.add(new Esportivo("Porsche 911", 2024));

        for (Carro carro : carros) {
            System.out.println(carro.descricao());
            System.out.println("Tipo de motor: " + carro.tipoMotor());
            System.out.println();
        }
    }
}