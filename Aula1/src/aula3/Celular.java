package aula3;

public class Celular {
	String modelo;
	String marca;
	String numeroSerie;

	Tela tela;
	Bateria bateria;

	public Celular(String modelo, String marca, String numeroSerie,
			Bateria bateria, Tela tela) {

		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.tela = tela;
		this.bateria = bateria;
	}

	public void ligar() {
		if (bateria.carga < 10) {
			System.out.println("Carga muito baixa!");
		} else {
			System.out.println("Ligando celular...!");
			tela.ligar();
		}
	}

	public void desligar() {
		System.out.println("Desligando celular...");
		tela.desligar();
	}

	public void carregar() {
		while (bateria.carga < bateria.capacidade) {
			bateria.carga++;
			System.out.println(bateria.carga + "%");

			pausar();
		}
		System.out.println("Carregado");
	}

	private void pausar() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
