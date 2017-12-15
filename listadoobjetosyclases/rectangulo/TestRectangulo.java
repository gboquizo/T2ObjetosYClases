package pgn.listadoobjetosyclases.rectangulo;
import  pgn.listadoobjetosyclases.utiles.*;
/**
*Crea la clase Rectangulo y su respectivo TestRectangulo que nos permita
*manipular una instancia de rect\u00e1ngulo mediante un men\u00fa.
*<ul>
*	<li>a. rect\u00e1ngulo nopuede tener dimensiones negativas.</li> 
*	<li>b. Comprueba que el rect\u00e1ngulo no desaparezca (siempre un ancho y un alto mayor que cero).</li>
*</ul>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestRectangulo {
	public static void main(String[] args) {
		do {
			Menu menuRectangulo = new Menu("Men\u00fa Rect\u00e1ngulos",
					new String[] { "Mostrar rect\u00e1ngulo", 
									"Mostrar \u00e1rea", 
									"Menguar rect\u00e1ngulo",
									"Incrementar rect\u00e1ngulo" });
			int opcion;
			Rectangulo rectangulo = new Rectangulo(Teclado.leerEntero("\nBienvenido, vamos a trabajar con rect\u00e1ngulos.\n" 
															+ "\nPara empezar, dame la base de tu rect\u00e1ngulo:\n"), Teclado.leerEntero("\nDame tambi\u00e9n la altura:\n"));
			do {
				opcion = menuRectangulo.gestionar();
				gestionarOpciones(opcion, rectangulo);
			} while (opcion != menuRectangulo.SALIR);
		} while(Teclado.deseaContinuar());
	}

	/**
	*Gestiona las opciones del men\u00fa.
	*@param opcion: la opci\u00f3n escogida.
	*@param rectangulo: el rect\u00e1ngulo creado.
	*
	*/
	private static void gestionarOpciones(int opcion, Rectangulo rectangulo) {
		switch (opcion) {
		case 1:
			System.out.println(rectangulo.toString());
			break;
		case 2:
			System.out.println(rectangulo.mostrarArea());
			break;
		case 3:
			System.out.println(rectangulo.menguar());
			break;
		case 4:
			System.out.println(rectangulo.crecer());
		}
	}
}