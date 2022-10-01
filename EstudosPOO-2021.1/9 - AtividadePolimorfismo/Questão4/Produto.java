package Questão4;

public class Produto {
	private String nome, descrição;
	private double preço;
	
	public Produto(String nome, String descrição, double preço) {
		this.nome = nome;
		this.descrição = descrição;
		this.preço = preço;
	}
	
	public String toString() {
		return "Produto: \n# Nome: "+nome+"\n# Descrição: "+descrição+"\n# Preço: R$ "+preço+"\n";
	}
	public boolean equals(Object o) {
		if (o instanceof Produto) {
			Produto x = (Produto)o;
			return x.nome == nome;
		}
		else {
			return false;
		}
	} 
	
	// # Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
}