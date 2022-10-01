package Questão3;

public class Data {
	public int dia, mes, ano;
	
	public Data(int dia, int mes, int ano) throws DataException {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		int lock = 0;
		
		// VERIFICAR ANO
		if (ano > 0) {
			System.out.println("Ano é: "+ano);
		}
		else {
			System.out.println("ERRO NO ANO");
			lock = 1;
		}
		
		// VERIFICAR MÊS
		if (mes > 0 && mes < 13) {
			System.out.println("Mês é: "+mes);
		}
		else {
			System.out.println("ERRO NO MES");
			lock = 1;
		}
		
		// VERIFICAR DIAS
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 0 && dia < 32)
			{
				System.out.println("Dia é: "+dia);
			}
			else {
				System.out.println("ERRO NO DIA");
				lock = 1;
			}
		}
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia > 0 && dia < 31)
			{
				System.out.println("Dia é: "+dia);
			}
			else {
				System.out.println("ERRO NO DIA");
				lock = 1;
			}
		}
		else {
			if (dia > 0 && dia < 29)
			{
				System.out.println("Dia é: "+dia);
			}
			else {
				System.out.println("ERRO NO DIA");
				lock = 1;
			}
		}
		
		if (lock == 0) {
			System.out.println("DATA: "+dia+"/"+mes+"/"+ano);
			System.out.println("");
		}
		else {
			throw new DataException(dia, mes, ano);
		}
	}
}