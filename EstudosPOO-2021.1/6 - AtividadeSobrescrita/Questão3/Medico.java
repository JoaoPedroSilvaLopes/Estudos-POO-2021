package Questão3;

public class Medico extends Pessoa { // Subclasse da classe Pessoa
	// Variáveis
	private int crm;
	private double salário;
	private String especialização;
	private boolean podeDarPlantao;
	
	public Medico(int crm, double salário, String especialização, boolean podeDarPlantao) { // Construtor Medico
		super("Maria", "rua B", 'F', 35, 733, false); // Chamada do construtor da superclasse
		this.crm = crm;
		this.salário = salário;
		this.especialização = especialização;
		this.podeDarPlantao = podeDarPlantao;	
	}
	
	public void ImprimirValores() { // Sobrescrita do Método ImprimirValores
		System.out.println("-----MÉDICO-----");
		super.ImprimirValores();
		System.out.println("CRM: "+crm+"\nSalário: R$ "+salário+"\nEspecialização: "+especialização+"\nPlantão: "+podeDarPlantao+"\n\n");
	}
	// Getters e Setters
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public double getSalário() {
		return salário;
	}
	public void setSalário(double salário) {
		this.salário = salário;
	}
	public String getEspecialização() {
		return especialização;
	}
	public void setEspecialização(String especialização) {
		this.especialização = especialização;
	}
	public boolean isPodeDarPlantao() {
		return podeDarPlantao;
	}
	public void setPodeDarPlantao(boolean podeDarPlantao) {
		this.podeDarPlantao = podeDarPlantao;
		if (podeDarPlantao = false) {
			System.out.println("Não irá dar plantão.");
		}
		else {
			System.out.println("Irá dar plantão.");
		}
	}
}