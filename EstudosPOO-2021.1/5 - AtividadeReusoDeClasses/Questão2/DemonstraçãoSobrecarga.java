package Questão2;

public class DemonstraçãoSobrecarga {
		
	public void metodo() { // Método com parametros vazios.
		System.out.println("Método vazio. SOMA: 0"); 
	}
	
	public void metodo(int x, int y) { // Método com parametros inteiros.
		System.out.println("Método com números inteiros. SOMA: "+(x + y));
	}
	
	public static void main(String[] agrs) {
		
		DemonstraçãoSobrecarga demonstracao = new DemonstraçãoSobrecarga();
		
		demonstracao.metodo(); // Chamada do método com parametros vazios.
		demonstracao.metodo(1, 3); // Chamada do método com parametros inteiros.
	}
}