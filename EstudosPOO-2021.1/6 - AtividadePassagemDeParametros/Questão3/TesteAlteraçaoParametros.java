package Questão3;

public class TesteAlteraçaoParametros {
	
	public static void alteraçao(ClasseTeste classeteste1) { // Método para fazer a alteração do parametro e se refletir fora do método
		classeteste1.descriçao = "Com alteração.";
	}
	
	public static void main(String[] args) {
		ClasseTeste classeteste1 = new ClasseTeste("Sem alteração.");
		System.out.println(classeteste1.descriçao); // Sem alteração
		alteraçao(classeteste1);
		System.out.println(classeteste1.descriçao); // Depois da alteração dentro do método
	}
}