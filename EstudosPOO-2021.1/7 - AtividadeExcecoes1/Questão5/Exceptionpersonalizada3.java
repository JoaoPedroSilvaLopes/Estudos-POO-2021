package Questão5;

public class Exceptionpersonalizada3 extends Exception {
	int n;
	
	public Exceptionpersonalizada3(int n) {
		this.n = n;
		System.out.println("Tamanho no número inserido é inválido. Insira um número de 8 ou 9 digitos.");
	}
}