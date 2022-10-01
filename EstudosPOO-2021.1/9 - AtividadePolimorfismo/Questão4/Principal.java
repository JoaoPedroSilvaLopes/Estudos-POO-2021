package Questão4;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<Produto> teste = new ArrayList<Produto>();
		int menu;
		do {
			menu = Menu();
			int i = 1;
			if (menu > 0 && menu < 7) {
				Scanner ler = new Scanner(System.in);
				switch (menu) {	
				
					case 1: System.out.println("\n|---------CADASTRAR UM PRODUTO---------|");
					System.out.println("# Nome do produto: "); String n = ler.nextLine();
					System.out.println("# Descrição do produto: "); String d = ler.nextLine();
					System.out.println("# Preço do produto: "); double p = ler.nextDouble();
					teste.add(new Produto(n, d, p));
					break;
					
					case 2: System.out.println("\n|------------LISTAR PRODUTOS-----------|");
					for (Produto x: teste) {
						if (!(x instanceof Livro)) {
							System.out.println("Produto "+i+": "+x);
							i++;
						}
					}
					break;
					
					case 3: System.out.println("\n|------------CADASTRAR LIVRO-----------|");
					System.out.println("# Nome do livro: "); String n1 = ler.nextLine();
					System.out.println("# Descrição do livro: "); String d1 = ler.nextLine();
					System.out.println("# Preço do livro: "); double p1 = ler.nextDouble();
					System.out.println("# Autor(a/es/as) do livro:"); String a1 = ler.next();
					System.out.println("# Editora do livro:"); String e1 = ler.next();
					System.out.println("# ISNB do livro:"); int i1 = ler.nextInt();
					teste.add(new Livro(n1, d1, p1, a1, e1, i1));
					break;
					
					case 4: System.out.println("\n|-------------LISTAR LIVROS------------|");
					for (Produto x: teste) {
						if (x instanceof Livro) {
							System.out.println("Produto "+i+": "+x);
							i++;
						}
					}
					break;
					
					case 5: System.out.println("\n|-------------IMPRIMIR TUDO------------|");
					for (Produto x: teste) {
						if (x instanceof Produto) {
							System.out.println("Produto "+i+": "+x);
							i++;
						}
					}
					break;
					
					case 6: System.out.println("\n|------------------SAIR----------------|");
					ler.close();
					break;
				}
			}
			else
				System.out.println("Entrada inválida. Tente de novo.");
		} while (menu != 6);
	}
	public static int Menu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("|------ESCOLHA O QUE DESEJA FAZER------|\n|# Digite 1 para: Cadastrar um produto.|"
		+"\n|# Digite 2 para: Listar Produtos.     |\n|# Digite 3 para: Cadastrar um livro   |\n|# Digite 4 para: Listar Livros.       |"
		+"\n|# Digite 5 para: Imprimir tudo.       |\n|# Digite 6 para: Sair.                |\n|--------------------------------------|");
		
		int escolha = ler.nextInt();
		if (escolha == 6) {
			ler.close();
		}
		return escolha;
	}
}