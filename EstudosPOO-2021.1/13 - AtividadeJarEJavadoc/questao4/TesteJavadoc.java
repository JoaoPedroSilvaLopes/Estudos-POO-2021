package questao4;

	/**
	 *  Classe que é responsável pelo TesteJavadoc
	 *  
	 *  @author João pedro Silva Lopes
	 */

public class TesteJavadoc {
	/**
	 * 	Váriaveis lado e altura para calcular a área
	 */
	int lado, altura;
	
	/**
	 * 	Construtor da classe que recebe como parâmetros 
	 * 	as variáveis lado e altura, respectivamente.
	 */
	public TesteJavadoc(int lado, int altura) {
		this.lado = lado;
		this.altura = altura;
		area();
	}
	
	/**
	 * 	Método área que se utiliza dos valor lado e altura
	 * 	para realizar o cálculo de uma área qualquer.
	 */
	public void area() {
		int area = lado * altura;
		System.out.println("A área é: "+area);
	}
	
	/**
	 * 	Método main com uma instancia da classe TesteJavadoc
	 * 	para imprimir a área no console.
	 */
	public static void main(String[] args) {
		new TesteJavadoc(3, 4);
	}
}