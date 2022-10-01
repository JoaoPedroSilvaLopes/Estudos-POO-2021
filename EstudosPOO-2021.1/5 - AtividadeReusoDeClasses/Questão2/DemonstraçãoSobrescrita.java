package Quest�o2;

class sobrescrita {
	
	public void metodo() {
		System.out.println("M�todo sem sobrescrita.");
	}
}

public class Demonstra��oSobrescrita extends sobrescrita{
	
	Demonstra��oSobrescrita() {
		super(); // Construtor vazio da classe pai.
		metodo(); // M�todo j� sobrescrito.
		super.metodo(); // M�todo sem sobrescrita pois possui super.metodo que se refere ao metodo da classe pai que nao foi sobrescrito.
	}
	
	public void metodo() {
		System.out.println("M�todo com sobrescrita.");
	}
	
	public static void main(String[] args) {
		new Demonstra��oSobrescrita();
	}
}