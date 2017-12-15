package pgn.listadoobjetosyclases.ies;
import  pgn.listadoobjetosyclases.utiles.*;
/**
*Implementa la clase TestEstudiante() para probar la clase Estudiante:<p> 
*Mediante un men\u00fa se podr\u00e1 crear un estudiante, borrarlo, mostrarlo y modificarlo.<p>
*Tendr\u00e1s al menos las clases:
*<ul>
*	<li>a. ies.Estudiante.java,</li>
*	<li>b. testEstudiante.TestEstudiante.java,</li>
*	<li>c. utiles.Menu.java. Deber\u00e1s crear al menos un men\u00fa con las opciones
*	"alta", "baja", "mostrar", "modificar" y "salir", y otro con las opciones
*	"promocionar" o "cambiar de etapa"</li>
*</ul>
*@author Guillermo Boquizo S\u00e1nchez.
*@version 1.0
*/
public class TestEstudiante {

	/*
	*Men\u00fa principal.
	*/
	private static Menu menuPincipal;

	/*
	*Men\u00fa de selecci\u00f3n de cursos.
	*/	
	private static Menu menuCurso;

	/*
	*Men\u00fa de promoci00f3n de curso.
	*/	
	private static Menu menuAvanzar;

	/*
	*Men\u00fa de modificaci00f3n de estudiantes.
	*/	
	private static Menu menuModificar;	

	/*
	*Campo estudiante.
	*/	
	private static Estudiante estudiante;

	public static void main(String[] args) {
		do {
			menuPincipal = new Menu("Men\u00fa Principal de Estudiantes", 
					new String[]{"Alta","Baja","Mostrar","Modificar","Pasar de curso"});
			int opcion;
			do {
				opcion = menuPincipal.gestionar();
				gestionarMenu(opcion);
			} while(opcion != menuPincipal.SALIR);	
		}while(Teclado.deseaContinuar());	
	}

	/**
	*Gestiona el men\u00fa principal.
	*@param opcion: la opci\u00f3n escogida.
	*/	
	private static void gestionarMenu(int opcion) {
		switch(opcion) {
			case 1: 
				darAlta();
				break;
			case 2: 
				darBaja();
				break;
			case 3: 
				mostrar();
				break;
			case 4: 
				modificar();
				break;
			case 5: 
				pasarCurso();
				break;
		}	
	}

	/**
	*Da de alta a un estudiante.
	*/
	private static void darAlta() {
		estudiante = new Estudiante(
			Teclado.leerCadena("\n\tIntroduce un nombre: "),
			Teclado.leerCadena("\n\tIntroduce el primer apellido: "),
			Teclado.leerCadena("\n\tIntroduce el segundo apellido: "),
			pedirCurso());
	}

	/**
	*Da de baja a un estudiante.
	*/
	private static void darBaja() {
		if (estudiante != null) {
			estudiante = null;
			System.out.println("\n\tEstudiante borrado");
		}	
		else
			System.out.println("\n\tNo puedes dar de baja a un estudiante que no existe");
	}

	/**
	* Modifica los datos del estudiante.
	*/
	private static void modificar() {
		if(estudiante != null){
			menuModificar = new Menu("Modificar estudiante",
				new String[] { "Nombre", "Primer apellido", "Segundo apellido" });
			int opcion;
			do {
				opcion = menuModificar.gestionar();
				switch (opcion) {
					case 1:
						estudiante.setNombre(Teclado.leerCadena("\n\tIntroduce un nombre: "));
						break;
					case 2:
						estudiante.setApellidoUno(Teclado.leerCadena("\n\tIntroduce el primer apellido: "));
						break;
					case 3:
						estudiante.setApellidoDos(Teclado.leerCadena("\n\tIntroduce el segundo apellido: "));
						break;
				}
			} while (opcion != menuModificar.SALIR);
		} 
		else 
			System.out.println("\n\tDebes crear estudiante primero");
	}	

	/**
	*Men\u00fa para pasar de curso.
	*/
	private static void pasarCurso() {
		if (estudiante != null) {
			menuAvanzar = new Menu("Men\u00fa Paso de Etapa o Promoci\u00f3n", 
							new String[] { "Promocionar", "Pasar de etapa" });
			switch (menuAvanzar.gestionar()) {
				case 1:
					System.out.println(estudiante.promocionar());
					break;
				case 2:
					System.out.println(estudiante.pasarEtapa());
					break;
			}
		} 
		else
			System.out.println("\n\tDebes crear al estudiante primero");
	}

	/**
	*Muestra los datos personales del estudiante.
	*/
	private static void mostrar() {
		if(estudiante != null)
			System.out.println(estudiante.toString());
		else
			System.out.println("\n\tDebes crear al estudiante primero");
	}

	/**
	*Solicita el curso del estudiante.
	*@return el curso del estudiante.
	*/
	private static Curso pedirCurso() {
		menuCurso = new Menu("Selecciona curso de ingreso", Curso.values());
		switch(menuCurso.gestionar()) {
			case 0: 
				return Curso.ESO1;
			case 1: 
				return Curso.ESO2;
			case 2: 
				return Curso.ESO3;
			case 3: 
				return Curso.ESO4;
			case 4: 
				return Curso.BACH1;
			case 5: 
				return Curso.BACH2;
			case 6: 
				return Curso.DAW1;
			case 7: 
				return Curso.DAW2;
			default: 
				return null;
		}
	}
}