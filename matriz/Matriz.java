package pgn.matriz;
import pgn.utiles.*;
/**
*<h1>Dise\u00f1ando una matriz...</h1>
*Lee este documento. Espero te ayude al dise\u00f1o de la clase Matriz. 
*Ya que hemos dado el m\u00e9todo toString(), elimina mostrar() del dise\u00f1o.
*Entrega la clase TestMatriz que cree un men\u00fa para utilizar la clase Matriz
*Al final hay unas cuantas preguntas a las que responder. 
*Entr\u00e9galas en formato pdf.
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class Matriz {
	
	/**
	*Matriz que se va a generar
	*/
	private int[][] matriz;
	
	/**
	*Constructor que crea la matriz con todos sus valores a 0.
	*@param filas N\u00famero de filas.
	*@param columnas N\u00famero de columnas.
	*/
	public Matriz(int filas, int columnas) {
		matriz = new int[comprobarDimension(filas)][comprobarDimension(columnas)];
	}
	
	/**
	*Constructor que crea una matriz de valores aleatorios.
	*@param filas N\u00famero de filas.
	*@param columnas N\u00famero de columnas.
	*@param min M\u00ednimo aleatorio.
	*@param max M\u00e1ximo aleatorio.
	*/
	public Matriz(int filas, int columnas, int max, int min) {
		matriz = new int[comprobarDimension(filas)][comprobarDimension(columnas)];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Matematicas.getAleatorio(min, max);
			}	
		}	
	}
	
	/**
	*Obtiene las columnas de la matriz.
	*@return N\u00famero de columnas de la matriz.
	*/
	private int columnas() {
		return matriz[0].length;
	}

	/**
	*Obtiene las filas de la matriz.
	*@return N\u00famero de filas de la matriz.
	*/
	private int filas() {
		return  matriz.length; 
	}

	/**
	*Suma dos matrices.
	*@param s2 la segunda matriz que se suma.
	*@return La matriz resultante de la suma
	*/
	Matriz sumar(Matriz s2) {
		if (!dimensionesIguales(s2)) {
			System.out.println("\nNo puedo sumar las matrices porque sus dimensiones no son iguales");
			return null;
		}
		int filas = filas();
		int columnas = columnas();
		Matriz suma = new Matriz(filas, columnas);
		for (int i = 0; i < filas; i++)
			for (int j = 0; j < columnas; j++)
				suma.matriz[i][j] = matriz[i][j] + s2.matriz[i][j];
		return suma;
	}
	
	/**
	*Resta dos matrices.
	*@param sustraendo Matriz sustraendo.
	*@return La matriz resultante.
	*/
	Matriz restar(Matriz sustraendo) {
		if (!dimensionesIguales(sustraendo)) {
			System.out.println("\nNo puedo restar las matrices porque sus dimensiones no son iguales");
			return null;
		}
		int filas = filas();
		int columnas = columnas();
		Matriz resta = new Matriz(filas, columnas);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resta.matriz[i][j] = matriz[i][j] - sustraendo.matriz[i][j];
			}
		}
		return resta;
	}

	/**
	*Multiplica dos matrices.
	*@param multiplicando2 la segunda matriz que act\u00faa como multiplicando.
	*@return La matriz resultante de la multiplicaci\u00f3n.
	*/
	Matriz multiplicar(Matriz multiplicando2) {
		Matriz resultado = new Matriz(matriz.length, multiplicando2.matriz[0].length);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < multiplicando2.matriz[0].length; j++) {
				for (int k = 0; k < matriz[0].length; k++) {
					resultado.matriz[i][j] += matriz[i][k] * multiplicando2.matriz[k][j];
				}
			}
		}
		return resultado;
	}
	
	/**
	*Traspone la matriz.
	*/
	void trasponer() {
		int filas = filas();
		int columnas = columnas();
		int[][] resultado = new int[columnas][filas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				resultado[j][i] = matriz[i][j];
			}
		}
		matriz = resultado;
	}
	
	/**
	*Comprueba las dimensiones de dos matrices.
	*@param matriz1 matriz a comparar
	*@return True si son iguales y false si no lo son.
	*/
	private boolean dimensionesIguales(Matriz matriz1) {
		return (matriz.length == matriz1.matriz.length && matriz[0].length == matriz1.matriz[0].length);
	}
	
	/**
	*Comprueba que la dimensi\u00f3n a introducir no sea negativa ni mayor que 0. Si lo es, la devuelve. 
	*@param dimension La dimensi\u00f3n pasada como par\u00e1metro.
	*@return dimension La dimensi\u00f3n correcta.
	*/
	private int comprobarDimension(int dimension) {
		if(!esValida(dimension)) {
			System.out.println("\nError en las dimensiones.Deben ser positivas");
			return 1;
		}
		return dimension;
	}
	
	/**
	*Comprueba que la dimensi\u00f3n a introducir no sea negativa ni mayor que 0. Si lo es, la devuelve. 
	*@param dimension La dimensi\u00f3n pasada como par\u00e1metro.
	*@return dimension La dimensi\u00f3n correcta.
	*/
	private boolean esValida(int dimension) {
		if(dimension <= 0)
		return false;
		return true;	
	}
	
	/**
	*Muestra una matriz recorriendo filas y columnas de la misma.
	*@return matrizMostrada la matriz que se va a mostrar.
	*/		
	@Override
	public String toString() {
		String matrizMostrada = "";
		for (int i = 0; i < filas(); i++) {
			matrizMostrada += "\n";
            for (int j = 0; j < columnas(); j++) {
            	matrizMostrada += "\t" + "[ " + matriz[i][j] + " ]";
            }
            matrizMostrada += "\n";
		}
		return matrizMostrada;
	}
}