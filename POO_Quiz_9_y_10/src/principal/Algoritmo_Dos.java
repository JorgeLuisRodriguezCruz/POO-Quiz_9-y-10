package principal;

public class Algoritmo_Dos extends Algoritmo {

	Algoritmo_Dos (String pTipo) {
		super(pTipo);
	}

	@Override
	void printAlgoritmo(String pVideo) {
		System.out.println("Algoritmo: "+this.tipo+" genera los subtitulos del video -> "+pVideo);
	}

}
