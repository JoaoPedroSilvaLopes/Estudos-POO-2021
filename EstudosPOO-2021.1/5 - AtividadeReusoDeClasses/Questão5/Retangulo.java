package Questão5;

public class Retangulo extends ObjetoGeometrico{ // Herança entra a classe ObjetoGeometrico e a classe Retangulo. 
	
	private double baseretangulo, alturaretangulo; // Base e Altura do retangulo.
	
	Retangulo(double baseretangulo, double alturaretangulo) { // Construtor da classe Retangulo.
		super(0, 0); // Construtor da classe pai.
		this.alturaretangulo = alturaretangulo;
		this.baseretangulo = baseretangulo;
	}
	
	public void ObjetoGeometricoGenérico() { // Sobrescrição do método ObjetoGeometricoGenérico.
		System.out.println("Área retangulo: "+baseretangulo * alturaretangulo+" cm^2"); // Área Retangulo.
		System.out.println("Perímetro retangulo: "+2*(baseretangulo + alturaretangulo)+" cm"); // Perímetro Retangulo.
		System.out.println();
	}
	
	// GETTERS E SETTERS.
	public double getBaseretangulo() {
		return baseretangulo;
	}

	public void setBaseretangulo(double baseretangulo) {
		this.baseretangulo = baseretangulo;
	}

	public double getAlturaretangulo() {
		return alturaretangulo;
	}

	public void setAlturaretangulo(double alturaretangulo) {
		this.alturaretangulo = alturaretangulo;
	}
}