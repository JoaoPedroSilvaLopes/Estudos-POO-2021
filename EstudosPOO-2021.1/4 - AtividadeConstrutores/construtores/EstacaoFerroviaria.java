package construtores;

public class EstacaoFerroviaria {
	private String Sigla, DescricaoEstacao;
	private LinhaFerroviaria linhaferroviaria;
	
	public EstacaoFerroviaria(String Sigla, String DescricaoEstacao, LinhaFerroviaria linhaferroviaria) {
		this.Sigla = Sigla;
		this.DescricaoEstacao = DescricaoEstacao;
		this.linhaferroviaria = linhaferroviaria;
		
		
		System.out.println("Esta��o ferroviaria constru�da:");
		System.out.println("");
		System.out.println("Possui "+LinhaFerroviaria.getTotalLinhaFerroviaria()+" linha(as) ferroviaria(as)");
		System.out.println("");
		linhaferroviaria.getTrem();
		linhaferroviaria.getTrem().getVagao();
		linhaferroviaria.getTrem().getLocomotiva();
		System.out.println(" - N�mero da linha ferroviaria: "+linhaferroviaria.getNumeroLinha()+", possui extensao de "+linhaferroviaria.getExtensaoMetros()+
				" metros de comprimento etem como fun��o "+linhaferroviaria.getDescricaoLinha()+".\n Possui "+Trem.getTotalTrem()+
				" trem nesta linha, "+Locomotiva.getTotalLocomotiva()+" locomotiva(as) e "+Vagao.getTotalVagao()+
				" vag�o(�es).");
	}
	
	public LinhaFerroviaria getLinhaferroviaria() {
		return linhaferroviaria;
	}

	public void setLinhaferroviaria(LinhaFerroviaria linhaferroviaria) {
		this.linhaferroviaria = linhaferroviaria;
	}

	public String getSigla() {
		return Sigla;
	}

	public void setSigla(String sigla) {
		Sigla = sigla;
	}

	public String getDescricaoEstacao() {
		return DescricaoEstacao;
	}

	public void setDescricaoEstacao(String descricaoEstacao) {
		DescricaoEstacao = descricaoEstacao;
	}
}