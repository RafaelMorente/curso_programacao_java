package aula6Impressora;

public class Eletronico extends Equipamento {
	
	public Eletronico(double preco, String fabricante) {
		super(preco, fabricante);
		
	}

	public double calcularPrecoFinal() {
		return super.calcularPrecoFinal() * 1.10;
	}
}
