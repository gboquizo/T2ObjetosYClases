package pgn.listadoobjetosyclases.circulo;
import  pgn.listadoobjetosyclases.utiles.Teclado;
/**
*Crea una clase TestCirculo que cree una instancia de "Circulo", muestre su
*estado, lo haga crecer 27 veces, averig\u00a8e su \u00e1rea, lo haga decrecer 10 veces y
*muestre su estado final.
*
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestCirculo {
	public static void main(String[] args) {
		do{
			Circulo circulo = new Circulo(pedirRadio("\nIntroduzca el radio de su circulo"));
			System.out.println(circulo.toString());
			for (int i = 0; i < 27 ;i++ ) {
			 	circulo.crecer();
			} 
				
			System.out.println("\n\t" + circulo.crecer());

			for (int i = 0; i < 10; i++){
				circulo.menguar();
			}
			
			System.out.println("\nt" + circulo.menguar());

			System.out.println("\n\tFinalmente..." + "\n" + circulo.toString() + "\n");		
		} while(Teclado.deseaContinuar());	
	}

	/**
	*Pide el radio.
	*@return el radio pedido por teclado.
	*/
	private static double pedirRadio(String mensaje) {
		return Teclado.leerDecimal(mensaje);
	}
}