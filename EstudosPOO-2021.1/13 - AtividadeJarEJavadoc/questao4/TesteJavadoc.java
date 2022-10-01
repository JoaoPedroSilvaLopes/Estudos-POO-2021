package questao4;

	/**
	 *  Classe que � respons�vel pelo TesteJavadoc
	 *  
	 *  @author Jo�o pedro Silva Lopes
	 */

public class TesteJavadoc {
	/**
	 * 	V�riaveis lado e altura para calcular a �rea
	 */
	int lado, altura;
	
	/**
	 * 	Construtor da classe que recebe como par�metros 
	 * 	as vari�veis lado e altura, respectivamente.
	 */
	public TesteJavadoc(int lado, int altura) {
		this.lado = lado;
		this.altura = altura;
		area();
	}
	
	/**
	 * 	M�todo �rea que se utiliza dos valor lado e altura
	 * 	para realizar o c�lculo de uma �rea qualquer.
	 */
	public void area() {
		int area = lado * altura;
		System.out.println("A �rea �: "+area);
	}
	
	/**
	 * 	M�todo main com uma instancia da classe TesteJavadoc
	 * 	para imprimir a �rea no console.
	 */
	public static void main(String[] args) {
		new TesteJavadoc(3, 4);
	}
}