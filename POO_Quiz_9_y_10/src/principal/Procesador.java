package principal;

public abstract class Procesador {
	private Algoritmo algoritmo;
	
	protected abstract void estado();

	public void setAlgoritmo(Algoritmo algoritmo) {
		this.algoritmo = algoritmo;
	}
	
	
}
