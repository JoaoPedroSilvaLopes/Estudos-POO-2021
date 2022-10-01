package Questão5;

public class Bicicleta extends TransporteTerrestre implements Conduzivel {
	int numeroRaios;
	
	public Bicicleta(String tipo, int numeroRaios, int numeroPassageiro, int velocidadeActual) {
		super(tipo);
		this.numeroRaios = numeroRaios;
		
		System.out.println(nome+"\n# Nome do veículo: "+tipo+"\n# Número de passageiros totais: "+numeroPassageiro+
		"\n# Velocidade Atual: "+velocidadeActual+" Km/H\n# Número de raios: "+numeroRaios);
		System.out.println("-------------------------------------");
		
		estacionar();
		estaParado();
		pedalar();
		curvar(15);
		estaParado();
		
		System.out.println("");
	}
	// MÉTODOS OK
	public void pedalar() {
		velocidadeActual = velocidadeActual + 10;
		System.out.println("# Bicicleta está em movimento");
	}
	
	@Override
	public void curvar(float angulo) {
		System.out.println("# Bicicleta fez uma volta de: "+angulo+"°");
	}
	
	@Override
	public void estacionar() {
		velocidadeActual = 0;
		System.out.println("# Bicicleta esta estacionada");
	}
	
	@Override
	public boolean estaParado() {
		if (velocidadeActual > 0) {
			System.out.println("# bicicleta não está parado.");
			return false;
		}
		else {
			System.out.println("# bicicleta está parado");
			return true;
		}
	}
}