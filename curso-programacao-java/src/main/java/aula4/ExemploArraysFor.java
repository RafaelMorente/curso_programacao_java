package aula4;

import java.util.Scanner;

public class ExemploArraysFor {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[3];
		
		for(int i = 0; i < notas.length; i++) {
		System.out.println("Nota " + (i + 1) + ": ");
		notas[i] = scanner.nextDouble();
		}
		double soma = 0;
		for(int i = 0; i< notas.length; i++) {
			soma += notas[i];
		}
		double media = (notas[0] + notas[1] + notas[2]) / notas.length;
		System.out.println("Média: " + media);
		
		scanner.close();
	}
}
