package View;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.Produto;
import Model.Tratamento;

public class Interação {
	
	public static void main(String[] args) {
		ArrayList<Produto> teste = new ArrayList<Produto>();
		int escolha = 1;
		while (escolha != 6) {
			Scanner ler = new Scanner(System.in);
			System.out.println("|------ESCOLHA O QUE DESEJA FAZER------|\n|# Digite 1 para: Cadastrar um produto.|"
			+"\n|# Digite 2 para: Listar Produtos.     |\n|# Digite 3 para: Cadastrar um livro   |\n|# Digite 4 para: Listar Livros.       |"
			+"\n|# Digite 5 para: Imprimir tudo.       |\n|# Digite 6 para: Sair.                |\n|--------------------------------------|");
			escolha = ler.nextInt();

			if (escolha > 0 && escolha < 7) {
				Tratamento.tratamento(escolha, teste, 1);
				if (escolha == 6) ler.close();
			}
		}
	}
}