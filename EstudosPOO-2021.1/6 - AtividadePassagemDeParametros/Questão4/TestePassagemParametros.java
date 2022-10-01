package Quest�o4;

public class TestePassagemParametros {

	public static void imprimir(int...Valores) { // int � o tipo de par�metro que ser� aceito
		for (int valor: Valores) {
			System.out.print(valor); // Imprimir valores do array
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		// Impress�o do mesmo m�todo com quantidade de par�metros diferentes
		imprimir(1, 2, 3, 4);
		imprimir(1, 2, 3);
		imprimir(1, 2);
		imprimir(1);
	}
}