package Questão3;

public class Pessoa { // Superclasse
	// Variáveis
	private String nome, endereço;
	private char sexo;
	private int idade, cpf;
	private boolean podeAndar;

	public Pessoa(String nome, String endereço, char sexo, int idade, int cpf, boolean podeAndar) { // Construtor Pessoa
		this.nome = nome;
		this.endereço = endereço;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
		this.podeAndar = podeAndar;
	}
	
	public void ImprimirValores() { // Método ImprimirValores
		System.out.println("nome: "+nome+"\nendereço: "+endereço+"\nsexo: "+sexo+"\nidade: "+idade+"\ncpf: "+cpf+"\nlocomoção: "+podeAndar);
		System.out.println("----------------");
	}
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public boolean isPodeAndar() {
		return podeAndar;
	}
	public void setPodeAndar(boolean podeAndar) {
		this.podeAndar = podeAndar;
	}
}