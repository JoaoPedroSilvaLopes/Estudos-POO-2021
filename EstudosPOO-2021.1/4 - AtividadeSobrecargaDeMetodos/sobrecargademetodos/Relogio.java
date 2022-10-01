package sobrecargademetodos;

public class Relogio { // Classe Relogio.

	public void inicializar(int hora, int minuto, int segundo) {
		if (hora > 24 || minuto > 60 || segundo > 60) System.out.println("Hor�rio inv�lido");
		else if (segundo == 0) inicializar(hora, minuto);
		else if (minuto == 0 && segundo == 0) inicializar(hora);
		else System.out.println("S�o: "+hora+" horas, "+minuto+" minutos e "+segundo+" segundos\n");
	}
		
	public void inicializar(int hora, int minuto) {
		if (hora > 24 || minuto > 60) System.out.println("Hor�rio inv�lido");
		else if (minuto == 0) inicializar(hora);
		else System.out.println("S�o: "+hora+" horas, "+minuto+" minutos e 1 segundos\n");
	}
		
	public void inicializar(int hora) {
		if (hora > 24) System.out.println("Hor�rio inv�lido");
		else System.out.println("S�o: "+hora+" horas, 1 minutos e 1 segundos\n");
	}
}