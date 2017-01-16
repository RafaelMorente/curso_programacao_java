package aula3;

import java.util.Scanner;

public class ImprimeNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		int quantidadePares = 0;
		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 0) {
				quantidadePares++;
			}
		}
		
	}
}
