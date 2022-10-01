package Questão5;

public class ObjetoGeometrico {
	
	private double base, altura; // Base e altura genéricas.
	
	ObjetoGeometrico(double base, double altura) { // Construtor da classe ObjetoGeometrico.
		this.base = base;
		this.altura = altura;
	}
	
	public void ObjetoGeometricoGenérico() { // Método ObjetoGeometricoGenérico.
		System.out.println("É um objeto geometrico 2D genérico.");
		System.out.println("Área ObjetoGeometrico: "+base * altura+" cm^2"); // Printar Área.
		System.out.println("Perímetro ObjetoGeometrico: "+2*(base + altura)+" cm"); // Printar Perímetro.
		System.out.println();
	}

	// GETTERS E SETTERS.
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}