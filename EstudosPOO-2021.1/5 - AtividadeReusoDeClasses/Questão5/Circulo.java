package Questão5;

import java.text.DecimalFormat; // Para formatar e limitar as casas decimais dos resultado muito quebrados.

public class Circulo extends ObjetoGeometrico { // Herança entra a classe ObjetoGeometrico e a classe Circulo.
	
	private double raio, EixoX, EixoY; // Raio e coordenadas do centro do Circulo.
	DecimalFormat Formatter = new DecimalFormat("0.00"); // Variável para restringir as casa decimais.
	
	Circulo(double raio, double EixoX, double EixoY) { // Construtor da classe Circulo.
		super(0, 0); // Construtor da classe pai
		this.raio = raio;
		this.EixoX = EixoX;
		this.EixoY = EixoY;
	}
	
	public void ObjetoGeometricoGenérico() { // Sobrescrição do método ObjetoGeometricoGenérico.
		System.out.println("Área do círculo: "+Formatter.format((Math.PI) * raio * raio)+" cm^2"); // Área circulo.
		System.out.println("Perímetro do círculo: "+Formatter.format(2 * (Math.PI) * raio)+" cm"); // Perímetro Circulo.
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