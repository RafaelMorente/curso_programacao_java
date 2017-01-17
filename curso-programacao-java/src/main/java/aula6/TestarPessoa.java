package aula6;

public class TestarPessoa {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Pessoa");
		PessoaFisica pessoaFisica = new PessoaFisica("Rafael", "000.000");
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Pessoa Juridica", "000");
		

		System.out.println(pessoa);
		System.out.println(pessoaFisica);
		System.out.println(pessoaJuridica);
	}

}
