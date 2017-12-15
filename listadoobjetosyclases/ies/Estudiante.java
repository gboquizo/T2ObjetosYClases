package pgn.listadoobjetosyclases.ies;

/**
*Crea la Clase Estudiante.<p> 
*M\u00e9telo en el paquete ies.<p> 
*Implementa al menos los siguientes m\u00e9todos y atributos.<p>
*<ul>	
*	<li>a. nombre</li>
*	<li>b. apellido primero</li>
*	<li>c. apellido segundo</li>
*	<li>d. curso (s\u00f3lo se admitir\u00e1n los valores 1ESO, 2ESO, 3ESO, 4ESO,
*					1BACH, 2BACH, 1DAW, 2DAW)</li>
*	<li>e. setCurso()</li>
*	<li>f. incCurso(), que har\u00e1 la promoci\u00f3n del alumno dentro de la etapa, que es:
*		<ul>
*			<li>f.i. 1ESO ->2ESO->3ESO->4ESO</li>
*			<li>f.ii. 1BACH ->2BACH</li>
*			<li>f.iii. 1DAW -> 2DAW</li>
*		</ul>
*	</li>
*</ul>
*/
public class Estudiante {

	/**
	*Campo para el nombre.
	*/	
	private String nombre;

	/**
	*Campo para el primer apellido.
	*/		
	private String apellidoUno;

	/**
	*Campo para el segundo apellido.
	*/	
	private String apellidoDos;

	/**
	*Campo para el curso.
	*/	
	private Curso curso;
	
	public Estudiante(String nombre, String apellidoUno, String apellidoDos, Curso curso){
		setNombre(nombre);
		setApellidoUno(apellidoUno);
		setApellidoDos(apellidoDos);
		setCurso(curso);
	}

	/**
	*Permite obtener el nombre.
	* 
	*@return nombre: El nombre a obtener.
	*/		
	String getNombre() {
		return nombre;
	}
	
	/**
	*Permite establecer el nombre.
	* 
	*@param nombre: El nombre a establecer.
	*/	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	*Permite obtener el primer apellido.
	* 
	*@return apellidoUno: El primer apellido a obtener.
	*/		
	String getApellidoUno() {
		return apellidoUno;
	}
	
	/**
	*Permite establecer el primer apellido.
	* 
	*@param apellidoUno: El primer apellido a establecer.
	*/	
	private void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}

	/**
	*Permite obtener el segundo apellido.
	* 
	*@return apellidoDos: El segundo apellido a obtener.
	*/	
	String getApellidoDos() {
		return apellidoDos;
	}

	/**
	*Permite establecer el segundo apellido.
	* 
	*@param apellidoDos: El segundo apellido a establecer.
	*/	
	private void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}		
	
	/**
	*Permite obtener el curso.
	* 
	*@return curso: El curso a obtener.
	*/	
	protected Curso getCurso() {
		return curso;
	}
	
	/**
	*Permite establecer el curso.
	* 
	*@param curso: El curso a establecer.
	*/	
	private void setCurso(Curso curso) {
		this.curso = curso;
	}

	/**
	*Permite incrementar el curso.
	*/
	protected void incCurso() {
		setCurso(Curso.values()[getCurso().ordinal() + 1]); 
	}		

	/**
	*Controla el paso de etapa.
	*/
	String pasarEtapa() {
		switch (curso) {
			case ESO1:
			case ESO2:
			case ESO3:
			case DAW1:
			case BACH1:
				incCurso();
				return "Ahora has pasado a " + getCurso();
			default:
				break;
		}
		return"No puede pasar de etapa";
	}

	/**
	*Controla el paso de curso.
	*/
	String promocionar() {
	 	switch (curso) {
	 		case ESO4:
	 			setCurso(Curso.BACH1);
	 			return"\n\tEnhorabuena, has promocionado a Primero de Bachillerato";
	 		case BACH2:
	 			setCurso(Curso.DAW1);
	 			return"\n\tEnhorabuena, has promocionado a Primero de Desarrollo de Aplicaciones Web";
	 		case DAW2:
	 			return "\n\tYa no se puede cambiar mas de etapa";
	 		default:
	 			break;
	 	}
	 	return "\n\tPara cambiar de etapa debes estar en el \u00faltimo curso.";
	}
	
	/**
	*Muestra al estudiante con su nombre, primer apellido, segundo apellido y curso.
	*@return cadena que contiene el nombre, primer apellido, segundo apellido y curso. del gato.
	*/	 
	@Override
	public String toString() {
		return  "\t---\n\t" + getApellidoUno() + " " 
							+ getApellidoDos() + "," 
							+ getNombre() + "\n\t"+ "Curso: "
							+ getCurso() + "\n\t---";
	}
}