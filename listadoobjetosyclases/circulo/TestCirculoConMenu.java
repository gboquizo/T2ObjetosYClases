package pgn.listadoobjetosyclases.circulo;
import  pgn.listadoobjetosyclases.utiles.*;
/**
*Crea una clase TestCirculoConMenu que muestre un men\u00fa para manipular una instancia de c\u00edrculo.
* 
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestCirculoConMenu {
	public static void main(String[] args) {
		do{
			Menu menuCirculo = new Menu("Men\u00fa C\u00edrculos",
					new String[] { "Mostrar c\u00edrculo", 
									"Mostrar \u00e1rea", 
									"Menguar c\u00edrculo", 
									"Incrementar c\u00edrculo" });
			int opcion;
			Circulo circulo = new Circulo(Teclado.leerEntero("\nBienvenido, vamos a trabajar con c\u00edrculos." 
														+ "Para empezar, dame el radio de tu c\u00edrculo:\n"));
			do {
				opcion = menuCirculo.gestionar();
				gestionarOpciones(opcion, circulo);
			} while (opcion != menuCirculo.SALIR);
		} while(Teclado.deseaContinuar());
	}

	/**
	*Gestiona las opciones del men\u00fa.
	*@param opcion: la opci\u00f3n escogida.
	*@param circulo: el c\u00edrculo creado.
	*
	*/
	private static void gestionarOpciones(int opcion, Circulo circulo) {
		switch (opcion) {
		case 1:
			System.out.println(circulo.toString());
			break;
		case 2:
			System.out.println(circulo.mostrarArea());
			break;
		case 3:
			System.out.println(circulo.menguar());
			break;
		case 4:
			System.out.println(circulo.crecer());
		}
	}
}