package pgn.listadoobjetosyclases.gato;
import  pgn.listadoobjetosyclases.utiles.*;
/**
* 
*Crea una clase TestGatoConMenu que muestre un men\u00fa para que juegue con el gato.
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestGatoConMenu {
	private static Gato gato;
	public static void main(String[] args) {
		do {
			gato = new Gato(pedirRazaONombre("\n\tIndica el nombre del gatito: "), pedirRazaONombre("\n\tIndica su raza: "));
			Menu menuGato = new Menu("Men\u00fa interacci\u00f3n gatos",
					new String[] { "Miau", "Comer", "Dormir", "Jugar" });
			int opcion;
			do {

				opcion = menuGato.gestionar();
				realizarOpcion(opcion);
			} while (opcion != menuGato.SALIR);
			System.out.println("\u00a1Hasta pronto, miau!");
		} while(Teclado.deseaContinuar());
	}

	/**
	*Gestiona las opciones del men\u00fa.
	*@param opcion: la opci\u00f3n escogida.
	*
	*/	
	private static void realizarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println(gato);
			break;
		case 2:
			System.out.println(gato.comer());
			break;
		case 3:
			System.out.println(gato.dormir());
			break;
		case 4:
			System.out.println(gato.jugar());
			break;
		}
	}

	/**
	*Permite introducir la raza y el nombre del gato.
	*@return cadena con la raza o el nombre del gato.
	*/
	private static String pedirRazaONombre(String mensaje){
        return Teclado.leerCadena(mensaje);
    }    
}