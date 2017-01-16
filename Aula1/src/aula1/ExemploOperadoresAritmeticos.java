package aula1;

import java.util.Scanner;

public class ExemploOperadoresAritmeticos {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Resultado: ");
		int numero1 = teclado.nextInt();
		int numero2 = teclado.nextInt();
				
		int resultadoSoma = numero1 + numero2;
		int resultadoSub = numero1 - numero2;
		int resultadoMult = numero1 * numero2;
		int resultadoDiv = numero1 / numero2;
		int resultadoResto = numero1 % numero2;
		
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));
		teclado.close();
		
	}

}
