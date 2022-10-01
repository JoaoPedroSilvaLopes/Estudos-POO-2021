package Quest�o5;

public class Balao extends TransporteAereo {
	int pesoLargada;
	
	public Balao(int pesoLargada) {
		super(10);
		this.pesoLargada = pesoLargada;
		System.out.println("Tipo: "+nome+"\n# Altitude atual: "+altitudeActual+"\n# N�mero de passageiros totais: "+numeroPassageiro+
		"\n# Velocidade Atual: "+velocidadeActual+" Km/H\n# Peso de largada: "+pesoLargada);
		System.out.println("-------------------------------------");
		
		descer(10);
		estaParado();
		aquecerAr(20);
		largarPeso(5);
		subir(20);
		estaParado();
		
		System.out.println("");
	}
	// M�TODOS OK
	public void largarPeso(float peso) {
		System.out.println("# Peso do atual do bal�o: "+peso+" Kg");
		if (pesoLargada > 0) {
			System.out.println("# Peso largado: "+pesoLargada+" Kg");
			peso = peso - pesoLargada;
			System.out.println("# Peso do bal�o ap�s largar peso: "+peso+" Kg");
		}
		else if (pesoLargada == 0) {
			System.out.println("# Peso largado: "+pesoLargada+" Kg");
			System.out.println("# Peso do bal�o ap�s largar peso: "+peso+" Kg");
		}
	}
	
	public void aquecerAr(float temp) {
		System.out.println("# Temperatura do fogo do bal�o aqueceu para: "+temp+" �C");
	}
	
	@Override
	public void subir(int metros) {
		if (metros > 0) {
			System.out.println("# bal�o subiu: "+metros+" metros de altitude");
			altitudeActual = altitudeActual + metros;
		}
		else {
			System.out.println("# bal�o n�o subiu sua altitude");
		}
	}
	
	@Override
	public void descer(int metros) {
		if (metros > 0) {
			System.out.println("# bal�o desceu: "+metros+" metros de altutide");
			altitudeActual = altitudeActual - metros;
		}
		else {
			System.out.println("# bal�o n�o desceu sua altitude");
		}
	}
	
	@Override
	public boolean estaParado() {
		if (altitudeActual > 0) {
			System.out.println("# Bal�o N�o est� parado.");
			return false;
		}
		else {
			System.out.println("# Bal�o est� parado");
			return true;
		}
	}
}