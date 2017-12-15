package pgn.argumentos3;
/**
*Analiza el siguiente c\u00f3digo y responde:
*<ul>
*    <li>En un m\u00e9todo, \u00bfc\u00f3mo se distingue entre un par\u00e1metro y un campo con el mismo nombre? Ind\u00edcalo sobre un trozo del c\u00f3digo.</li>
*    <li>\u00bfCu\u00e1ndo afecta lo modificado dentro de un m\u00e9todo a una variable? Ind\u00edcalo sobre un trozo del c\u00f3digo.</li>
*    <li>\u00bfEn qu\u00e9 consiste la sobrecarga de m\u00e9todos? Indica sobre el c\u00f3digo d\u00f3nde hay sobrecarga de m\u00e9todos.</li>
*    <li>\u00bfEn qu\u00e9 consiste el env\u00edo de argumentos por referencia? Indica d\u00f3nde hay env\u00edo de argumentos por referencia.</li> 
*</ul>
*En el foro de dudas de los ejercicios, plantea o un nuevo tema de debate o una respuesta.
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class exArgumentos {
	public static void main(String[] args) {
		int a = 1;
		Argumentos3 args1 = new Argumentos3();

		args1.metodo1(a, a);
		System.out.println(a); // 1

		args1.metodo1(args1.a, args1.a);
		System.out.println(args1.a);// 3

		int[] vector = new int[1];
		args1.metodo1(a, vector);
		System.out.println(a + ", " + vector[0]); // 1, 7

		a = args1.metodo2(args1.a);
		System.out.println(a + ", " + args1.a); // 8, 8

		args1.a = args1.metodo2(a, args1.a);
		System.out.println(a + ", " + args1.a); // 8, 8
	}
}