package principal;

public class Algoritmo_Uno extends Algoritmo {

	Algoritmo_Uno(String pTipo) {
		super(pTipo);
	}

	@Override
	void printAlgoritmo(String pVideo) {
		System.out.println("Algoritmo: " + this.tipo + " 1 ");
	}

}
