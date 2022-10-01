package Questão2;

class sobrescrita {
	
	public void metodo() {
		System.out.println("Método sem sobrescrita.");
	}
}

public class DemonstraçãoSobrescrita extends sobrescrita{
	
	DemonstraçãoSobrescrita() {
		super(); // Construtor vazio da classe pai.
		metodo(); // Método já sobrescrito.
		super.metodo(); // Método sem sobrescrita pois possui super.metodo que se refere ao metodo da classe pai que nao foi sobrescrito.
	}
	
	public void metodo() {
		System.out.println("Método com sobrescrita.");
	}
	
	public static void main(String[] args) {
		new DemonstraçãoSobrescrita();
	}
}