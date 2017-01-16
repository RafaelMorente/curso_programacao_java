package aula3;

public class Carro {
	
	String marca;
	String modelo;
	String placa;
	int anodefabricacao;
	int velocidadeatual;

				
		public Carro (String marca, String modelo, String placa,
				int anodefabricacao) {
			
			this.marca = marca;
			this.modelo = modelo;
			this.placa = placa;
			this.anodefabricacao = anodefabricacao;
			this.velocidadeatual = 0;
		}
		
		public void acelerar() {
			velocidadeatual++;
			
		}
		
		public void frear() {
			if(velocidadeatual > 0) {
				velocidadeatual --;
			}
		}
}