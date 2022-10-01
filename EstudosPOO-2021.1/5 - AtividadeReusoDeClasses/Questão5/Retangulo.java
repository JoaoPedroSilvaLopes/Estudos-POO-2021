package Quest�o5;

public class Retangulo extends ObjetoGeometrico{ // Heran�a entra a classe ObjetoGeometrico e a classe Retangulo. 
	
	private double baseretangulo, alturaretangulo; // Base e Altura do retangulo.
	
	Retangulo(double baseretangulo, double alturaretangulo) { // Construtor da classe Retangulo.
		super(0, 0); // Construtor da classe pai.
		this.alturaretangulo = alturaretangulo;
		this.baseretangulo = baseretangulo;
	}
	
	public void ObjetoGeometricoGen�rico() { // Sobrescri��o do m�todo ObjetoGeometricoGen�rico.
		System.out.println("�rea retangulo: "+baseretangulo * alturaretangulo+" cm^2"); // �rea Retangulo.
		System.out.println("Per�metro retangulo: "+2*(baseretangulo + alturaretangulo)+" cm"); // Per�metro Retangulo.
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