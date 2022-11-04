package principal;

public class Main {
	public void main(String args[]) {
		Procesador descripcion = new Descripcion_Video();
		Algoritmo uno = new Algoritmo_Uno("a");
		descripcion.setAlgoritmo(null);
		descripcion.estado();
	}

}
