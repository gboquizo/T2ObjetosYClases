package pgn.listadoobjetosyclases.rectangulo;
/**
*Crea la clase Rectangulo y su respectivo TestRectangulo que nos permita
*manipular una instancia de rect\u00e1ngulo mediante un men\u00fa.
*<ul>
*	<li>a. rect\u00e1ngulo nopuede tener dimensiones negativas.</li> 
*	<li>b. Comprueba que el rect\u00e1ngulo no desaparezca (siempre un ancho y un alto mayor que cero).</li>
*</ul>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class Rectangulo {
	
	/**
	*Campo base.
	*/
	private double base;

	/**
	*Campo altura.
	*/
	private double altura;

	/**
	*Campo \u00e1rea.
	*/
	private double area;

	public Rectangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}
	
	/**
	*Obtiene la altura.
	*@return la altura obtenida.
	*/	
	private double getAltura() {
		return altura;
	}

	/**
	*Establece la altura, si es negativa la fija a 1 por defecto y lanza un mensaje.
	*@param altura: la altura a establecer.
	*
	*/	
	private void setAltura(double altura) {
		if (altura <= 0) {	
			setAltura(1);
			System.out.println("\n\tNo hay rect\u00e1ngulos de altura cero o negativa. Inicializada por defecto a 1.");
		}
		else			
			this.altura = altura;
	}

	/**
	*Obtiene la base.
	*@return la base obtenida.
	*/	
	private double getBase() {
		return base;
	}

	/**
	*Establece la base, si es negativa la fija a 1 por defecto y lanza un mensaje.
	*@param base: la base a establecer.
	*
	*/	
	private void setBase(double base) {
		if (base <= 0) {
			setBase(1);
			System.out.println("\n\tNo hay rect\u00e1ngulos de base cero o negativa. Inicializada por defecto a 1.");
		}
		else			
			this.base = base;
	}

	/**
	*Muestra el \u00e1rea, controlando que la misma no sea igual o menor que 0.
	*@return una cadena advirtiendo del resultado para cada caso.
	*/	
	String mostrarArea() {
		if (base > 0 && altura > 0)
			this.area = getArea(); 
		else
			return "\n\tAqu\u00ed debe de haber alg\u00fan error, sin base o altura mayor que 0, no hay \u00e1rea.";
		return "\n\tOcupo un \u00e1rea de " + getArea() + " metros cuadrados.";	
	}

	/**
	*Obtiene el \u00e1rea redondeada a 5 decimales.
	*@return el \u00e1rea, redondeada.
	*/	
	private double getArea() {
		return Math.round((getBase() * getAltura())  * 100000) / 100000d;
	}	

	/**
	*Permite crecer al rect\u00e1ngulo para una base y altura dados en 0.5 unidades.
	*@return Una cadena de caracteres advirtiendo del crecimiento.
	*/	
	String crecer() {
		setBase(getBase() + 0.5);
		setAltura(getAltura() + 0.5);
		return "\n\tEl rect\u00e1ngulo ha crecido";
	}

	/**
	*Permite decrecer al rect\u00e1ngulo para una base y altura dados en 0.5 unidades.
	*@return Una cadena de caracteres advirtiendo del decrecimiento.
	*/		
	String menguar() {
		setBase(getBase() - 0.5);
		setAltura(getAltura() - 0.5);
		return "\n\tEl rect\u00e1ngulo ha menguado";			
	}

	/**
	*Muestra el rect\u00e1ngulo, con su base, altura y \u00e1rea.Si base y altura son iguales, 
	*advierte que es un cuadrado.
	*@return una cadena para cada caso concreto.
	*/	
	@Override
	public String toString() {
	 if (base == altura)
			return ("\n\tAhora soy un cuadrado de " + getBase() + " x " + getAltura());
		else 
			return "\n\tSoy un rect\u00e1ngulo con una base que mide " + getBase() 
						+ " metros" + " y una altura que mide " + getAltura() + " metros.\n" 
						+ "\n\tMi \u00e1rea mide " + getArea() + " metros cuadrados.";
	}
}