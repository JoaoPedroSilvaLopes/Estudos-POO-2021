package visibilidadeencapsulamento;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Funcionario 
{
	private String nome, dataAdmissao;
	private double salario;
	private static int identificador;
	
	public Funcionario(String nome, String dataAdmissao, double salario, int identificador) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		Funcionario.identificador = identificador;
	}
	
	public String toString() {
		return "Nome: "+nome+"\nData de admiss�o: "+dataAdmissao+"\nSal�rio: "+salario+"\nIdentificador: "+identificador+"\n";
	}
	
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getdataAdmissao() {
		return this.dataAdmissao;
	}
	public void setdataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public int getIdentificador() {
		return Funcionario.identificador;
	}
	public void setIdentificador(int identificador) {
		Funcionario.identificador = identificador;
	}
	public void nome() { 
		System.out.println("NOME FUNCION�RIO: "+this.getNome()); // Imprimir o nome do funcion�rio.
	}
	public void dataAdmissao() {
		this.getdataAdmissao();
		
		LocalDate DiaAtual = LocalDate.now(); // Data atual.
		DateTimeFormatter Formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formatador de data.
		LocalDate Data = LocalDate.parse(this.getdataAdmissao(), Formatado); // Data de admissao formatada.
		
		Period Periodo = Period.between(Data, DiaAtual); // Calcular a diferen�a de dias entre a data de admissao e a data atual.
		
		if (Periodo.getDays() >= 0) { // Caso a diferen�a de dias entre a data de admissao e data atual seja maior ou igual a zero, ent�o a data de admissao � v�lida.
			System.out.println("DATA DE ADMISSAO: "+Data);
		}
		else { // Caso a diferen�a de dias entre a data de admissao e data atual seja menor que zero, ent�o a data de admissao � inv�lida.
			System.out.println("DATA DE ADMISSAO: INV�LIDA");
		}
	}
	public void salarioMinimo() {
		if (this.getSalario() >= 700) { // Caso o sal�rio for maior ou igual a 700, � um sal�rio v�lido.
			System.out.println("SAL�RIO: R$ "+this.getSalario());
		}
		else { // Se sal�rio for menor que 700 � um sal�rio inv�lido.
			System.out.println("SAL�RIO: INV�LIDO");
		}
	}
	public void identificador() { 
		System.out.println("IDENTIFICADOR: "+this.getIdentificador()); // Imprimir o indentificador do funcion�rio.
		System.out.println();
	}	
}