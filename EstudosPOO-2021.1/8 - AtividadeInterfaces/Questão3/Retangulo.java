package Quest�o3;

public class Retangulo implements DefaultMetodoTeste {
	int baseR, alturaR;
	
	public Retangulo(int baseR, int alturaR) {
		this.baseR = baseR;
		this.alturaR = alturaR;
		base();
		altura();
		System.out.println("");
	}
	@Override
	public void base() {
		System.out.println("Base do retangulo �: "+baseR);
	}
	@Override
	public void altura() {
		int areaR = baseR * alturaR;
		System.out.println("Altura do retangulo �: "+alturaR);
		System.out.println("�rea do retangulo �: "+areaR);
	}	
}