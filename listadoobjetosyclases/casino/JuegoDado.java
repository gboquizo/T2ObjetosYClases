package pgn.listadoobjetosyclases.casino;
/**
*Implementa la clase JuegoDado(). <p>
*Consiste en lanzar el dado.<p> 
*Ganar\u00e1 aquel que saque el mayor valor.<p> 
*Mediante un men\u00fa se lanza el dado tantas veces como se quiera, mostr\u00e1ndose su valor.<p> 
*Tendr\u00e1s al menos las clases:
*<ul>
*	<li>a. casino.Dado.java</li>
*	<li>b. casino.JuegoDado.java. Has de implementar al menos el m\u00e9todo jugar()</li>
*	<li>c. utiles.Menu.java. Deber\u00e1s crear al menos un men\u00fa con las opciones "jugar" y "salir".</li>
*	<li>d. testCasino.TestJuegoDado.java, donde se crear\u00e1 el juego.</li>
*</ul>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*
*/
public class JuegoDado {

	/**
	*Dado para el juego.
	*/
	private Dado dado;
	
	/**
	*N\u00famero de jugadores.
	*/
	private int[] jugadores = new int[2];
	
	/**
	*Vector donde guardaremos las puntuaciones.
	*/
	private int[] puntuacion;

	
	public JuegoDado(int[] jugadores) {
		dado = new Dado();
		setJugadores(jugadores);
	}

	/**
	*Permite establecer los jugadores.
	* 
	*@param jugadores jugadores a establecer.
	*/
	private void setJugadores(int[] jugadores) {
		this.jugadores = jugadores;
	}

	/**
	*Permite jugar a 2 jugadores.
	*/
	protected String jugar() {
		puntuacion = new int[jugadores.length];
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println("\n\tTurno de " + (i + 1));
			dado.lanzar();
			System.out.println(dado.toString());
			puntuacion[i] += dado.getCara();	
		}
		return comprobarGanador();
	}

	/**
	* Comprueba la puntuaci\u00f3n de dos jugadores.
	*/
	private String comprobarGanador() {
		String mensaje = "";
		for (int i = 0; i < puntuacion.length - 1; i++) {
			if (puntuacion[i] > puntuacion[i + 1])
				mensaje += "\n\tHa ganado el jugador " + (i + 1) + ".";
			else if (puntuacion[i] < puntuacion[i + 1])
				mensaje += "\n\tHa ganado el jugador " + (i + 2) + ".";
			else
				mensaje += "\n\tHay empate.";
		}
		return mensaje;
	}
}