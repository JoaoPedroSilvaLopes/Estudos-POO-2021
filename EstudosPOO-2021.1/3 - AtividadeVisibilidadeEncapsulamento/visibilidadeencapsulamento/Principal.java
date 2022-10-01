package visibilidadeencapsulamento;

public class Principal
{
	public static void main(String[] args) {
		
		Funcionario Funcionario1 = new Funcionario("Alberto", "17/05/2017", 600, 1); // Primeira instancia da classe Funcionário.
		System.out.println(Funcionario1);
		
		Funcionario Funcionario2 = new Funcionario("Beto", "18/05/2021", 700, 2); // Segunda instancia da classe Funcionário.
		System.out.println(Funcionario2);

		Funcionario Funcionario3 = new Funcionario("Carlos", "03/02/2015", 800, 3); // Terceira instancia da classe Funcionário.
		System.out.println(Funcionario3);
	}
}