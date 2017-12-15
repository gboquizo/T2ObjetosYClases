package entregasCortas.conStatic;
/**
*Compila el siguiente c\u00f3digo.<p> 
*Son dos clases "TestPruebaStatic" y "PruebaStatic" empaquetadas en "EntregasCortas.conStatic.<p>
*Responde a las siguientes preguntas:
*<ul>
*	<li>Indica el valor mostrado en la ejecuci\u00f3n</li>
*	<li>\u00bfQu\u00f3 caracter\u00edstica tiene un campo static?</li>
*	<li>\u00bfC\u00f3mo se accede a un campo static?</li>
*	<li>\u00bfPuede accederse a un campo static directamente, sin la creaci\u00f3n de objetos?
*	Demu\u00e9stralo modificando el c\u00f3digo anterior.Entr\u00e9galo.</li>
*</ul>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestPruebaStatic {
	public static void main(String[] args) {
		//Dos objetos con el mismo campo com\u00fan valorEstatico definido mediante static.
		PruebaStatic ps1 = new PruebaStatic();
		PruebaStatic ps2 = new PruebaStatic();

		//Accedo al mismo campo con el nombre de cada objeto. No es recomendable.
		ps1.valorEstatico *= 2;
		ps2.valorEstatico++;

		//Accedo al mismo campo con el nombre de la clase, porque es static. Forma recomendable.
		System.out.println(PruebaStatic.valorEstatico);
	}
}