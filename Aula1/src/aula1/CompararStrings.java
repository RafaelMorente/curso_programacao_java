package aula1;

import java.util.Scanner;

public class CompararStrings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome1 = teclado.nextLine();
		String nome2 = teclado.nextLine();
		boolean resultado = nome1.equals(nome2);
		
		System.out.println(resultado);
		teclado.close();
	}
}
