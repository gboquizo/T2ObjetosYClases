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
public class Posicion {

	/*
	*Campos x e y, definen las coordenadas de la posici\u00f3n.
	*
	*/
	private int x;
	private int y;

	/*
	*Constructor por defecto, se corresponde con la posici\u00f3n.
	*/
	public Posicion() {
		x = 0;
		y = 0;
	}
	
	/*
	*Constructor al que se le pasa como argumento los valores iniciales de las coordenadas x e y.
	*/	
	public Posicion(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	*Constructor de copia. Se le pasa como argumento un objeto de la misma clase.
	*/
	public Posicion(Posicion posicion) {
		x = posicion.x;
		y = posicion.y;
	}

	/**
	*M\u00e9todo de obtenci\u00f3n de la coordenada x.
	*@return la x obtenida.
	*/
	private int getX() {
		return x;
	}

	/**
	*M\u00e9todo de establecimiento de la coordenada x.
	*@param x: la coordenada x a establecer.
	*/
	private void setX(int x) {
		this.x = x;
	}

	/**
	*M\u00e9todo de obtenci\u00f3n de la coordenada y.
	*@return la y obtenida.
	*/
	private int getY() {
		return y;
	}

	/**
	*M\u00e9todo de establecimiento de la coordenada y.
	*@param y: la coordenada x a establecer.
	*/
	private void setY(int y) {
		this.y = y;
	}

	/**
	*M\u00e9todo para incrementar los valores de la x.
	*/	
	void incX() {
		setX(getX() + 1);
	}

	/**
	*M\u00e9todo para decrementar los valores de la x.
	*/	
	void decX() {
		x--;
	}

	/**
	*M\u00e9todo para incrementar los valores de la y.
	*/	
	void incY() {
		setY(getY() + 1);
	}

	/**
	*M\u00e9todo para decrementar los valores de la y.
	*/		
	void decY() {
		setY(getY() - 1);
	}

	/**
	*M\u00e9todo para establecer los valores de las coordenadas.
	*@param x, la x pasada como par\u00e1metro.
	*@param y, la y pasada como par\u00e1metro.
	*/
	private void setXY(int x, int y) {
		setX(x);
		setY(y);
	}
	
	/**
	*Se encarga de mostrar en una cadena las coordenadas x e y de una posici\u00f3n.
	*@return cadena que muestra las coordenadas de la posici\u00f3n.
	*/
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
}