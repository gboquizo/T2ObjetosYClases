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
public class TestVector {
	public static void main(String[] args) {
		Vector vector1 = new Vector(17,100,-20);
		System.out.println("\nEl m\u00ednimo del vector es " + vector1.calcularMinimo());
		System.out.println("\nEl m\u00e1ximo del vector es " + vector1.calcularMaximo());
		System.out.println("\nLa media de los elementos del vector es " + vector1.calcularMedia());
		System.out.println("\nLa suma de los elementos del vector es " + vector1.sumar());
		System.out.println(vector1.toString());

		Vector vector2 = new Vector(23,50,-20);
		System.out.println("\nEl m\u00ednimo del vector es " + vector2.calcularMinimo());
		System.out.println("\nEl m\u00e1ximo del vector es " + vector2.calcularMaximo());
		System.out.println("\nLa media de los elementos del vector es " + vector2.calcularMedia());
		System.out.println("\nLa suma de los elementos del vector es " + vector2.sumar());
		System.out.println(vector2.toString());
	}
}