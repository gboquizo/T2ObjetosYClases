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
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*
*/ 
public class Circulo {
	private Punto punto;
	private double radio;

	/*
	*Constructor de la clase Circulo, con punto y radio como par\u00e1metros.
	*/
	Circulo(Punto punto, double radio) {
		establecerPunto(new Punto(punto));
		establecerRadio(radio);
	}

	/**
	*Obtiene el punto a partir del constructor en la clase Punto.
	*@return el punto obtenido.
	*/
	private Punto obtenerPunto() {
		return punto;
	}

	/**
	*Establece el punto..
	*@param punto: el punto pasado como argumento.
	*/
	private void establecerPunto(Punto punto) {
		this.punto = punto;
	}

	/**
	*Obtiene el radio redondeado a tres decimales.
	*@return el radio calculado.
	*/
	private double obtenerRadio() {
		return Math.round(radio  * 1000) / 1000d;
	}

	/**
	*Establece el radio.
	*@param el radio pasado como argumento.
	*/	
	private void establecerRadio(double radio) {
		this.radio = radio;
	}
	
	/**
	*Obtiene el \u00e1rea redondeada a tres decimales.
	*@return el \u00e1rea calculada.
	*/		
	private double obtenerArea() {
		return Math.round(Math.PI * Math.pow(obtenerRadio(), 2)  * 1000) / 1000d;
	}

	/**
	*Obtiene la circunferencia redondeada a tres decimales.
	*@return la circunferencia calculada.
	*/		
	private double obtenerCircunferencia() {
		return Math.round(2 * Math.PI * obtenerRadio()  * 1000) / 1000d;
	}

	/**
	*Devuelve para ser mostrados el punto, radio, \u00e1rea y circunferencia de un c\u00edrculo.
	*@return la cadena con los resultados de los elementos indicados.
	*/	
	@Override
	public String toString() {
		return "\n\t" + obtenerPunto() 
			+ "\n\tRadio = " + obtenerRadio() 
			+ "\n\t\u00c1rea = " + obtenerArea() 
			+ "\n\tCircunferencia = "+ obtenerCircunferencia();
	}
}