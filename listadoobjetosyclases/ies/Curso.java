package pgn.listadoobjetosyclases.ies;
/**
*Enumeraci\u00f3n que contiene los cursos de un IES.
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public enum Curso {
	ESO1("ESO1"), ESO2("ESO2"), ESO3("ESO3"), ESO4("ESO4"), BACH1("BACH1"), BACH2("BACH2"), DAW1("DAW1"), DAW2("DAW2");

	/**
	*Campo comentario de la enumeraci\u00f3n
	*
	*/
	private String comentario;

	/**
	*Constructor privado de la enumeraci\u00f3n.
	*@param comentario comentario que se pasa con el curso.
	*/
	private Curso(String comentario) {
		setComentario(comentario);
	}
	
	/**
	*Permite obtener el comentario a indicar.
	*@return comentario: el comentario a establecer.
	*/	
	String getComentario() {
		return comentario;
	}

	/**
	*Permite establecer el comentario a indicar.
	*@param comentario: el comentario a establecer.
	*/
	private void setComentario(String comentario) {
		this.comentario = comentario;
	}
}