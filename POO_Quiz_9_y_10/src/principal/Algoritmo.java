package principal;

public abstract class Algoritmo {
	protected String tipo;
	
	Algoritmo (String pTipo) {
		this.tipo = pTipo;
	}
	
	abstract void printAlgoritmo (String pVideo);

}
