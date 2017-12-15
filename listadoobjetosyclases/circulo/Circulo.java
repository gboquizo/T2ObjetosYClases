package pgn.listadoobjetosyclases.circulo;
/**
*Crea la clase "Circulo" que responda al siguiente comportamiento:
*<ul>
*	<li>a. Un c\u00edrculo puede crecer. Aumenta su radio.</li>
*	<li>b. Un c\u00edrculo puede menguar. Decrementa su radio.</li>
*	<li>c. Un c\u00edrculo me devuelve su \u00e1rea si se la pido.</li>
*	<li>d. Un c\u00edrculo me dice su estado, por ejemplo "Soy un c\u00edrculo de radio 0.5
*		metros. Ocupo un \u00e1rea de 0.7853981633974483 metros cuadrados"(m\u00e9todo toString())</li>
*</ul>
*Modifica la clase "Circulo" si no has tenido en cuenta que el radio no puede ser negativo.<p>
*Supongamos que si el radio es 0 se convierte en un punto.<p> 
*Entonces el círculo reacciona y dice "Soy un mísero punto sin área".
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class Circulo {

	/**
	*Campo radio.
	*
	*/
	private double radio;

	/**
	*Campo \u00e1rea.
	*
	*/
	private double area;

	public Circulo(double radio) {
		setRadio(radio);	
	}

	/**
	*Establece el radio, si es negativo lo fija a 1 por defecto y lanza un mensaje.
	*@param radio: el radio a establecer.
	*
	*/
	private void setRadio(double radio) {
		if (radio < 0) {
			setRadio(1);
			System.out.println("\n\tNo hay c\u00edrculos de radio negativo. Inicializando por defecto a 1 de radio.");
		}				
		else
			this.radio = radio;	
	}

	/**
	*Muestra el \u00e1rea, controlando que la misma no sea igual o menor que 0.
	*@return una cadena advirtiendo del resultado para cada caso.
	*/
	String mostrarArea() {
		if (radio > 0)
			this.area = getArea(); 
		else
			return "\n\tAqu\u00ed debe de haber alg\u00fan error, sin un radio mayor que 0, no hay \u00e1rea";
		return "\n\tOcupo un \u00e1rea de " + getArea() + " metros cuadrados.";			
	}

	/**
	*Obtiene el radio redondeado a 5 decimales.
	*@return el radio, redondeado.
	*/
	private double getRadio() {
		return Math.round(radio  * 100000) / 100000d;
	}

	/**
	*Obtiene el \u00e1rea redondeada a 5 decimales.
	*@return el \u00e1rea, redondeada.
	*/	
	private double getArea() {
		return Math.round(Math.PI * Math.pow(getRadio(), 2)  * 100000) / 100000d;
	}	

	/**
	*Permite crecer al c\u00edrculo para un radio dado en 0.5 unidades.
	*@return Una cadena de caracteres advirtiendo del crecimiento.
	*/
	String crecer() {
		setRadio(getRadio() + 0.5);
		return "\n\tEl c\u00edrculo ha crecido";
	}

	/**
	*Permite decrecer al c\u00edrculo para un radio dado en 0.5 unidades.
	*@return Una cadena de caracteres advirtiendo del decrecimiento.
	*/
	String menguar() {
		if (radio > 0)
			setRadio(getRadio() - 0.5);
		else
			return "\n\tNo se puede menguar m\u00e1s, no hay c\u00edrculos de radio negativo.";
		return "\n\tEl c\u00edrculo ha menguado";
	}

	/**
	*Muestra el c\u00edrculo, con su radio y \u00e1rea.Si el radio es 0, advierte que es un punto sin \u00e1rea.
	*@return una cadena para cada caso concreto.
	*/
	@Override
	public String toString() {
		if (radio == 0)
			return ("\n\tSoy un m\u00edsero punto sin \u00e1rea.");
		return "\n\tSoy un c\u00edrculo de radio = " + getRadio() + " metro(s)" +  " y mi \u00e1rea es de " + getArea() + " metros cuadrados.";
	}
}