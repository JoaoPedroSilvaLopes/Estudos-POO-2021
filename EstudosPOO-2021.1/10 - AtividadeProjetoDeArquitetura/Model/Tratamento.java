package Model;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.Livro;
import Controller.Produto;

public class Tratamento {

	public static void tratamento(int menu, ArrayList<Produto> teste, int numeroProduto) {
		String n, d, a, e; int i; double p;
		Scanner ler = new Scanner(System.in);
		
		switch (menu) {

			case 1: System.out.println("\n|---------CADASTRAR UM PRODUTO---------|");	
			System.out.println("# Nome do produto: "); n = ler.nextLine();
			System.out.println("# Descrição do produto: "); d = ler.nextLine();
			System.out.println("# Preço do produto: "); p = ler.nextDouble();
			teste.add(new Produto(n, d, p));
			break;
				
			case 2: System.out.println("\n|------------LISTAR PRODUTOS-----------|");
			for (Produto x: teste) {
				if (!(x instanceof Livro)) {
					System.out.println(numeroProduto+"° Produto: "+x);
					numeroProduto++;
				}
			}
			break;
			
			case 3: System.out.println("\n|------------CADASTRAR LIVRO-----------|");	
			System.out.println("# Nome do livro: "); n = ler.nextLine();
			System.out.println("# Descrição do livro: "); d = ler.nextLine();
			System.out.println("# Preço do livro: "); p = ler.nextDouble();
			System.out.println("# Autor(a/es/as) do livro:"); a = ler.next();
			System.out.println("# Editora do livro:"); e = ler.next();
			System.out.println("# ISNB do livro:"); i = ler.nextInt();
			teste.add(new Livro(n, d, p, a, e, i));
			break;
				
			case 4: System.out.println("\n|-------------LISTAR LIVROS------------|");
			for (Produto x: teste) {
				if (x instanceof Livro) {
					System.out.println(numeroProduto+"° Livro: "+x);
					numeroProduto++;
				}
			}
			break;
				
			case 5: System.out.println("\n|-------------IMPRIMIR TUDO------------|");
			for (Produto x: teste) {
				if (x instanceof Produto) {
					System.out.println(numeroProduto+"° Produto: "+x);
					numeroProduto++;
				}
			}
			break;
				
			case 6: System.out.println("\n|------------------SAIR----------------|");
			ler.close();
			break;
		}
	}
}