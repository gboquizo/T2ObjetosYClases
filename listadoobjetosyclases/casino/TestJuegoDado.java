package pgn.listadoobjetosyclases.casino;
import  pgn.listadoobjetosyclases.utiles.*;
/**
*Implementa la clase TestDado() para probar la clase Dado:<p> 
*Mediante un men\u00fa se lanza el dado tantas veces como se quiera, mostr\u00e1ndose su valor.
*Tendr\u00e1s al menos las clases:
*<ul>
*	<li>a. casino.Dado.java</li>
*	<li>b. testCasino.TestDado.java</li>
*	<li>c. utiles.Menu.java. Deber\u00e1s crear al menos un men\u00fa con al menos las opciones "lanzar dado" y "salir".</li>
*</ul>	<li>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*
*/
public class TestJuegoDado {
	
	/**
	* Juego del dado
	*/
	private static JuegoDado juego;
	
	public static void main(String[] args) {
		do {
			juego = new JuegoDado(new int[2]);		
			int opcion;
			Menu menuJuego = new Menu("Juego del dado", new String[] {"Jugar"});
			
			do {
				opcion = menuJuego.gestionar();
				gestionarOpciones(opcion);
			} while (opcion != menuJuego.SALIR);	
		}while(Teclado.deseaContinuar());
	}
	
	/**
	*Gestiona las opciones del men\u00fa.
	*@param opcion: la opci\u00f3n escogida.
	*
	*/
	private static void gestionarOpciones(int opcion) {
		switch (opcion) {
			case 1:
				System.out.println(juego.jugar());
				break;
		}
	}	
}