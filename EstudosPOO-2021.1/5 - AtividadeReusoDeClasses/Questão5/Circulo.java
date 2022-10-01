package Quest�o5;

import java.text.DecimalFormat; // Para formatar e limitar as casas decimais dos resultado muito quebrados.

public class Circulo extends ObjetoGeometrico { // Heran�a entra a classe ObjetoGeometrico e a classe Circulo.
	
	private double raio, EixoX, EixoY; // Raio e coordenadas do centro do Circulo.
	DecimalFormat Formatter = new DecimalFormat("0.00"); // Vari�vel para restringir as casa decimais.
	
	Circulo(double raio, double EixoX, double EixoY) { // Construtor da classe Circulo.
		super(0, 0); // Construtor da classe pai
		this.raio = raio;
		this.EixoX = EixoX;
		this.EixoY = EixoY;
	}
	
	public void ObjetoGeometricoGen�rico() { // Sobrescri��o do m�todo ObjetoGeometricoGen�rico.
		System.out.println("�rea do c�rculo: "+Formatter.format((Math.PI) * raio * raio)+" cm^2"); // �rea circulo.
		System.out.println("Per�metro do c�rculo: "+Formatter.format(2 * (Math.PI) * raio)+" cm"); // Per�metro Circulo.
		System.out.println("A coordenada do centro: ("+EixoX+", "+EixoY+")"); // Coordenadas centro Circulo.
		System.out.println();
	}
	
	// GETTERS E SETTERS.
	public double getRaio() {
		return raio;
	}

	public double getEixoX() {
		return EixoX;
	}

	public void setEixoX(double eixoX) {
		EixoX = eixoX;
	}

	public double getEixoY() {
		return EixoY;
	}

	public void setEixoY(double eixoY) {
		EixoY = eixoY;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}