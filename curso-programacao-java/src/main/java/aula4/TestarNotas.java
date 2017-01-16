package aula4;

import java.util.Scanner;

public class TestarNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantidade de alunos: ");
		int quantidadeAlunos = scanner.nextInt();
		scanner.nextLine();
		Aluno[] alunos = new Aluno[quantidadeAlunos];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Informe o nome: ");
			String nome = scanner.nextLine();
			Aluno aluno = new Aluno(nome);
			
		for(int j = 0; j < aluno.notas.length; j++) {
			System.out.println("Nota " + (j + 1) + " do aluno" + aluno);
			aluno.notas[j] = scanner.nextDouble();
			
		}
			
			alunos[i] = aluno;
		}
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno.nome);
		}
		
	scanner.close();
	}

}
