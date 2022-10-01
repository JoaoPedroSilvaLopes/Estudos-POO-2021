package sobrecargademetodos;

public class DemonstraçãoTirarFerias {
	
	public static void main(String[] args) {
	
		Funcionario funcionarioferias = new Funcionario(); // Primeira instancia da classe Funcionário.
		Relogio testeRelogio = new Relogio();
		
		funcionarioferias.tirarFerias();
		funcionarioferias.tirarFerias(30);
		funcionarioferias.tirarFerias(40);
		
		testeRelogio.inicializar(20, 30, 43);
		testeRelogio.inicializar(20, 30, 0);
		testeRelogio.inicializar(20);
		
		testeRelogio.inicializar(20, 30);
		testeRelogio.inicializar(20, 0);
		
		testeRelogio.inicializar(20);
	}	
}