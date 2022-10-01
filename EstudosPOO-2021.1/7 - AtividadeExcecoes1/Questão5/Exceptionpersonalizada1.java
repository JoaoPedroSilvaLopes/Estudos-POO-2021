package Questão5;

public class Exceptionpersonalizada1 extends Exception {
	int n;
	
	public Exceptionpersonalizada1(int n) {
		this.n = n;
		System.out.println("Por favor, insira um nome válido.");
	}
}