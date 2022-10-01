package sobrecargademetodos;

public class Principal
{
	public static void main(String[] args) {
		
		Funcionario Funcionario1 = new Funcionario(); // Primeira instancia da classe Funcionário.
		
		Funcionario1.setNome("Alberto");
		Funcionario1.nome();
		
		Funcionario1.setSalario(600);
		Funcionario1.salarioMinimo();
		
		Funcionario1.setdataAdmissao("17/05/2017");
		Funcionario1.dataAdmissao();
		
		Funcionario1.setIdentificador(1);
		Funcionario1.identificador();
		
		Funcionario Funcionario2 = new Funcionario(); // Segunda instancia da classe Funcionário.
		
		Funcionario2.setNome("Beto");
		Funcionario2.nome();
		
		Funcionario2.setSalario(700);
		Funcionario2.salarioMinimo();
		
		Funcionario2.setdataAdmissao("18/05/2021");
		Funcionario2.dataAdmissao();
		
		Funcionario2.setIdentificador(2);
		Funcionario2.identificador();
		
		Funcionario Funcionario3 = new Funcionario(); // Terceira instancia da classe Funcionário.
		
		Funcionario3.setNome("Carlos");
		Funcionario3.nome();
		
		Funcionario3.setSalario(800);
		Funcionario3.salarioMinimo();
		
		Funcionario3.setdataAdmissao("03/02/2015");
		Funcionario3.dataAdmissao();
		
		Funcionario3.setIdentificador(3);
		Funcionario3.identificador();
	}
}