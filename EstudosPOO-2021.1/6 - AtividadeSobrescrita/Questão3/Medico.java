package Quest�o3;

public class Medico extends Pessoa { // Subclasse da classe Pessoa
	// Vari�veis
	private int crm;
	private double sal�rio;
	private String especializa��o;
	private boolean podeDarPlantao;
	
	public Medico(int crm, double sal�rio, String especializa��o, boolean podeDarPlantao) { // Construtor Medico
		super("Maria", "rua B", 'F', 35, 733, false); // Chamada do construtor da superclasse
		this.crm = crm;
		this.sal�rio = sal�rio;
		this.especializa��o = especializa��o;
		this.podeDarPlantao = podeDarPlantao;	
	}
	
	public void ImprimirValores() { // Sobrescrita do M�todo ImprimirValores
		System.out.println("-----M�DICO-----");
		super.ImprimirValores();
		System.out.println("CRM: "+crm+"\nSal�rio: R$ "+sal�rio+"\nEspecializa��o: "+especializa��o+"\nPlant�o: "+podeDarPlantao+"\n\n");
	}
	// Getters e Setters
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public double getSal�rio() {
		return sal�rio;
	}
	public void setSal�rio(double sal�rio) {
		this.sal�rio = sal�rio;
	}
	public String getEspecializa��o() {
		return especializa��o;
	}
	public void setEspecializa��o(String especializa��o) {
		this.especializa��o = especializa��o;
	}
	public boolean isPodeDarPlantao() {
		return podeDarPlantao;
	}
	public void setPodeDarPlantao(boolean podeDarPlantao) {
		this.podeDarPlantao = podeDarPlantao;
		if (podeDarPlantao = false) {
			System.out.println("N�o ir� dar plant�o.");
		}
		else {
			System.out.println("Ir� dar plant�o.");
		}
	}
}