package Quest�o4;

import java.util.Scanner;

public class ExemplosTryCatchThrowThrows {
	
	public static void main(String[] agrs) {
		
		Scanner ler = new Scanner(System.in);
		String lock = "SemVerificacao";

		while (lock == "SemVerificacao") { 
			System.out.println("Digite um n�mero: ");
				
			try {
				int n = Integer.parseInt(ler.nextLine());
				System.out.println("O n�mero digitado foi: "+n);
				lock = "Verificado";
			} 
				
			catch(Exception NaoEN�mero) {
				System.out.println("N�o � n�mero.");
			} 
				
			finally {
				if (lock == "SemVerificacao") { 
					System.out.println("Exce��o executada.");
				}
				else {
					System.out.println("Nenhuma exce��o executada.");
					ler.close();
				}
			}
		}
	}
}