package Quest�o4;

import java.util.Scanner;

public class Teste {
	
	Scanner ler = new Scanner(System.in);
	
	public Teste() throws Exception { // Throws lan�ar tratamento fora do m�todo original.
		
		System.out.println("# Insira um n�mero maior do que zero: ");
		int n = Integer.parseInt(ler.nextLine());

		if (n > 0) { 
			System.out.println("# O n�mero inserido � maior que zero.");
		}
		else {
			throw new Exception ("# O n�mero inserido � menor ou igual a zero, Digite novamente."); // Throw lan�a a exce��o para fora dos blocos externos do programa
		}
		
	}
	
	public static void main(String[] agrs) throws Exception {
		new Teste();
	}
}