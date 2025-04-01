package br.com.bcoutinho;

public class Costumers {

	    private FactoryCar factory;

	    public Costumers(FactoryCar factory) {
	        this.factory = factory; 
	    }

	    public void driveSUV() {
	        Car suv = factory.createSUV(); 
	        suv.drive(); 
	        suv.fuel();
	    }

	    public void driveSedan() {
	        Car sedan = factory.createSedan(); 
	        sedan.drive(); 
	        sedan.fuel();
	    }
	}

