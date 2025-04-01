package br.com.bcoutinho;

public class FactoryFirst extends FactoryCar {

	   @Override
	    public Car createSUV() {
	        return new SUV_A();
	    }

	    @Override
	    public Car createSedan() {
	        return new Sedan_A();
	    }

}
