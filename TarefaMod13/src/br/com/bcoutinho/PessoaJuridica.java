package br.com.bcoutinho;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	public PessoaJuridica(String nome, String sobrenome, String cnpj) {
		super(nome, sobrenome);
		this.cnpj = cnpj;
	}

	

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	   @Override
	    public void informacoesPessoais() {
	        System.out.println("Pessoa Jurídica");
	        System.out.println("Nome da Empresa: " + getNome() + " " + getSobrenome());
	        System.out.println("CNPJ: " + getCnpj());
	    }
	

}
