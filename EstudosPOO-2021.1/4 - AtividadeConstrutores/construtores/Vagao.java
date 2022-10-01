package construtores;

public class Vagao {
	private int NumeroSerieVagao;
	private double CapacidadeCarga, ComprimentoTesteiras, ComprimentoEngates;
	private String TipoVagao;
	
	private static int TotalVagao = 0;
	
	public Vagao (int NumeroSerieVagao, double CapacidadeCarga, double ComprimentoTesteiras, String TipoVagao) {
		Vagao.TotalVagao = Vagao.TotalVagao + 1;
	}
	
	public static int getTotalVagao() {
		return TotalVagao;
	}
	
	public static void setTotalVagao(int totalVagao) {
		TotalVagao = totalVagao;
	}
	
	public int getNumeroSerieVagao() {
		return NumeroSerieVagao;
	}
	
	public void setNumeroSerieVagao(int numeroSerieVagao) {
		NumeroSerieVagao = numeroSerieVagao;
	}
	
	public double getCapacidadeCarga() {
		return CapacidadeCarga;
	}
	
	public void setCapacidadeCarga(double capacidadeCarga) {
		CapacidadeCarga = capacidadeCarga;
	}

	public double getComprimentoTesteiras() {
		return ComprimentoTesteiras;
	}

	public void setComprimentoTesteiras(double comprimentoTesteiras) {
		ComprimentoTesteiras = comprimentoTesteiras;
	}

	public double getComprimentoEngates() {
		return ComprimentoEngates;
	}

	public void setComprimentoEngates(double comprimentoEngates) {
		ComprimentoEngates = comprimentoEngates;
	}

	public String getTipoVagao() {
		return TipoVagao;
	}

	public void setTipoVagao(String tipoVagao) {
		TipoVagao = tipoVagao;
	}
}