package pgn.circulo;
import pgn.utiles.*;
/**
*Implementa las siguientes Clases:
*<ul>
*    <li>Punto:
*		<ul>
*        	<li>Campos: Las coordenadas enteras x e y</li>
*        	<li>Contructor: Con dos par\u00e1metros x e y</li>
*        	<li>M\u00e9todo: toString()</li>
*		</ul>
*	</li> 
*    <li>Circulo:
*		<ul>
*        	<li>Campos: El centro del circulo y su radio</li>
*        	<li>Contructor: Con dos par\u00e1metros: Punto y radio</li>
*        	<li>M\u00e9todo: getArea()</li>
*        	<li>M\u00e9todo: getCircunferencia()</li>
*        	<li>M\u00e9todo: toString()</li> 
*		</ul>
*    <li>TestCirculo:
*		<ul>
*        	<li>M\u00e9todo: main que cree tantos c\u00edrculos como indique el usuario. Los datos ser\u00e1n 
*				introducidos tambi\u00e9n por el usuario. Una vez creados todos, 
*				se mostrar\u00e1 el estado de cada uno de ellos.
*			</li>
*		</ul>
*	</li>	 
*</ul>
*Contesta a las siguientes preguntas:<p>
*\u00bfCu\u00e1ntos objetos se han creado?<p>
*Se indica en el main de la clase.<p>	
*\u00bfHas tenido que crear alguna clase adem\u00e1s de las indicadas? Si es as\u00ed, explica por qu\u00e9.<p>
*No, en este caso no ha sido necesario.	
*
*@author Guillermo Boquizo S\u00e1nchez
*@version 2.0
*
*/ 
public class TestCirculo {
	public static void main(String[] args) {
		do{
			Circulo[] circulos = new Circulo[pedirCirculos("\u00bfCu\u00e1ntos circulos desea?:")];//Aqu\u00ed se crea un array de c\u00e1rculos
			for (int i = 0; i < circulos.length; i++) {
				circulos[i] = new Circulo(pedirCoordenada("\nDame la x:"),//aqu\u00ed se crean dos objetos, un c\u00edrculo y un punto.
					pedirCoordenada("\nDame la y:"),
					pedirRadio("\nDame el radio:"));
				System.out.println("\nCirculo n\u00BA: " + (i + 1) + ":" + "\n" + circulos[i].toString());
			}
		} while(Teclado.deseaContinuar());	
	}

	/**
	*Pide un n\u00famero de c\u00edrculos por teclado, entero.
	*@param msg: El mensaje para la petici\u00f3n indicada.
	*@return circulos: n\u00famero de c\u00edrculos introducidos.
	*/
	private static int pedirCirculos(String msg) {
		int circulos;
		do {
			circulos = Teclado.leerEntero(msg);
			if (circulos <= 0)
				System.out.println("\nIntroduzca una cantidad mayor que 0");
		}while (circulos <=0 );
		return circulos;
	}

	/**
	*Pide un radio por teclado. Puede ser decimal en cuantas cifras se indiquen.
	*@param mensaje: El mensaje para la petici\u00f3n indicada.
	*@return radio: radio introducido por el usuario.
	*/	
	private static double pedirRadio(String mensaje) {
		double radio;
		radio = Teclado.leerDecimal(mensaje);
		return radio;
	}

	/**
	*Pide un elemento de la coordenada, puede ser decimal en las cifras que se indiquen.
	*@param msj: El mensaje para la petici\u00f3n indicada.
	*@return el n\u00famero pedido por teclado.
	*/		
	private static double pedirCoordenada(String msj) {
		return Teclado.leerDecimal(msj);
	}		
}