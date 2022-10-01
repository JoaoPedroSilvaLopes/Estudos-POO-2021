package construtores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConstrutorDemonstracao {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
		Date data = formatacao.parse("20/03/2017");
		
		Vagao vagao1 = new Vagao(24, 32.0, 34.2, "Carga");
		Locomotiva locomotiva1 = new Locomotiva(204, 20, 30.5);
		Trem trem1 = new Trem("NG202", "Estação A1", "Estação A3", data, vagao1, locomotiva1);
		LinhaFerroviaria linhaferroviaria1 = new LinhaFerroviaria(1, 2000, "transporte de cargas", trem1);
		new EstacaoFerroviaria("ACB", "Estação principal", linhaferroviaria1);
		
	}
}