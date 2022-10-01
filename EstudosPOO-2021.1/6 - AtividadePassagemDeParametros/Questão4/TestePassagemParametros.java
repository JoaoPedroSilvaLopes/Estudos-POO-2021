package Questão4;

public class TestePassagemParametros {

	public static void imprimir(int...Valores) { // int é o tipo de parâmetro que será aceito
		for (int valor: Valores) {
			System.out.print(valor); // Imprimir valores do array
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		// Impressão do mesmo método com quantidade de parâmetros diferentes
		imprimir(1, 2, 3, 4);
		imprimir(1, 2, 3);
		imprimir(1, 2);
		imprimir(1);
	}
}