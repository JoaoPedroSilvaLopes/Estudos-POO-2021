package Questão5;

public class Exceptionpersonalizada2 extends Exception {
	int n;
	
	public Exceptionpersonalizada2(int n) {
		this.n = n;
		System.out.println("Por favor, insira um DDD válido de dois digitos.");
	}
}