package aula2;

import java.util.Scanner;

public class Par_ou_Impar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Nome do primeiro jogador: ");
		String nome1 = teclado.nextLine();

		System.out.println("Nome do segundo jogador: ");
		String nome2 = teclado.nextLine();

		System.out.println("Jogada do primeiro jogador: ");
		int jogador1 = teclado.nextInt();

		System.out.println("Jogada do segundo jogador: ");
		int jogador2 = teclado.nextInt();
		int soma = jogador1 + jogador2;

		String nomeVencedor = soma % 2 == 0 ? nome1 : nome2;

		System.out.println("O resultado do jogo foi " + soma + ". O jogador "
				+ nomeVencedor + " venceu!");
		teclado.close();

	}

}
