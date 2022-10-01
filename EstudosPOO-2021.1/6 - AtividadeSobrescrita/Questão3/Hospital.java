package Quest�o3;

public class Hospital { // Classe independente de heran�a
	// Vari�veis
	private String nomeHospital;
	private Paciente paciente;
	private Medico medico;
	
	public Hospital(String nomeHospital, Paciente paciente, Medico medico) { // Construtor Hospital
		this.nomeHospital = nomeHospital;
		this.paciente = paciente;
		this.medico = medico;
		criacaoHospital();
	}
	
	public void criacaoHospital() { // M�todo cria��o do hospital
		System.out.println("Nome do Hospital: "+nomeHospital+"\n");
		paciente.ImprimirValores();
		medico.ImprimirValores();
	}
	// Getters e Setters
	public String getNomeHospital() {
		return nomeHospital;
	}
	public void setNomeHospital(String nomeHospital) {
		this.nomeHospital = nomeHospital;
	}
	
	public static void main(String[] args) { // M�todo main
		Paciente paciente1 = new Paciente("dor nas costas", "dipirona", true, false);
		Medico medico1 = new Medico(150, 1500, "Cadiologista", false);
		new Hospital("Frota", paciente1, medico1);	
	}
}