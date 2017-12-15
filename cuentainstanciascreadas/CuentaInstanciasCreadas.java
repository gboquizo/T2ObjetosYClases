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
*    <li>\u00bfPuedo acceder a algo est\u00e1tico sin haber creado antes ning\u00fan objeto?</li>
*<ul>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class CuentaInstanciasCreadas {
	static int contador;

	CuentaInstanciasCreadas() {
		contador++;
	}

	static int getInstanciasCreadas() {
		return contador;
	}
}