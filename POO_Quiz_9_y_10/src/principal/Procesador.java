package principal;

public abstract class Procesador {
	private Algoritmo algoritmo;
	
	public Procesador() {
		
	}
	protected abstract void estado();

	public void setAlgoritmo(Algoritmo algoritmo) {
		this.algoritmo = algoritmo;
	}
}
