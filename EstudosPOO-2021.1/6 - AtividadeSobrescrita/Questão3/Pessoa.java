package Quest�o3;

public class Pessoa { // Superclasse
	// Vari�veis
	private String nome, endere�o;
	private char sexo;
	private int idade, cpf;
	private boolean podeAndar;

	public Pessoa(String nome, String endere�o, char sexo, int idade, int cpf, boolean podeAndar) { // Construtor Pessoa
		this.nome = nome;
		this.endere�o = endere�o;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
		this.podeAndar = podeAndar;
	}
	
	public void ImprimirValores() { // M�todo ImprimirValores
		System.out.println("nome: "+nome+"\nendere�o: "+endere�o+"\nsexo: "+sexo+"\nidade: "+idade+"\ncpf: "+cpf+"\nlocomo��o: "+podeAndar);
		System.out.println("----------------");
	}
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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