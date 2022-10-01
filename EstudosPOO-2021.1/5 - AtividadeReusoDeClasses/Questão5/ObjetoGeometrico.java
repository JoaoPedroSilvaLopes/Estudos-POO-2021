package Quest�o5;

public class ObjetoGeometrico {
	
	private double base, altura; // Base e altura gen�ricas.
	
	ObjetoGeometrico(double base, double altura) { // Construtor da classe ObjetoGeometrico.
		this.base = base;
		this.altura = altura;
	}
	
	public void ObjetoGeometricoGen�rico() { // M�todo ObjetoGeometricoGen�rico.
		System.out.println("� um objeto geometrico 2D gen�rico.");
		System.out.println("�rea ObjetoGeometrico: "+base * altura+" cm^2"); // Printar �rea.
		System.out.println("Per�metro ObjetoGeometrico: "+2*(base + altura)+" cm"); // Printar Per�metro.
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