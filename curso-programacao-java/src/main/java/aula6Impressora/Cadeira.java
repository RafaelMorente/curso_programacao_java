package aula6Impressora;

public class Cadeira extends Equipamento {
	
	private String material;
	
	public Cadeira(double preco, String fabricante, String material) {
		super(preco, fabricante);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

}
