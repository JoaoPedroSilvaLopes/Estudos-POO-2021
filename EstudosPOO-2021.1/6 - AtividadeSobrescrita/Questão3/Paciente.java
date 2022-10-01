package Questão3;

public class Paciente extends Pessoa { // Subclasse da classe Pessoa
	// Variáveis
	private String doença, medicação;
	private boolean terAlta, sentirDor;
	
	public Paciente(String doença, String medicação, boolean terAlta, boolean sentirDor) { // Construtor Paciente
		super("joão", "rua H", 'M', 47, 605, true); // Chamada do construtor da superclasse
		this.doença = doença;
		this.medicação = medicação;
		this.terAlta = terAlta;
		this.sentirDor = sentirDor;
	}
	
	public void ImprimirValores() { // Sobrescrita do Método ImprimirValores
		System.out.println("-----PACIENTE-----");
		super.ImprimirValores();
		System.out.println("Doença: "+doença+"\nMedicação: "+medicação+"\nTeve melhora: "+isTerAlta()+"\nTeve piora: "+isSentirDor()+"\n\n");
	}
	// Getters e Setters
	public String getDoença() {
		return doença;
	}
	public void setDoença(String doença) {
		this.doença = doença;
	}
	public String getMedicação() {
		return medicação;
	}
	public void setMedicação(String medicação) {
		this.medicação = medicação;
	}
	public boolean isTerAlta() {
		return terAlta;
	}
	public void setTerAlta(boolean terAlta) {
		this.terAlta = terAlta;
		if (terAlta = false) {
			System.out.println("Paciente não melhorou.");
		}
		else {
			System.out.println();
		}
	}
	public boolean isSentirDor() {
		return sentirDor;
	}
	public void setSentirDor(boolean sentirDor) {
		this.sentirDor = sentirDor;
		if (sentirDor = false) {
			System.out.println("Paciente não piorou.");
		}
		else {
			System.out.println("Paciente piorou");
		}
	}
}