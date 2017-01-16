package aula1;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Resultado: ");
		int numero = teclado.nextInt();
		
		int resto = numero%2;
		String resultado = resto == 0 ? "Par": "Impar";
		
		System.out.println(resultado);
		teclado.close();
	}
}
