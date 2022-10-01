package Quest�o5;

public class Retangulo1 extends FormaGeometrica { // subclasse da superclasse abstrata FormaGeometrica.
	int A, P;
	
	public Retangulo1() {
		super(4, 2); // Chamada do construtor da superclasse.
		area();
		perimetro();
	}
	
	@Override // @Override para indicar uma sobrescrita de m�todo.
	public void area() { // M�todo area sobrescrito.
		A = getLado() * getAltura();
		System.out.println("�rea do retangulo �: "+A);
	}
	@Override // @Override para indicar uma sobrescrita de m�todo.
	public void perimetro() { // M�todo perimetro sobrescrito.
		P = (2 * getLado()) + (2 * getAltura());
		System.out.println("Per�metro do retangulo �: "+P);
	}
	
	public static void main(String[] args) { // M�todo main para teste
		new Retangulo1();
	}
}