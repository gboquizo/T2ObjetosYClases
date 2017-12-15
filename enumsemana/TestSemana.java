package enumsemana;
import enumsemana.Semana;
/**
*<h1>enum Semana<h1>
*Realiza la lectura del documento Enumeraciones.
*Implementa el ejemplo del apartado "3.5. Enumeraciones" del documento:
*<ul>
*    <li>Desarrollo de proyectos inform\u00e1ticos con tecnolog\u00eda java.</li>
*</ul>
*Util\u00edzalo en un main y responde a las siguientes preguntas:
*<ul>
*    <li>M\u00e9todos aplicables a una enumeraci\u00f3n y significado<li>
*    <li>Modificadores de visibilidad aplicables a una enumeraci\u00f3n<li>
*    <li>Comprueba si las afirmaciones son verdaderas o falsas:
*    	<ul>
*        	<li>Una enumeraci\u00f3n puede declararse dentro de una clase.</li>
*        	<li>Una enumeraci\u00f3n puede declararse dentro de un m\u00e9todo.</li>
*        	<li>Una enumeraci\u00f3n puede declararse fuera de una clase, en una unidad de compilaci\u00f3n sola.</li>
*        	<li>Cada uno de los elementos de la enumeraci\u00f3n (constantes) son instancias de la enumeraci\u00f3n.</li>
*       	<li>El constructor de una enumeraci\u00f3n puede invocarse directamente en el c\u00f3digo.</li>
*        	<li>El constructor de una enumeraci\u00f3n se invoca autom\u00e1ticamente cuando se inicializa la enumeraci\u00f3n.</li>
*        </ul>
*	</li>
*</ul>
*@author Guillermo Boquizo S\u00e1nchez
*@version 1.0
*/
public class TestSemana {
	public static void main(String[] args) {
		for(Semana dia:Semana.values()) {
			System.out.println(dia.name());
			System.out.println(dia.ordinal() + 1);
			System.out.println(dia.getComentario() + "\n");
		}
	}
}
