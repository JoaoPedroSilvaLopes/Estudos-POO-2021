package Questão5;

public abstract class Transporte {
	int numeroPassageiro, velocidadeActual;
	String nome;
	
	public Transporte (String nome, int numeroPassageiro, int velocidadeActual) {
		this.nome = nome;
		this.numeroPassageiro = numeroPassageiro;
		this.velocidadeActual = velocidadeActual;
	}
	// MÉTODOS OK
	public boolean estaParado() {

		return false;
	}
	public int getNumeroPassageiro() {
		return numeroPassageiro;
	}
	public void setNumeroPassageiro(int numeroPassageiro) {
		this.numeroPassageiro = numeroPassageiro;
	}
	public int getVelocidadeActual() {
		return velocidadeActual;
	}
	public void setVelocidadeActual(int velocidadeActual) {
		this.velocidadeActual = velocidadeActual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}