package Quest�o3;

public class TesteAltera�aoParametros {
	
	public static void altera�ao(ClasseTeste classeteste1) { // M�todo para fazer a altera��o do parametro e se refletir fora do m�todo
		classeteste1.descri�ao = "Com altera��o.";
	}
	
	public static void main(String[] args) {
		ClasseTeste classeteste1 = new ClasseTeste("Sem altera��o.");
		System.out.println(classeteste1.descri�ao); // Sem altera��o
		altera�ao(classeteste1);
		System.out.println(classeteste1.descri�ao); // Depois da altera��o dentro do m�todo
	}
}