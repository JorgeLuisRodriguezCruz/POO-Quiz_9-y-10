package principal;

public abstract class Procesador {
	protected Algoritmo algoritmo;
	
	public Procesador() {
		
	}
	public abstract void estado();

	public void setAlgoritmo(Algoritmo algoritmo) {
		this.algoritmo = algoritmo;
	}
}
