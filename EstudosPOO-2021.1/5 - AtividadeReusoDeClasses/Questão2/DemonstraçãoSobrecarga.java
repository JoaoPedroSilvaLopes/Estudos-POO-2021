package Quest�o2;

public class Demonstra��oSobrecarga {
		
	public void metodo() { // M�todo com parametros vazios.
		System.out.println("M�todo vazio. SOMA: 0"); 
	}
	
	public void metodo(int x, int y) { // M�todo com parametros inteiros.
		System.out.println("M�todo com n�meros inteiros. SOMA: "+(x + y));
	}
	
	public static void main(String[] agrs) {
		
		Demonstra��oSobrecarga demonstracao = new Demonstra��oSobrecarga();
		
		demonstracao.metodo(); // Chamada do m�todo com parametros vazios.
		demonstracao.metodo(1, 3); // Chamada do m�todo com parametros inteiros.
	}
}