package pgn.listadoobjetosyclases.casino;
/**
*Crea la clase Dado de seis caras (valores del 1 al 6).<p> 
*M\u00e9telo en el paquete casino.<p> 
*Implementa al menos los m\u00e9todos:
*<ul>	
*	<li>a. toString().</li> 
*	<li>b. lanzar().</li>
*</ul>
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*
*/
public class Dado {

	/*
	*Campo cara, la cara del dado.
	*/
	private int cara;
	
	/**
	*Obtiene la cara del dado
	* 
	*@return cara, la cara a obtener.
	*/
	protected int getCara() {
		return cara;
	}

	/**
	*Establece el valor de la cara del dado.
	* 
	*@param cara: la cara a establecer.
	*/
	private void setCara(int cara) {
		this.cara = cara;
	}

	/**
	*Landa un dado.
	* 
	*@return Un entero entre 1 y 6
	*/
	protected int lanzar() {
		return cara = (int) ((Math.random() * 6) + 1);
	}

	/**
	*Muestra el lanzamiento
	*@return cadena con la tirada obtenida.
	*/
	@Override
	public String toString() {
		return "\n\tEn la tirada sale " + getCara() + "\n";
	}
}