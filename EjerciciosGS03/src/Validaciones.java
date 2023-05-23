import java.util.InputMismatchException;
import java.util.Scanner;

public class Validaciones {

	/**
	 * Pide un número entero. Muestra un mensaje de error y repite la petición si no se introduce.
	 * @param mensaje el mensaje a mostrar al usuario
	 * @return el número entero introducido
	 */
	public static int pideEntero(String mensaje) {
		int opcion = -1;
		boolean errorIntroduccion;
		Scanner in = new Scanner(System.in);
		do {
			errorIntroduccion = false;
			System.out.println(mensaje);
			try {
				opcion = in.nextInt();
				in.nextLine();
			}catch(InputMismatchException e) {
				System.err.println("Por favor, introduzca un número entero");
				in.nextLine();
				errorIntroduccion = true;
			}
		}while(errorIntroduccion);

		return opcion;
	}
	
	/**
	 * Pide un número entero entre minimo y maximo
	 * 
	 * @param minimo minimo aceptado de la introducción
	 * @param maximo maximo aceptado de la introduccion
	 * @param mensaje mensaje al usuario para que introduzca un número
	 * @return el número entero introducido
	 * Muestra un mensaje de error si la introducción no es un número
	 * Muestra otro mensaje de error si la introducción sale de los límites 
	 */
	public static int pideEntero(int minimo, int maximo, String mensaje) {
		int opcion;
		boolean opcionOutOfBounds;
		
		do {
			// Pedimos un número entero
			opcion = pideEntero(mensaje);
			
			// Comprobamos si está en los límites del método
			opcionOutOfBounds = opcion < minimo || opcion > maximo;
			
			// Si sale fuera, mostramos mensaje de error
			if(opcionOutOfBounds)
				System.err.println("Por favor, introduzca un número entre " + minimo + " y " + maximo);
		} while(opcionOutOfBounds);
		
		return opcion;
	}
	
	
	/**
	 * Repite la petición de un valor si|no hasta que se introduzca
	 * @param pregunta la pregunta a mostrar al usuario
	 * @return true si es sí, false si es no.
	 */
	public static boolean pideYesNo(String pregunta) {
		Scanner in = new Scanner(System.in);
		String respuesta;
		boolean centinelaIncorrecta = false;
		
		do {
			if(centinelaIncorrecta)
				System.out.println("Por favor, introduzca \"si\" o \"no\"");
			centinelaIncorrecta = true;
			System.out.println(pregunta);
			respuesta = in.nextLine();
		} while(!respuesta.equalsIgnoreCase("no") && !respuesta.equalsIgnoreCase("si"));
		
		return respuesta.equalsIgnoreCase("si");
	}
	
}
