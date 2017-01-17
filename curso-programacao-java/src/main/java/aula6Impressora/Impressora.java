package aula6Impressora;

public class Impressora extends Eletronico {
	
	private int dpi;
	
	public Impressora(double preco, String fabricante, int dpi) {
		super(preco, fabricante);
		this.dpi = dpi;
		
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	
	}
}
