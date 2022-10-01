package operadoressintexeparte3;

import javax.swing.JOptionPane;

public class Questão4 
{
	public static void main(String[] args)
	{
		String Fibonacci = JOptionPane.showInputDialog("Insira o número para ser o limite da sequencia: "); // Pedir para o usuário inserir um número.
		JOptionPane.showMessageDialog(null, "O número escolhido para ser o limite da sequencia foi:  "+Fibonacci);
		
		int FibonacciNumero = Integer.parseInt(Fibonacci); // Converter o número que esta em formato de String para Int para ser utilizado no laço for.
		
		int PrimeiroTermo = 0; // Primeiro termo.
		int ArmazenamentoDeValor; // Termo para armazenar o valor.
		
		System.out.print(PrimeiroTermo); // Print para imprimir o primeiro termo, pois ele é sempre necessario para iniciar a sequencia.

		for (int SegundoTermo = 1; SegundoTermo < FibonacciNumero;)
		{
			System.out.print(", "+SegundoTermo); // Printar o valor atual do SegundoTermo.
			
			ArmazenamentoDeValor = SegundoTermo; // Armazenamento guarda o valor do SegundoTermo.
			SegundoTermo = SegundoTermo + PrimeiroTermo; // Realizar a soma do SegundoTermo e o PrimeiroTermo.
			PrimeiroTermo = ArmazenamentoDeValor; // Primeiro termo recebe o valor do antigo SegundoTermo através da variavel de armazenamento.
		}
	}
}