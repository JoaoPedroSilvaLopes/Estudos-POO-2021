package Quest�o5;

// Todas as medidas ser�o em centrimetros.

public class Testeobjetosgeometricos {
	
	public static void main(String[] args) {
		
		ObjetoGeometrico objetogeometrico1 = new ObjetoGeometrico(2.0, 6.0);
		Retangulo retangulo1 = new Retangulo(3.0, 4.0);
		Triangulo triangulo1 = new Triangulo(2.0, 3.0, 7.0);
		Circulo circulo1 = new Circulo(3.5, 3.0, 4.0);
		
		objetogeometrico1.ObjetoGeometricoGen�rico();
		retangulo1.ObjetoGeometricoGen�rico();
		triangulo1.ObjetoGeometricoGen�rico();
		circulo1.ObjetoGeometricoGen�rico();
	}
}