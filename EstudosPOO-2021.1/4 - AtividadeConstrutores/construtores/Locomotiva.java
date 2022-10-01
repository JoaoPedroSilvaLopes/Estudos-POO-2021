package construtores;

public class Locomotiva {
	private int NumeroSerieLocomotiva, CapacidadeTracao;
	private double ComprimentoLocomotiva;
	private static int TotalLocomotiva = 0;
	
	public Locomotiva(int NumeroSerieLocomotiva, int CapacidadeTracao, double ComprimentoLocomotiva) {
		Locomotiva.TotalLocomotiva = Locomotiva.TotalLocomotiva + 1;
	}
	
	public static int getTotalLocomotiva() {
		return TotalLocomotiva;
	}

	public static void setTotalLocomotiva(int totalLocomotiva) {
		TotalLocomotiva = totalLocomotiva;
	}

	public int getNumeroSerieLocomotiva() {
		return NumeroSerieLocomotiva;
	}

	public void setNumeroSerieLocomotiva(int numeroSerieLocomotiva) {
		NumeroSerieLocomotiva = numeroSerieLocomotiva;
	}

	public int getCapacidadeTracao() {
		return CapacidadeTracao;
	}

	public void setCapacidadeTracao(int capacidadeTracao) {
		CapacidadeTracao = capacidadeTracao;
	}

	public double getComprimentoLocomotiva() {
		return ComprimentoLocomotiva;
	}

	public void setComprimentoLocomotiva(double comprimentoLocomotiva) {
		ComprimentoLocomotiva = comprimentoLocomotiva;
	}
}