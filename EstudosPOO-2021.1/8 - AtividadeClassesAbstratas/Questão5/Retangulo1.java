package Questão5;

public class Retangulo1 extends FormaGeometrica { // subclasse da superclasse abstrata FormaGeometrica.
	int A, P;
	
	public Retangulo1() {
		super(4, 2); // Chamada do construtor da superclasse.
		area();
		perimetro();
	}
	
	@Override // @Override para indicar uma sobrescrita de método.
	public void area() { // Método area sobrescrito.
		A = getLado() * getAltura();
		System.out.println("Área do retangulo é: "+A);
	}
	@Override // @Override para indicar uma sobrescrita de método.
	public void perimetro() { // Método perimetro sobrescrito.
		P = (2 * getLado()) + (2 * getAltura());
		System.out.println("Perímetro do retangulo é: "+P);
	}
	
	public static void main(String[] args) { // Método main para teste
		new Retangulo1();
	}
}