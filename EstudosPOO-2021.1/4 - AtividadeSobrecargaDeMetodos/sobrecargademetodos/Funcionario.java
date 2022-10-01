package sobrecargademetodos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Funcionario 
{
	// Atributos que nao devem entrar em contato com meio externo.
	private String nome, dataAdmissao;
	private double salario;
	private static int identificador;
	
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
		System.out.println("NOME FUNCIONÁRIO: "+this.getNome()); // Imprimir o nome do funcionário.
	}
	
	public void dataAdmissao() {
		this.getdataAdmissao();
		
		LocalDate DiaAtual = LocalDate.now(); // Data atual.
		DateTimeFormatter Formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formatador de data.
		LocalDate Data = LocalDate.parse(this.getdataAdmissao(), Formatado); // Data de admissao formatada.
		
		Period Periodo = Period.between(Data, DiaAtual); // Calcular a diferença de dias entre a data de admissao e a data atual.
		
		if (Periodo.getDays() >= 0) { // Caso a diferença de dias entre a data de admissao e data atual seja maior ou igual a zero, então a data de admissao é válida.
			System.out.println("DATA DE ADMISSAO: "+Data);
		}
		else { // Caso a diferença de dias entre a data de admissao e data atual seja menor que zero, então a data de admissao é inválida.
			System.out.println("DATA DE ADMISSAO: INVÁLIDA");
		}
	}
	
	public void salarioMinimo() {
		if (this.getSalario() >= 700) { // Caso o salário for maior ou igual a 700, é um salário válido.
			System.out.println("SALÁRIO: R$ "+this.getSalario());
		}
		else { // Se salário for menor que 700 é um salário inválido.
			System.out.println("SALÁRIO: INVÁLIDO");
		}
	}
	
	public void identificador() { 
		System.out.println("IDENTIFICADOR: "+this.getIdentificador()); // Imprimir o indentificador do funcionário.
		System.out.println();
	}	
	
	// AtividadeDeSobreCarga
	
	public void tirarFerias(int x) {
		if (x != 30) System.out.println("O funcionário irá tirar férias de "+x+" dias.\n");
		else tirarFerias();
	}
	
	public void tirarFerias() {
		System.out.println("O funcionário irá tirar um mês de férias.\n");
	}
}