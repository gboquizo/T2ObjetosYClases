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
class Argumentos3 {
	int a = 3;//Campo de la clase.

	/**
	* 
	*@param a par\u00e1metro por valor
	*@param b par\u00e1metro por valor
	*/
	void metodo1(int a, int b) {
		a += 5;//par\u00e1metro con el mismo nombre que el campo.
		b += 7;
	}

	/**
	*M\u00e9todo sobrecargado, cambia respecto al tipo de argumentos que recibe.
	*@param a par\u00e1metro por valor
	*@param b par\u00e1metro por referencia
	*/
	void metodo1(int a, int[] b) {
		a += 5;//Par\u00e1metro con el mismo nombre que el campo de la clase.
		b[0] += 7;//se produce un env\u00edo por referencia, apunta a una copia de un objeto, que se asigna aqu\u00ed.
	}

	/**
	* 
	*@param b par\u00e1metro por valor
	*@return a
	*/
	int metodo2(int b) {
		a += 5; // se modifica el campo del objeto
		b += 7;
		return a; // modifica en la asignaci\u00f3n
	}

	/**
	*M\u00e9todo sobrecargado, cambia respecto al tipo de argumentos que recibe.
	*@param a par\u00e1metro por valor
	*@param b par\u00e1metro por valor
	*@return a
	*/
	int metodo2(int a, int b) {

		this.a += 5; // se modifica el campo del objeto, el uso de la palabra reservada this se utiliza para referenciar al campo.
		b += 7;
		return a; // modifica en la asignaci\u00f3n
	}
}