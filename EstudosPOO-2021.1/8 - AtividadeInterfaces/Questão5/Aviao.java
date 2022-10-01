package Questão5;

public class Aviao extends TransporteAereo implements Motorizado, Conduzivel {
	int numeroMotores;
	
	public Aviao(int numeroMotores) {
		super(23);
		this.numeroMotores = numeroMotores;
		System.out.println("Tipo: "+nome+"\n# Altitude atual: "+altitudeActual+"\n# Número de passageiros totais: "+numeroPassageiro+
		"\n# Velocidade Atual: "+velocidadeActual+" Km/H\n# Número de motores: "+numeroMotores);
		System.out.println("-------------------------------------");
		
		descer(20);
		estaParado();
		curvar(30);
		descer(3);
		estaParado();
		abastecer(20);
		ligarMotor();
		subir(40);
		
		System.out.println("");
		
	}
	// MÉTODOS OK
	@Override
	public void ligarMotor() {
		System.out.println("# Avião esta ligado");
	}
	
	@Override
	public void abastecer(int numLitros) {
		System.out.println("# Avião abastecido: "+numLitros+" Litros");
	}
	
	@Override
	public void curvar(float angulo) {
		System.out.println("# Avião fez uma volta de: "+angulo+"°");
	}
	
	@Override
	public void subir(int metros) {
		if (metros > 0) {
			System.out.println("# Avião subiu: "+metros+" metros de altitude");
			altitudeActual = altitudeActual + metros;
		}
		else {
			System.out.println("# Avião não subiu sua altitude");
		}
	}
	
	@Override
	public void descer(int metros) {
		if (metros > 0) {
			System.out.println("# Avião desceu: "+metros+" metros de altutide");
			altitudeActual = altitudeActual - metros;
		}
		else {
			System.out.println("# Avião não desceu sua altitude");
		}
	}
	
	@Override
	public boolean estaParado() {
		if (altitudeActual > 0) {
			System.out.println("# Avião Não está parado.");
			return false;
		}
		else {
			System.out.println("# Avião está parado");
			return true;
		}
	}
}