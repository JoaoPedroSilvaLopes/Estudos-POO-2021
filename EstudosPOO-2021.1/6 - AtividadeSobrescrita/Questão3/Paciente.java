package Quest�o3;

public class Paciente extends Pessoa { // Subclasse da classe Pessoa
	// Vari�veis
	private String doen�a, medica��o;
	private boolean terAlta, sentirDor;
	
	public Paciente(String doen�a, String medica��o, boolean terAlta, boolean sentirDor) { // Construtor Paciente
		super("jo�o", "rua H", 'M', 47, 605, true); // Chamada do construtor da superclasse
		this.doen�a = doen�a;
		this.medica��o = medica��o;
		this.terAlta = terAlta;
		this.sentirDor = sentirDor;
	}
	
	public void ImprimirValores() { // Sobrescrita do M�todo ImprimirValores
		System.out.println("-----PACIENTE-----");
		super.ImprimirValores();
		System.out.println("Doen�a: "+doen�a+"\nMedica��o: "+medica��o+"\nTeve melhora: "+isTerAlta()+"\nTeve piora: "+isSentirDor()+"\n\n");
	}
	// Getters e Setters
	public String getDoen�a() {
		return doen�a;
	}
	public void setDoen�a(String doen�a) {
		this.doen�a = doen�a;
	}
	public String getMedica��o() {
		return medica��o;
	}
	public void setMedica��o(String medica��o) {
		this.medica��o = medica��o;
	}
	public boolean isTerAlta() {
		return terAlta;
	}
	public void setTerAlta(boolean terAlta) {
		this.terAlta = terAlta;
		if (terAlta = false) {
			System.out.println("Paciente n�o melhorou.");
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
			System.out.println("Paciente n�o piorou.");
		}
		else {
			System.out.println("Paciente piorou");
		}
	}
}