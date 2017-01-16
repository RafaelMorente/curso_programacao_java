package televisao;

public class Televisao {
	
	public void ligar() {
		System.out.println("ligar");
		
		ajustarVoltagem();
		regularDiodo();
		ligarTela();
	}
	
	public void desligar() {
		System.out.println("desligar");
	}
	
	public void aumentarVolume() {
		System.out.println("aumentar volume");
	}

	public void diminuiVolume() {
		System.out.println("diminuir volume");
	}
	
	private void ajustarVoltagem() {
		System.out.println("ajustar voltagem");
	}
	
	public void aumentarCanal() {
		System.out.println("aumentar canal");
	}
	
	public void diminuirCanal() {
		System.out.println("diminuir canal");
	}
	
	public void ligarTela() {
		System.out.println("ligar tela");
	}
	
	private void regularDiodo() {
		System.out.println("regular diodo");
	}
}
