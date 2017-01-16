package aula4;

import java.util.Scanner;

public class ExemploArrays {

	public static void mains(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[3];
		
		System.out.println("Primeira nota: ");
		notas[0] = scanner.nextDouble();
		
		System.out.println("Segunda nota: ");
		notas[1] = scanner.nextDouble();
		
		System.out.println("Terceira nota: ");
		notas[2] = scanner.nextDouble();
		
		double media = (notas[0] + notas[1] + notas[2]) / 3;
		System.out.println("Média: " + media);
		
		scanner.close();
	}
}
