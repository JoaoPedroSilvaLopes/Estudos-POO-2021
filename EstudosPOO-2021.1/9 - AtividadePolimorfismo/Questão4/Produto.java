package Quest�o4;

public class Produto {
	private String nome, descri��o;
	private double pre�o;
	
	public Produto(String nome, String descri��o, double pre�o) {
		this.nome = nome;
		this.descri��o = descri��o;
		this.pre�o = pre�o;
	}
	
	public String toString() {
		return "Produto: \n# Nome: "+nome+"\n# Descri��o: "+descri��o+"\n# Pre�o: R$ "+pre�o+"\n";
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
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
}