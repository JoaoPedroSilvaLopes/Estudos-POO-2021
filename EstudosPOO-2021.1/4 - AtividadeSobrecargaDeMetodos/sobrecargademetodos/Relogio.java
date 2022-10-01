package sobrecargademetodos;

public class Relogio { // Classe Relogio.

	public void inicializar(int hora, int minuto, int segundo) {
		if (hora > 24 || minuto > 60 || segundo > 60) System.out.println("Horário inválido");
		else if (segundo == 0) inicializar(hora, minuto);
		else if (minuto == 0 && segundo == 0) inicializar(hora);
		else System.out.println("São: "+hora+" horas, "+minuto+" minutos e "+segundo+" segundos\n");
	}
		
	public void inicializar(int hora, int minuto) {
		if (hora > 24 || minuto > 60) System.out.println("Horário inválido");
		else if (minuto == 0) inicializar(hora);
		else System.out.println("São: "+hora+" horas, "+minuto+" minutos e 1 segundos\n");
	}
		
	public void inicializar(int hora) {
		if (hora > 24) System.out.println("Horário inválido");
		else System.out.println("São: "+hora+" horas, 1 minutos e 1 segundos\n");
	}
}