package pgn.listadoobjetosyclases.gato;
/**
*Crea una clase TestGato que cree una instancia de Gato, le d\u00e9 de comer ,juegue con \u00e9l mucho (7 veces), 
*lo haga dormir y finalmente nos hable.
*
*@author Guillermo Boquizo S\u00e9nchez
*@version 1.0
*/
public class TestGato {
	public static void main(String[] args) {
		Gato gato = new Gato("Islandia", "angora");
		System.out.println(gato.comer());
		for (int i = 0; i < 8; i++) {
			System.out.println(gato.jugar());
		}
		System.out.println(gato.dormir());
		System.out.println(gato);
	}
}