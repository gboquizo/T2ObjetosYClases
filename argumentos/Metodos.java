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
public class Metodos {

	/**
	*M\u00e9todo que permite incrementar enteros.
	*@param i el entero a incrementar.
	*/
	void incrementa(int i) {
		i++;
		System.out.println("\nDentro del m\u00e9todo, i: \t" + i);
	}

	/**
	*M\u00e9todo que permite incrementar enteros, caracteres o decimales.
	*@param i el entero a incrementar.
	*@param c el car\u00e1cter a incrementar.
	*@param d el decimal a incrementar.
	*/
	void modifica(int i, char c, double d) {
		i++;
		c++;
		d++;
		System.out.println("\nDentro del m\u00e9todo, i: \t" + i + "\tc: " + c 
				+ ", \td: " + d);
	}

	/**
	*M\u00e9todo que permite incrementar elementos de un array
	*@param v el array a incrementar.
	*/	
	void incrementa(int[] v) {
		System.out.println("\nDentro del m\u00e9todo, vector[0]: \t" + v[0]);
		v[0]++;
		System.out.println("\nDentro del m\u00e9todo, vector[0]: \t" + v[0]);
	}			
}