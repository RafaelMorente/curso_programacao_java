package aula6Impressora;

public class TestarEquipamentos {
	
	public static void main(String[] args) {
		Cadeira cadeira = new Cadeira(500, "Fabricante", "madeira");
		Televisao televisao = new Televisao(3000, "Sony", 40);
		Impressora impressora = new Impressora(350, "HP", 100);
	
		System.out.println("Cadeira: " + cadeira.calcularPrecoFinal());
		System.out.println("Televisão: " + televisao.calcularPrecoFinal());
		System.out.println("Impressora: " + impressora.calcularPrecoFinal());
	}
}
