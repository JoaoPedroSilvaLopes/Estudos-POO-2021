package Questão5;

public abstract class TransporteAereo extends Transporte{
	int altitudeActual;
	
	public TransporteAereo(int altitudeActual) {
		super("Aéreo", 10, 10);
		this.altitudeActual = altitudeActual;
	}
	// MÉTODOS OK
	public void subir(int metros) {}
	
	public void descer(int metros) {}
	
	@Override
	public boolean estaParado() {
		return false;
	}
}