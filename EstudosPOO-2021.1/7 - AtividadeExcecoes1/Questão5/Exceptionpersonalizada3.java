package Quest�o5;

public class Exceptionpersonalizada3 extends Exception {
	int n;
	
	public Exceptionpersonalizada3(int n) {
		this.n = n;
		System.out.println("Tamanho no n�mero inserido � inv�lido. Insira um n�mero de 8 ou 9 digitos.");
	}
}