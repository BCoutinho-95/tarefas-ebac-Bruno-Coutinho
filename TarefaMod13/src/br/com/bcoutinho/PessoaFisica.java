package br.com.bcoutinho;

public class PessoaFisica extends Pessoa {
	

	private String cpf;
	
	public PessoaFisica(String nome, String sobrenome, String cpf) {
	        super(nome, sobrenome);
	        this.cpf = cpf;
	    }


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String string) {
		this.cpf = string;
	}

	@Override
	 public void informacoesPessoais() {
        System.out.println("Pessoa Física");
        System.out.println("Nome Completo: " + getNome() + " " + getSobrenome());
        System.out.println("CPF: " + getCpf());
    }
	

}
