package Quest�o3;

public class DataException extends Exception{
	int Dia, Mes, Ano;
	
	DataException(int Dia, int Mes, int Ano) {
		super();
		this.Dia = Dia;
		this.Mes = Mes;
		this.Ano = Ano;
	}

	public String toString() {
		return "DATA INV�LIDA: "+Dia+"/"+Mes+"/"+Ano;
	}
}