package pgn.lampara;
/**
*Env\u00eda los ficheros "Lampara.java", "TestLampara.java" y la respuesta
* "preguntas.txt" en un \u00fanico fichero comprimido "LamparaMiNombreCompleto"<p>
* 
*Disponemos del siguiente c\u00fd3igo:<p> 
*class Lampara { boolean encendida = false;<p>
*encender(){ encendida = true;<p> 
*System.out.println("Ilumninando"); } 
*apagar(){<p>
*encendida = false; System.out.println("Oscuridad"); } }<p> 
*El c\u00f3digo actual contiene errores de compilaci\u00f3n.<p> 
*Corr\u00edgelos.<p> 
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
public class TestLampara {
	public static void main(String[] args) {
		Lampara lampara = new Lampara();// se crea una instancia del objeto lampara
		lampara.encender();// se invoca a un m\u00e9todo
		lampara.apagar();// se invoca a un m\u00e9todo
		/*System.out.println(lampara.encendida)*/;//Esta l\u00ednea no compilar\u00eda
	}
}