package pgn.listadoobjetosyclases.gato;
/**
* Crea la clase "Gato" que responda al siguiente comportamiento:
*<ul>
*	<li>a. Un gato puede comer. En este caso incrementa su peso y dice "Rico rico"</li>
*	<li>b. Un gato puede jugar. En este caso decrementa su peso y dice "Qu\u00e9 diver"</li>
*	<li>c. Un gato puede dormir (su estado natural). En este caso dice "Ronroneo. Zzz"</li>
*	<li>d. Nuestros gatos son habladores.<p> 
*	Nos pueden decir por ejemplo "Hola, soy Gardfield de raza Persa. Peso 4.597 kilos"</li>
*</ul>
*Modifica la clase Gato para que si engorda demasiado o adelgaza en extremo,
*advierta a su amo ("Tengo hambre!!!"" o "Voy a reventar!!!"").
*En caso de llegar aun peso m\u00e1ximo o m\u00ednimo, el gato morir\u00e1 (se saldr\u00e1  del programa)
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class Gato {
	private static final float PESORIESGOARRIBA = 5000;
	private static final float PESOMAXIMO = 6000;
	private static final float PESORIESGOABAJO = 1000;
	private static final float PESOMINIMO = 500;
	private static final float ALIMENTO = 150;

	/**
	*Nombre del gato.
	*/
	private String nombre;

	/**
	*Raza del gato.
	*/
	private String raza;

	/**
	*Peso del gato, en gramos.
	*/
	private float peso;

	/**
	*Estado de sue\u00f1o del gato.
	*/	
	private boolean dormido;

	/**
	*Estado de vitalidad del gato.
	*/	
	private boolean vivo;


	public Gato(String nombre, String raza) {
		setNombre(nombre);
		setRaza(raza);
		setPeso(3000);
		setDormido(false);
		setVivo(true);
	}

	/**
	*Permite obtener un nombre para el gato.
	* 
	*@return nombre: nombre a obtener para el gato.
	*/
	private String getNombre() {
		return nombre;
	}

	/**
	*Establece un nombre para el gato.
	* 
	*@param nombre: nombre a establecer para el gato.
	*/
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	*Permite obtener la raza del gato.
	* 
	*@return la raza del gato a obtener.
	*/
	private String getRaza() {
		return raza;
	}

	/**
	*Permite establecer la raza del gato.
	* 
	*@param raza: La raza a establecer.
	*/
	private void setRaza(String raza) {
		this.raza = raza;
	}

	/**
	*Permite obtener un peso para el gato.
	* 
	*@return peso: peso a obtener.
	*/
	private float getPeso() {
		return peso;
	}

	/**
	*Permite establecer un peso
	* 
	*@param peso: El peso a establecer
	*/
	private void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	*Permite establecer el estado dormido.
	* 
	*@param dormido: El estado dormido a establecer.
	*/	
	private void setDormido(boolean dormido){
        this.dormido = dormido;
    }

	/**
	*Permite obtener el estado dormido.
	* 
	*@return dormido: El estado dormido del gato.
	*/    
    private boolean getDormido(){
        return dormido;
    }

	/**
	*Permite establecer el estado vivo.
	* 
	*@param vivo: El estado vivo a establecer.
	*/	    
	private void setVivo(boolean vivo){
        this.vivo = vivo;
    }

	/**
	*Permite obtener el estado vivo del gato.
	* 
	*@return vivo: El estado vivo del gato.
	*/      
    private boolean getVivo(){
        return vivo;
    }    

	/**
	*Permite dormir al gato. Si el gato est\u00e1 dormido, una voz en off lo indica.
	* 
	*@return Una cadena de caracteres para el gato dormido.
	*/
	String dormir() {
		if (estoyMuerto())
			return "Estoy muerto, no puedo dormir.";
		if (estoyDormido()) {
			return "(Sssssttt, el gato est\u00e1 dormido)";	
		}				
		else
			setDormido(true);
		return "RrrrRRRrrrrRRR. Zzz, Zzz...";
	}

	/**
	*Permite alimentar al gato, no se puede alimentar si est\u00e1 dormido.
	*Si llega al peso l\u00edmite, el gato muere. 
	*@return Una cadena de caracteres para cada caso concreto.
	*/
	String comer() {
		if (estoyMuerto())
			return "Estoy muerto, no puedo ser alimentado.";
		if (estoyDormido())
			return "Estoy dormido, no puedo ser alimentado.Despi\u00e9rtame primero.";		
		setPeso(getPeso() + ALIMENTO);
		if (estoyMuerto()) {
			setVivo(false);
			siEstoyMuerto("Arggg, me has matado");
		}	
		if (voyAReventar())
			return "Voy a reventar";
		return "Rico rico...";
	}

	/**
	*Permite jugar con el gato y lo despierta si est\u00e1 dormido.
	*Si llega al peso l\u00edmite, el gato muere.  
	*@return Una cadena de caracteres para cada caso concreto.
	*/	
	String jugar() {
		if (estoyMuerto())
			return "Estoy muerto, no puedo jugar.";
		if (estoyDormido()){
			setDormido(false);
			return "Miau, grrrrrmiauuuu.....Estaba so\u00f1ando con lindos piolines";	
		}			
		setPeso(getPeso() - ALIMENTO);
		if (estoyMuerto())
			setVivo(false);
			siEstoyMuerto("Estoy muerto, me mataste de diversi\u00f3n...Saliendo...");
		if (tengoHambre())
			return "Tengo hambre...";
		return "Miau, grrrrrmiau...Qu\u00e9 diver";
	}

	/**
	*Comprueba si el gato tiene o no hambre al llegar a un peso de riesgo por defecto de peso.
	*@return true en caso afirmativo, false en el contrario.
	*/
	private boolean tengoHambre() {
		if (getPeso() < PESORIESGOABAJO)
			return true;
		return false;
	}

	/**
	*Comprueba si el gato est\u00e1 o no muerto al llegar a un peso por defecto o exceso de peso.
	*@return true en caso afirmativo, false en el contrario.
	*/	
	private boolean estoyMuerto() {
		if (getPeso() >= PESOMAXIMO || getPeso() <= PESOMINIMO)
			return true;
		return false;
	}

	/**
	*Comprueba si el gato est\u00e1 o no muerto al llegar a un peso por defecto o exceso de peso.
	*@param mensaje mensaje a mostrar en cada tipo de muerte.
	*@return false si el gato est\u00e1 vivo, true en caso contrario, lanza un mensaje y sale del programa.
	*/		
	private boolean siEstoyMuerto(String mensaje) {
		if (getVivo() == true)
			return false;
		else
			System.out.println(mensaje);
			System.exit(0);
		return true;	
	}	

	/**
	*Comprueba si el gato est\u00e1 o no dormido.
	*@return true en caso afirmativo, false en el contrario.
	*/		
	private boolean estoyDormido() {
		if (getDormido() == true)
			return true;
		return false;
	}	

	/**
	*Comprueba si el gato tiene o no hambre al llegar a un peso de riesgo por exceso de peso.
	*@return true en caso afirmativo, false en el contrario.
	*/		
	private boolean voyAReventar() {
		if (getPeso() > PESORIESGOARRIBA)
			return true;
		return false;
	}

	/**
	*Muestra al gato con su nombre, peso y raza.
	*@return cadena que contiene el nombre, la raza y el peso del gato.
	*/
	@Override
	public String toString() {
		return (estoyMuerto() ? "R.I.P." : "") + "Hola, soy un lindo gatito, mi nombre es " + getNombre()
				+ ", soy de raza " + getRaza() + ", peso " + peso / 1000 + " kilos";
	}
}
