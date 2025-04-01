package br.com.bcoutinho;

public class FactorySecond extends FactoryCar {

	 @Override
	    public Car createSUV() {
	        return new SUV_B();
	    }

	    @Override
	    public Car createSedan() {
	        return new Sedan_B();
	    }

}
