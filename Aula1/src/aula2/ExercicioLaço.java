package aula2;

import java.util.Scanner;

public class ExercicioLaço {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Primeiro time: ");
		String primeiroTime = scanner.nextLine();
		
		System.out.println("Segundo time: ");
		String segundoTime = scanner.nextLine();
		
		int quantidadeJogos = scanner.nextInt();
		int vitoriasPrimeiroTime = 0;
		int	vitoriasSegundoTime = 0;
		int	saldoGolsPrimeiroTime = 0;
		int	saldoGolsSegundoTime = 0;
		
		for (int i = 0; i < quantidadeJogos; i++) {
			System.out.println("Gols primeiro time: ");
			int golsPrimeiroTime = scanner.nextInt();
			
			System.out.println("Gols segundo time: ");
			int golsSegundoTime = scanner.nextInt();
			
			if (golsPrimeiroTime > golsSegundoTime) {
				
				vitoriasPrimeiroTime++;
				saldoGolsPrimeiroTime = golsPrimeiroTime - golsSegundoTime;
				saldoGolsSegundoTime = golsSegundoTime - golsPrimeiroTime;
				
			} else if (golsSegundoTime > golsPrimeiroTime) {
				vitoriasSegundoTime++;
			}
			System.out.println("Saldo de gols do primeiro time: " + saldoGolsPrimeiroTime);
			
		}
	}
}
