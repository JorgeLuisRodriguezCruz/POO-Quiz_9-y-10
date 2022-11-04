package principal;

public class MainDos {

	public static void main(String[] args) {
		Procesador descripcion = new Descripcion_Video();
		Algoritmo uno = new Algoritmo_Uno();
		descripcion.setAlgoritmo(uno);
		descripcion.estado();

	}
}
