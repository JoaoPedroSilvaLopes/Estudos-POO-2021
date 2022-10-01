package Controller;

public class Livro extends Produto {
	private String autores, editora;
	int ISBN;
	
	public Livro(String nome, String descri��o, double pre�o, String autores, String editora, int ISBN) {
		super(nome, descri��o, pre�o);
		this.autores = autores;
		this.editora = editora;
		this.ISBN = ISBN;
	}
	
	public String toString() {
		return "\n# Nome: "+getNome()+"\n# Descri��o: "+getDescri��o()+"\n# Pre�o: "
				+getPre�o()+"\n# Autores: "+autores+"\n# Editora: "+editora+"\n# ISBN: "+ISBN+"\n";
	}
	public boolean equals(Object o) {
		if (o instanceof Livro) {
			Livro x = (Livro)o;
			return x.getNome() == getNome();
		}
		else {
			return false;
		}
	} 
	
	// # Getters e Setters
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
}