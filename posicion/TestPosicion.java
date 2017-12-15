package pgn.posicion;
/**
*Dise\u00f1a la clase Posicion que represente un punto (x,y) en el eje de coordenadas.<p> 
*Cada posici\u00f3n viene definida por dos valores enteros x e y.<p> 
*Constar\u00e1 de los siguientes m\u00e9todos:
*<ul>
*	<li>Constructor por defecto. Se corresponde con la posici\u00f3n (0,0).</li>
*	<li>Constructor al que se le pasa como argumento los valores iniciales de las coordenadas x e y.</li>
*	<li>Constructor de copia. Se le pasa como argumento un objeto de la misma clase.</li>
*</ul> 
*Se inicializan los campos del nuevo objeto con los mismos valores de los campos del objeto que se pasa como par\u00e1metro.<p>
*M\u00e9todos para modificaci\u00f3n y consulta (set/get) de los atributos de la clase.<p>
*M\u00e9todos para incrementar y decrementar los valores de cada una de las coordenadas de la posici\u00f3n (incX, incY, decX, decY).<p>
*Un m\u00e9todo para establecer los valores de las coordenadas (setXY).<p> 
*Para su comprobaci\u00f3n, crea la clase TestPosici\u00f3n y muestra los cambios de estado invocando a toString().
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/
public class TestPosicion {
	public static void main(String[] args) {
		Posicion posicion1 = new Posicion();
		System.out.println("\nPrimera posici\u00f3n: " + posicion1.toString());

		Posicion posicion2 = new Posicion(5, 3);
		System.out.println("\nSegunda posici\u00f3n: " + posicion2.toString());

		Posicion posicion3 = new Posicion(posicion2);
		System.out.println("\nTercera posici\u00f3n: " + posicion3.toString());

		posicion3.decX();
		
		System.out.println("\nPosici\u00f3n 3 tras aplicar el decremento: " + posicion3.toString());// part\u00edan del mismo estado, pero son
																									// objetos distintos
	}
}