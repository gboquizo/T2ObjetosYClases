package pgn.vector;
import pgn.utiles.*;
/**
*Crea la clase Vector con el siguiente comportamiento;
*<ul>
*    <li>calcularMaximo()</li>
*    <li>calcularMinimo()</li>
*    <li>sumar()</li>
*    <li>calcularMedia()</li>
*    public String toString() {//@Override
*</ul>
*En el constructor, se indicar\u00e1 el tama\u00f1o, valores m\u00e1ximo y m\u00ednimo para rellenar aleatoriamente<p>
*Para probarla crea la clase TestVector con el m\u00e9todo main.<p>
*Crear\u00e1 dos vectores e invocar\u00e1 todos sus m\u00e9todos.<p> 
*Se mostrar\u00e1n los cambios de estado de cada uno de ellos.<p>
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/
public class Vector {
	private int[] vector;
	Vector(int tamanno, int maximo, int minimo) {
		vector = new int[tamanno];
		for (int i = 0; i < vector.length; i++ ) {
			vector[i] = Matematicas.getAleatorio(maximo,minimo); 	
		} 
	}

	/**
	*
	*Calcula el m\u00ednimo del vector.
	*@return minimo: el m\u00ednimo del vector.
	*
	*/
	int calcularMinimo() {
		int minimo = vector[0];
		for (int i = 0; i < vector.length; i++ ) {
			if(minimo > vector[i])
				minimo = vector[i];
		}
	return minimo;	
	}

	/**
	*
	*Calcula el m\u00e1ximo del vector.
	*@return maximo: el m\u00e1ximo del vector.
	*
	*/
	int calcularMaximo() {
		int maximo = vector[0];
		for (int i = 0; i < vector.length; i++ ) {
			if(maximo < vector[i])
				maximo = vector[i];
		}
	return maximo;	
	}

	/**
	*
	*Calcula la suma de los elementos del vector.
	*@return suma: la suma de los elementos del vector.
	*
	*/
	int sumar() {
		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		return suma;
	}

	/**
	*
	*Calcula la media de los elementos del vector.
	*@return media: la media de los elementos del vector.
	*/
	double calcularMedia() {
		
		return Math.round(((double)sumar() / (double)vector.length) * 1000) / 1000d;
	}

	/**
	*Muestra los elementos del vector 
	*return cadena: cadena que contiene los elementos del vector
	*
	*/
	@Override
	public String toString() {
		String cadena = "";
			for (int i = 0; i < vector.length ; i++) {
				cadena += "\n\tVector[" + i + "]: " + vector[i] + "\n"; 	
			}
		return cadena;	  
	}	
}