package Quest�o5;

public abstract class TransporteAereo extends Transporte{
	int altitudeActual;
	
	public TransporteAereo(int altitudeActual) {
		super("A�reo", 10, 10);
		this.altitudeActual = altitudeActual;
	}
	// M�TODOS OK
	public void subir(int metros) {}
	
	public void descer(int metros) {}
	
	@Override
	public boolean estaParado() {
		return false;
	}
}