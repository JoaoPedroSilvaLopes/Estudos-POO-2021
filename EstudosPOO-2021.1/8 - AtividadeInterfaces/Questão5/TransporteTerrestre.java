package Quest�o5;

public abstract class TransporteTerrestre extends Transporte {
	String tipo;
	
	public TransporteTerrestre(String tipo) {
		super("Terrestre" , 4, 20);
		this.tipo = tipo;
	}
	// M�TODOS OK
	public void estacionar() {}
	
	@Override
	public boolean estaParado() {
		return false;
	}
}