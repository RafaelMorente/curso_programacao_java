package aula2;

import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome1 = teclado.nextLine();
		double nota1 = teclado.nextDouble();
		double nota2 = teclado.nextDouble();
		double nota3 = teclado.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;

		// String resultado = media >= 7 ? "O aluno " + nome1 + " foi aprovado"
		// : "O aluno " + nome1 + " foi reprovado";

		if (media >= 7) {
			System.out.println(nome1 + " Aprovado");
		} else if (media >= 4) {
			System.out.println(nome1 + " Exame");
		}
		else {
			System.out.println(nome1 + " Reprovado");
			
		}
		teclado.close();
	}

}