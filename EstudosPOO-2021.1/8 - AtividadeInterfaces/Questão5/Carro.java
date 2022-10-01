package Questão5;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
	int numeroCilindrada;
	
	public Carro(String tipo, int numeroCilindrada, int numeroPassageiro, int velocidadeActual) {
		super(tipo);
		this.numeroCilindrada = numeroCilindrada;
		
		System.out.println(nome+"\n# Nome do veículo: "+tipo+"\n# Número de passageiros totais: "+numeroPassageiro+
		"\n# Velocidade Atual: "+velocidadeActual+" Km/H\n# Número de cilindradas: "+numeroCilindrada);
		System.out.println("-------------------------------------");
		
		estacionar();
		estaParado();
		abastecer(20);
		ligarMotor();
		embraiar();
		curvar(20);
		
		System.out.println("");
	}
	// MÉTODOS OK
	public void embraiar() {
		velocidadeActual = velocidadeActual + 20;
		System.out.println("# Carro esta em movimento");
	}
	
	@Override
	public void ligarMotor() {
		System.out.println("# Carro esta ligado");
	}
	
	@Override
	public void abastecer(int numLitros) {
		System.out.println("# Carro abastecido: "+numLitros+" Litros");
	}
	
	@Override
	public void curvar(float angulo) {
		System.out.println("# Carro fez uma volta de: "+angulo+"°");
	}
	
	@Override
	public void estacionar() {
		velocidadeActual = 0;
		System.out.println("# Carro esta estacionado");
	}
	
	@Override
	public boolean estaParado() {
		if (velocidadeActual > 0) {
			System.out.println("# Carro Não está parado.");
			return false;
		}
		else {
			System.out.println("# Carro está parado");
			return true;
		}
	}
}