package cuentainstanciascreadas;
/**
*Crea la clase CuentaInstanciasCreadas que implemente el m\u00edtodo getInstanciasCreadas. 
*Devolver\u00e1 el n\u00famero de instancias creadas por la clase. 
*Pista: tendr\u00e1s que utilizar static.
*Compru\u00edbalo creando instancias en TestCuentaInstanciasCreadas.
*Intenta acceder con el nombre del objeto y con el nombre de la clase.
*Responde a las siguientes preguntas:
*<ul>
*    <li>\u00bfCu\u00e1ndo se carga un trozo de c\u00f3digo est\u00e1tico?</li>
*    	<p>Se accede a algo est\u00e1tico cuando se accede mediante el nombre de la clase y el campo (o mediante el nombre del
*    objeto y el campo, que no es recomendable)</p>
*    <li>\u00bfPuedo acceder a algo est\u00e1tico sin haber creado antes ning\u00fan objeto?</li>
*    	<p>S\u00ed, se puede acceder a algo est\u00e1tico sin necesidad de crear instancias o acceder mediante el nombre del objeto, que es
*			una pr\u00e1ctica no recomendada.</p>
*<ul>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestCuentaInstanciasCreadas {
	public static void main(String[] args) {
		//Objetos con el mismo campo com\u00fan contador definido mediante static.
		CuentaInstanciasCreadas instancia1 = new CuentaInstanciasCreadas(); 
		CuentaInstanciasCreadas instancia2 = new CuentaInstanciasCreadas();
		CuentaInstanciasCreadas instancia3 = new CuentaInstanciasCreadas();
		CuentaInstanciasCreadas instancia4 = new CuentaInstanciasCreadas();
		CuentaInstanciasCreadas instancia5 = new CuentaInstanciasCreadas();
		
		instancia1.contador++;//Accedo al mismo campo con el nombre del objeto. No es recomendable.
		instancia2.contador++;
		instancia3.contador++;
		instancia4.contador++;
		instancia5.contador++;
		
		//Accedo al campo con el nombre de la clase, porque es static. Forma recomendable.
		System.out.println("\nInstancias creadas:" + CuentaInstanciasCreadas.getInstanciasCreadas());//Se carga el static
	}
}