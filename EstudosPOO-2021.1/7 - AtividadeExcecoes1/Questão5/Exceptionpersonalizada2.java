package Quest�o5;

public class Exceptionpersonalizada2 extends Exception {
	int n;
	
	public Exceptionpersonalizada2(int n) {
		this.n = n;
		System.out.println("Por favor, insira um DDD v�lido de dois digitos.");
	}
}