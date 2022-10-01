package Questão5;

import java.text.DecimalFormat; // Para formatar e limitar as casas decimais dos resultado muito quebrados.

public class Triangulo extends ObjetoGeometrico { // Herança entra a classe ObjetoGeometrico e a classe Triangulo.
	
	private double lado1, lado2, lado3, semiperimetro; // Lados e semiperimetro do Triangulo.
	DecimalFormat Formatter = new DecimalFormat("0.00"); // Variável para restringir as casa decimais.
	
	Triangulo(double lado1, double lado2, double lado3) { // Construtor da classe Triangulo.
		super(0, 0); // Construtor da classe pai
		this.lado1 = lado1;
		this.lado2 = lado3;
		this.lado3 = lado3;
	}
	
	public void ObjetoGeometricoGenérico() { // Sobrescrição do método ObjetoGeometricoGenérico.
		semiperimetro = (lado1 + lado2 + lado3) / 2;
		System.out.println("Área do triangulo: "
		+Formatter.format(Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado1) * (semiperimetro - lado3)))+" cm^2"); // Área Triangulo.
		System.out.println("Perímetro do triangulo: "+(lado1 + lado2 + lado3)+" cm"); // Perímetro Triangulo.
		System.out.println();
	}

	// GETTERS E SETTERS.
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getSemiperimetro() {
		return semiperimetro;
	}

	public void setSemiperimetro(double semiperimetro) {
		this.semiperimetro = semiperimetro;
	}
}