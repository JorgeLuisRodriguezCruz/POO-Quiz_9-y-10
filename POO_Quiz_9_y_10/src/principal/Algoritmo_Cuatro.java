package principal;

public class Algoritmo_Cuatro extends Algoritmo {

	Algoritmo_Cuatro (String pTipo) {
		super(pTipo);
	}

	@Override
	void printAlgoritmo(String pVideo) {
		System.out.println("Algoritmo: "+this.tipo+ " 4 ");
	}

}