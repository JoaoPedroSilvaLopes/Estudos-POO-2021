package Quest�o3;

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
		System.out.println("Base do quadrado �: "+baseQ);
		System.out.println("�rea do quadrado �: "+areaQ);
	}
	/* 
	N�o h� necessidade de sobrescrever o m�todo altura, 
	pois um quadrado so precisa do valor da base
	e isto � poss�vel gra�as ao modificador default 
	que tira a obrigatoriedade de sobrescrever 
	todos os m�todos da interface 
	*/	
}