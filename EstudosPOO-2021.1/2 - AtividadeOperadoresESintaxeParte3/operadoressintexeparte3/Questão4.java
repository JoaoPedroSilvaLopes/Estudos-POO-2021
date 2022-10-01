package operadoressintexeparte3;

import javax.swing.JOptionPane;

public class Quest�o4 
{
	public static void main(String[] args)
	{
		String Fibonacci = JOptionPane.showInputDialog("Insira o n�mero para ser o limite da sequencia: "); // Pedir para o usu�rio inserir um n�mero.
		JOptionPane.showMessageDialog(null, "O n�mero escolhido para ser o limite da sequencia foi:  "+Fibonacci);
		
		int FibonacciNumero = Integer.parseInt(Fibonacci); // Converter o n�mero que esta em formato de String para Int para ser utilizado no la�o for.
		
		int PrimeiroTermo = 0; // Primeiro termo.
		int ArmazenamentoDeValor; // Termo para armazenar o valor.
		
		System.out.print(PrimeiroTermo); // Print para imprimir o primeiro termo, pois ele � sempre necessario para iniciar a sequencia.

		for (int SegundoTermo = 1; SegundoTermo < FibonacciNumero;)
		{
			System.out.print(", "+SegundoTermo); // Printar o valor atual do SegundoTermo.
			
			ArmazenamentoDeValor = SegundoTermo; // Armazenamento guarda o valor do SegundoTermo.
			SegundoTermo = SegundoTermo + PrimeiroTermo; // Realizar a soma do SegundoTermo e o PrimeiroTermo.
			PrimeiroTermo = ArmazenamentoDeValor; // Primeiro termo recebe o valor do antigo SegundoTermo atrav�s da variavel de armazenamento.
		}
	}
}