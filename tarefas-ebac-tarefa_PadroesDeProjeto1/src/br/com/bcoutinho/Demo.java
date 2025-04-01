package br.com.bcoutinho;

public class Demo {
	
	 public static void main(String[] args) {
	        
	        FactoryCar factoryA = new FactoryFirst();
	        Costumers clientA = new Costumers(factoryA);
	        clientA.driveSUV();
	        clientA.driveSedan();

	   
	        FactoryCar factoryB = new FactorySecond();
	        Costumers clientB = new Costumers(factoryB);
	        clientB.driveSUV();
	        clientB.driveSedan();
	    }
}
