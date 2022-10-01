package construtores;

// Informar quantos recursos ferroviários existem: VAGOES, TRENS E LOCOMOTIVAS.

public class LinhaFerroviaria {
	private int NumeroLinha, ExtensaoMetros;
	private String DescricaoLinha;
	private Trem trem;
	private static int TotalLinhaFerroviaria = 0;
	
	public LinhaFerroviaria(int NumeroLinha, int ExtensaoMetros, String DescricaoLinha, Trem trem) {
		this.NumeroLinha = NumeroLinha;
		this.ExtensaoMetros = ExtensaoMetros;
		this.DescricaoLinha = DescricaoLinha;
		this.trem = trem;
		LinhaFerroviaria.TotalLinhaFerroviaria = LinhaFerroviaria.TotalLinhaFerroviaria + 1;
	}
	
	public int getNumeroLinha() {
		return NumeroLinha;
	}

	public static int getTotalLinhaFerroviaria() {
		return TotalLinhaFerroviaria;
	}

	public Trem getTrem() {
		return trem;
	}

	public void setTrem(Trem trem) {
		this.trem = trem;
	}

	public static void setTotalLinhaFerroviaria(int totalLinhaFerroviaria) {
		TotalLinhaFerroviaria = totalLinhaFerroviaria;
	}

	public void setNumeroLinha(int numeroLinha) {
		NumeroLinha = numeroLinha;
	}

	public int getExtensaoMetros() {
		return ExtensaoMetros;
	}

	public void setExtensaoMetros(int extensaoMetros) {
		ExtensaoMetros = extensaoMetros;
	}

	public String getDescricaoLinha() {
		return DescricaoLinha;
	}

	public void setDescricaoLinha(String descricaoLinha) {
		DescricaoLinha = descricaoLinha;
	}
}