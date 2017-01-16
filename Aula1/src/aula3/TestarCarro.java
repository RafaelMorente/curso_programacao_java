package aula3;

public class TestarCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Uno", "BRA-0102", 2010);
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		
		carro.frear();

	}
	
}