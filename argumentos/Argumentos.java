package pgn.argumentos;
/**
*Crea una clase Metodos tal y como se explica:
*<ul>
*    <li>Un m\u00e9todo incrementa(int i) que incremente 
*		y muestre el argumento dentro. (par\u00e1metro por valor)</li>
*    <li>Un m\u00e9todo modifica(int i, char c, double d) que modifique 
*		y muestre los tres argumentos dentro. (par\u00e1metro por valor)</li>
*    <li>Un m\u00e9todo incrementa(int [] v) que incremente 
*		y muestre el primer elemento del vector dentro (par\u00e1metro por valor)</li>
*</ul>
*Crea tambi\u00e9n una clase Argumentos (con main) que invoque a los tres m\u00e9todos anteriores 
*	y muestre inmediatamente despu\u00e9s los argumentos enviados.<p>
*Recuerda que cuando env\u00edas un argumento est\u00e1s haciendo una copia para utilizarla dentro del m\u00e9todo.<p>
* As\u00ed:
*<ul>
*    <li>Cuando env\u00edas una variable primitiva (int, char, double...), est\u00e1s enviando su copia.<p> 
*		Si la modificas, no afecta al argumento original (a no ser que la devuelvas con un return y lo asignes)
*    <li>Cuando env\u00edas una referencia a un objeto (String, array, cualquier otro objeto ...), 
*		est\u00e1s haciendo una copia de la referencia (que apunta al mismo objeto).<p> 
*		Si la modificas, no afecta al argumento original (referencia), 
*		PERO S\u00ed PUEDES MODIFICAR EL OBJETO AL QUE APUNTA (ambas referencias apuntan a la misma copia)
*</ul>
*Responde a las siguientes preguntas:
*<ul>
*    <li>\u00bfSe mantienen todas las modificaciones hechas dentro de un m\u00e9todo?</li>
*    <li>\u00bfC\u00f3mo mantener las modificaciones hechas dentro de un m\u00e9todo?</li>
*</ul> 
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class Argumentos {

	/**
	*Invoca a los tres m\u00e9todos de la clase Metodos y muestra inmediantamente
	*despu\u00e9s los argumentos enviados.
	*
	*@param args conjunto de argumentos enviados.
	*/
	public static void main(String[] args) {

		//para invocar a los m\u00e9todos, tengo que crear un objeto de la clase Metodos.
		Metodos m = new Metodos();

		//Estas ser\u00e1n las variables locales (s\u00f3lo existen dentro del m\u00e9todo main() donde las declaro)
		//que enviar\u00e9 como argumentos a los m\u00e9todos.
		int i = 7;
		char c = 'a';
		double d = 7.5;
        int[] v = new int[1];
        v[0] = 9;

		m.incrementa(i);//variable de tipo primitivo, argumento por valor.
		System.out.println("\nFuera del m\u00e9todo, i: \t" + i + "\n");//modifiqu\u00e9 su copia.Sigue valiendo 7

		m.modifica(i, c, d);//variables de tipo primitivo, argumento por valor.
		System.out.println("\nFuera del m\u00e9todo, i: \t" + i + "\tc: " + c 
				+ ", \td: " + d + "\n");//modifiqu\u00e9 sus copias. Siguen valiendo 7, a y 7.5.

		//creo el OBJETO vector. Inicialmente, todos sus valores son 0.
		int[] vector = new int[7];
		m.incrementa(vector);//Es una referencia al objeto vector. Argumento por referencia.
		System.out.println("\nFuera del m\u00e9todo, vector[0]: \t" + vector[0] + "\n");//modifiqu\u00e9 directamente el objeto.Ahora vale 1.

		//vector[0] es un int.NO CONFUNDIR con vector, que es la referencia al objeto.
		m.incrementa(vector[0]);//variable de tipo primitivo, argumento por valor.
		System.out.println("\nFuera del m\u00e9todo, vector[0]: \t" + vector[0] + "\n");//modifiqu\u00e9 su copia. Sigue valiendo 1.
	}
}