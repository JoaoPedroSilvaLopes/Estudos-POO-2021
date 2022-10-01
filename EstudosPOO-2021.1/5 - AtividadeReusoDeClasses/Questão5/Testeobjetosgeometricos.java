package Questão5;

// Todas as medidas serão em centrimetros.

public class Testeobjetosgeometricos {
	
	public static void main(String[] args) {
		
		ObjetoGeometrico objetogeometrico1 = new ObjetoGeometrico(2.0, 6.0);
		Retangulo retangulo1 = new Retangulo(3.0, 4.0);
		Triangulo triangulo1 = new Triangulo(2.0, 3.0, 7.0);
		Circulo circulo1 = new Circulo(3.5, 3.0, 4.0);
		
		objetogeometrico1.ObjetoGeometricoGenérico();
		retangulo1.ObjetoGeometricoGenérico();
		triangulo1.ObjetoGeometricoGenérico();
		circulo1.ObjetoGeometricoGenérico();
	}
}