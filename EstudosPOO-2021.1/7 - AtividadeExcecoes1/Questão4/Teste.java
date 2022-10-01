package Questão4;

import java.util.Scanner;

public class Teste {
	
	Scanner ler = new Scanner(System.in);
	
	public Teste() throws Exception { // Throws lançar tratamento fora do método original.
		
		System.out.println("# Insira um número maior do que zero: ");
		int n = Integer.parseInt(ler.nextLine());

		if (n > 0) { 
			System.out.println("# O número inserido é maior que zero.");
		}
		else {
			throw new Exception ("# O número inserido é menor ou igual a zero, Digite novamente."); // Throw lança a exceção para fora dos blocos externos do programa
		}
		
	}
	
	public static void main(String[] agrs) throws Exception {
		new Teste();
	}
}