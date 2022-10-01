package construtores;

import java.util.Date;
import java.text.SimpleDateFormat;

// Informar quantos vagões e locomotivas o trem possui

public class Trem {
	
	SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
	
	private String PrefixoTrem, EstacaoOrigem, EstacaoDestino;
	private Date DataCriacao;
	private Vagao vagao;
	private Locomotiva locomotiva;
	private static int TotalTrem = 0;
	
	public Trem(String PrefixoTrem, String EstacaoOrigem, String EstacaoDestino, Date DataCriacao, Vagao vagao, Locomotiva locomotiva) {
		this.PrefixoTrem = PrefixoTrem;
		this.EstacaoOrigem = EstacaoOrigem;
		this.EstacaoDestino = EstacaoDestino;
		this.DataCriacao = DataCriacao;
		this.locomotiva = locomotiva;
		this.vagao = vagao;
		Trem.TotalTrem = Trem.TotalTrem + 1;
	}

	public String getPrefixoTrem() {
		return PrefixoTrem;
	}

	public void setPrefixoTrem(String prefixoTrem) {
		PrefixoTrem = prefixoTrem;
	}

	public String getEstacaoOrigem() {
		return EstacaoOrigem;
	}

	public void setEstacaoOrigem(String estacaoOrigem) {
		EstacaoOrigem = estacaoOrigem;
	}

	public String getEstacaoDestino() {
		return EstacaoDestino;
	}

	public void setEstacaoDestino(String estacaoDestino) {
		EstacaoDestino = estacaoDestino;
	}

	public Date getDataCriacao() {
		return DataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}

	public Vagao getVagao() {
		return vagao;
	}

	public void setVagao(Vagao vagao) {
		this.vagao = vagao;
	}

	public Locomotiva getLocomotiva() {
		return locomotiva;
	}

	public void setLocomotiva(Locomotiva locomotiva) {
		this.locomotiva = locomotiva;
	}

	public static int getTotalTrem() {
		return TotalTrem;
	}

	public static void setTotalTrem(int totalTrem) {
		TotalTrem = totalTrem;
	}
}