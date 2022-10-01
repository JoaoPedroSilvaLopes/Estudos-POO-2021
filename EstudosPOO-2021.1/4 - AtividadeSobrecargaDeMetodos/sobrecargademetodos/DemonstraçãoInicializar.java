package sobrecargademetodos;

public class DemonstraçãoInicializar { // Classe de demonstração da sobrecarga de métodos da classe Relogio.
	
	public static void main(String[] args) {
		
		Relogio relogioteste = new Relogio();
		
		relogioteste.inicializar(24); // Teste com a sobrecarga com 1 parametro.
		relogioteste.inicializar(27, 33); // Teste com a sobrecarga com 2 parametros.
		relogioteste.inicializar(24, 30, 48); // Teste com a sobrecarga com o 3 parametros.
	}
}