package aula2;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		int numero = new Random().nextInt(10) + 1;
		int numeroTentativas = 1;
				
		Scanner leitor = new Scanner(System.in);
		System.out.println("Chute um numero: ");
		int chute = leitor.nextInt();
		
		while (numero != chute) {
			System.out.println("Chute errado, tente novamente");
			numeroTentativas++;
			
			System.out.println("Chute um numero: ");
			chute = leitor.nextInt();
		}
		System.out.println("Parabéns, você acertou em "  + numeroTentativas + " tentativas");
	}
}
