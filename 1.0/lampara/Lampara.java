package pgn.lampara;
/**
*Env\u00eda los ficheros "Lampara.java", "TestLampara.java" y la respuesta
*"preguntas.txt" en un \u00fanico fichero comprimido "LamparaMiNombreCompleto"<p>
* 
*Disponemos del siguiente c\u00f3digo:<p> 
*class Lampara { boolean encendida = false;<p>
*encender(){ encendida = true;<p> 
*System.out.println("Ilumninando"); } 
*apagar(){<p>
*encendida = false; System.out.println("Oscuridad"); } }<p> 
*El c\u00f3digo actual contiene errores de compilaci\u00f3n.<p> 
*Corr\u00edgelos.<p> s
*Encapsula en la medida de lo posible.<p>
*Empaqueta la clase Lampara en una biblioteca.<p>
*Haciendo uso de la clase L\u00e1mpara ya modificada, simula el funcionamiento de una l\u00e1mpara en una nueva clase 
*TestLampara (con m\u00e9todo main()).<p>
*El resultado de la ejecuci\u00f3n ser\u00e1 \u00e9ste:<p>
*Ilumninando Oscuridad.<p>
*A\u00f1adiendo comentarios de l\u00ednea en la nueva clase
*TestLampara, indica en qu\u00e9 parte del c\u00f3digo se:
*<ul> 
*	<li>Instancia un objeto.</li>
*	<li>Invoca a un m\u00e9todo</li> 
*	<li>Accede a un campo.</li>
*	<li>\u00bfAparece el constructor? ¿Por qu\u00e9?</li>
*</ul> 
* @author Guillermo Boquizo S\u00e1nchez
* @version 1.0
*/
public class Lampara {
	private boolean encendida = false;//encapsulaci\u00f3n de atributos. Inicialmente la l\u00e1mpara se encuentra apagada.

	void encender() {
		encendida  = true;//acceso al campo encendida.
		System.out.println("Iluminando");									
	}

	void apagar() {
		encendida = false;//acceso al campo encendida.
		System.out.println("Oscuridad");
	}
}
//No hemos definido ning\u00fan constructor, por defecto se precisa de 1 generado autom\u00e1ticamente.
//Java, en caso de no detectar el constructor, genera uno a partir del main.