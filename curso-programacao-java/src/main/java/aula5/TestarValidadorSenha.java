package aula5;

public class TestarValidadorSenha {

	public static void main(String[] args) {
		
		String senhaValida = "abc123456";
		String senhaMenorQueMinimo = "abc1";
		String senhaSemLetra = "123456";
		String senhaSemNumero = "abcdef";
		
		System.out.println(senhaValida + ": " + ValidadorSenha.valida(senhaValida));
		System.out.println(senhaMenorQueMinimo + ": " + ValidadorSenha.valida(senhaMenorQueMinimo));
		System.out.println(senhaSemLetra + ": " + ValidadorSenha.valida(senhaSemLetra));
		System.out.println(senhaSemNumero + ": " + ValidadorSenha.valida(senhaSemNumero));
	
		Usuario usuarioRafael = new Usuario("Rafael", "rafaelmorente@hotmail.com", "123abc");
		usuarioRafael.setSenha("a");
		System.out.println("Senha: " + usuarioRafael.getSenha());
		
		Usuario usuarioJoao = new Usuario("Joao", "joao@hotmail.com", "123abc");
		System.out.println("Senha: " + usuarioJoao.getSenha());
	}
}
