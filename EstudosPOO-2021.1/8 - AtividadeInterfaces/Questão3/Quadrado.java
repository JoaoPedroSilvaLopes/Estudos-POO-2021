package Questão3;

public class Quadrado implements DefaultMetodoTeste {
	int baseQ;
	
	public Quadrado(int baseQ) {
		this.baseQ = baseQ;
		base();
		System.out.println("");
	}
	@Override
	public void base() {
		int areaQ = baseQ * baseQ;
		System.out.println("Base do quadrado é: "+baseQ);
		System.out.println("Área do quadrado é: "+areaQ);
	}
	/* 
	Não há necessidade de sobrescrever o método altura, 
	pois um quadrado so precisa do valor da base
	e isto é possível graças ao modificador default 
	que tira a obrigatoriedade de sobrescrever 
	todos os métodos da interface 
	*/	
}