package Questão5;

public abstract class FormaGeometrica { // Classe abstrata.
	int lado, altura;
	
	public FormaGeometrica(int lado, int altura) { // Construtor de FormaGeometrica. OBS: Não pode ser abstrato o construtor.
		this.lado = lado;
		this.altura = altura;
	}
	// Métodos abstratos.
	public abstract void area();
	public abstract void perimetro();

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}