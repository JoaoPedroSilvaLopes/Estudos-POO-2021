package Questão5;

import java.util.Scanner;

public class Cadastro {
	String nomeCompleto;
	int dddTelefone, numeroTelefone, tamanho, lock = 0;
	
	Scanner KeyBoard = new Scanner(System.in);
	
	public Cadastro() throws Exception {
		
		while (lock == 0) {
			try {
				System.out.println("# Insira seu nome: ");
				nomeCompleto = KeyBoard.nextLine();
				tamanho = String.valueOf(nomeCompleto).length();
				
				if (tamanho == 0)
				{
					throw new Exceptionpersonalizada1(tamanho);
				}
				System.out.println("# Nome cadastrado: "+nomeCompleto+"\n");
				lock = 1;
			}
			catch(Exceptionpersonalizada1 e) {}
		} lock = 0;
		
		while (lock == 0) {
			
			try {
				System.out.println("# Insira seu DDD: ");
				dddTelefone = Integer.parseInt(KeyBoard.nextLine());
				tamanho = String.valueOf(dddTelefone).length();
				
				if (tamanho != 2)
				{
					throw new Exceptionpersonalizada2(tamanho);
				}
				System.out.println("# DDD cadastrado: "+dddTelefone+"\n");
				lock = 1;
			}
			catch (IllegalArgumentException | Exceptionpersonalizada2 e) {}
			
			
		} lock = 0;
		
		while (lock == 0) {
			
			try {
				System.out.println("# Insira seu Número: ");
				numeroTelefone = Integer.parseInt(KeyBoard.nextLine());	
				tamanho = String.valueOf(numeroTelefone).length();
				
				if (tamanho < 8 || tamanho > 9)
				{
					throw new Exceptionpersonalizada3(tamanho);
				}
				System.out.println("# Número cadastrado: "+numeroTelefone+"\n");
				lock = 1;
				
			}
			catch (IllegalArgumentException | Exceptionpersonalizada3 e) {}
		}
		System.out.println("# Nome: "+nomeCompleto+"\n# Número de telefone: "+dddTelefone+" "+numeroTelefone);
	}
	
	public static void main(String[] args) throws Exception {
		new Cadastro();
	}
}