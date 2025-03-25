package br.com.bcoutinho;



public class Programa {

	public static void main(String[] args) {
		
		 PessoaFisica pf = new PessoaFisica("Leonardo", "Coutinho", "123.456.789-00");
	        pf.informacoesPessoais();
	        
	        
	     PessoaJuridica pj = new PessoaJuridica("Empresa LFC", "LTDA", "12.345.678/0001-00");
	        pj.informacoesPessoais();

	}

}
