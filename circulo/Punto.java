package pgn.circulo;
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
*\u00bfHas tenido que crear alguna clase adem\u00e1s de las indicadas? Si es as\u00ed, explica por qu\u00e9.<p>
*
*@author Guillermo Boquizo S\u00e1nchez
*@version 2.0
*
*/ 
public class Punto {

	/*
	*Coordenadas del punto.
	*/
	private double x;
	private double y;
	
	/**
	*Constructor de la clase Punto, con los par\u00e1metros x e y.
	*@param x: la x
	*@param y: la y
	*/
	Punto (double x, double y) {
		establecerX(x);
		establecerY(y);
	}

	/**
	*Constructor de la clase Punto, con el par\u00e1metro punto.
	*@param punto: el punto
	*/	
	//Punto(Punto punto) {
	//	establecerX(punto.obtenerX());
	//	establecerY(punto.obtenerY());
	//}

	/**
	*Obtiene la x para un punto dado.
	*@return x: la x obtenida.
	*/
	private double obtenerX() {
		return x;
	}

	/**
	*Establece la x para un punto dado.
	*@param x: la x establecida.
	*/	
	private void establecerX(double x) {
		this.x = x;
	}

	/**
	*Obtiene la y para un punto dado.
	*@return y: la x obtenida.
	*/	
	private double obtenerY() {
		return y;
	}

	/**
	*Establece la y para un punto dado.
	*@param y: la x obtenida.
	*/	
	private void establecerY(double y) {
		this.y = y;
	}

	/**
	*Muestra la x redondeada a tres cifras decimales.
	*@return cadena con la x redondeada.
	*/
	private String mostrarX(){
		return "x:" + Math.round(obtenerX() * 1000) / 1000d;
	}

	/**
	*Muestra la y redondeada a tres cifras decimales.
	*@return cadena con la y redondeada.
	*/	
	private String mostrarY(){
		return "y:" + Math.round(obtenerY() * 1000) / 1000d;
	}	
	
	/**
	*Muestra las coordenadas de un punto en x e y. 
	*@return una cadena con las coordenadas obtenidas.
	*/	
	@Override
	public String toString() {
		return "Coordenadas = " + "(" + mostrarX() + ", " + mostrarY() + ")";
	}
}