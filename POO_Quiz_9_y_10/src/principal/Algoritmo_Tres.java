package principal;

public class Algoritmo_Tres extends Algoritmo {

	Algoritmo_Tres (String pTipo) {
		super(pTipo);
	}

	@Override
	void printAlgoritmo(String pVideo) {
		System.out.println("Algoritmo: "+this.tipo+ " 3 ");
	}

}
