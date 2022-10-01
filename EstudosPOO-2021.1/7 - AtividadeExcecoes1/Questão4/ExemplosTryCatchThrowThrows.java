package Questão4;

import java.util.Scanner;

public class ExemplosTryCatchThrowThrows {
	
	public static void main(String[] agrs) {
		
		Scanner ler = new Scanner(System.in);
		String lock = "SemVerificacao";

		while (lock == "SemVerificacao") { 
			System.out.println("Digite um número: ");
				
			try {
				int n = Integer.parseInt(ler.nextLine());
				System.out.println("O número digitado foi: "+n);
				lock = "Verificado";
			} 
				
			catch(Exception NaoENúmero) {
				System.out.println("Não é número.");
			} 
				
			finally {
				if (lock == "SemVerificacao") { 
					System.out.println("Exceção executada.");
				}
				else {
					System.out.println("Nenhuma exceção executada.");
					ler.close();
				}
			}
		}
	}
}