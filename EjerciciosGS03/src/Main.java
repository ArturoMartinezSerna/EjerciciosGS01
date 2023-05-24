import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion;
		do {
			mostrarMenu();
			opcion = Validaciones.pideEntero(0, 8, "Por favor, introduzca una opción:");
			
			ejecutarOpcion(opcion);
		}while(opcion != 0);
	}
	
	private static void ejecutarOpcion(int opcion) {
		switch(opcion) {
		case 1: pideFraseMuestraLongitud();
		break;
		case 2:comparaFrasesIguales();
		break;
		case 3:pideCadenaQueInicieSi();
		break;
		case 4:pideCadenaQueIniciePunto();
		break;
		case 5:sustituyeVocalesPorNumeros();
		break;
		case 6:buscaPosicionesPalabraEnFrase();
		break;
		case 7:testeaTrimPersonalizado();
		break;
		case 8:eliminaEspaciosEnBlanco();;
		break;
		}
	}
	
	
	private static void mostrarMenu() {
		
		System.out.println("***** EJERCICIOS TEMA 3: CADENAS *****\n");
		
		System.out.println("1: Calcular la longitud de una frase");
		System.out.println("2: Comparar si dos frases son iguales");
		System.out.println("3: Introducir palabras hasta empezar en \"si\"");
		System.out.println("4: Introducir frases hasta terminar con un punto \".\"");
		System.out.println("5: Sustituir vocales por números");
		System.out.println("6: Buscar ocurrencias de una palabra en una frase");
		System.out.println("7: Probar el método trim() personal");
		System.out.println("8: Eliminar todos los espacios en blanco de una cadena");
		System.out.println("0: Salir");
		System.out.println("\n******************************************************\n");
	}
	
	
	/*
	 * 1. Implementa un programa en Java que pida al usuario una frase y diga cuál es su longitud.
	 */
	private static void pideFraseMuestraLongitud() {
		String frase;
		Scanner in = new Scanner(System.in);
		
		// Pedimos la frase
		System.out.println("Introduzca una frase:");
		frase = in.nextLine();
		
		// Mostramos su longitud
		System.out.println("\nLa frase tiene una longitud de: " + frase.length() + " caracteres.");
		
	}
	
	/*
	 * 2. Implementa un programa en Java que pida al usuario dos frases y diga:
	 * 			(a) Si son iguales, considerando que las mayúsculas son distintas de las minúsculas.
	 *			(b) Si son iguales, considerando que las mayúsculas son iguales a las minúsculas.
	 */
	private static void comparaFrasesIguales() {
		Scanner in = new Scanner(System.in);
		String frase1;
		String frase2;
		
		// Pedimos las dos frases
		System.out.println("Introduzca la primera frase:");
		frase1 = in.nextLine();
		System.out.println("Introduzca la segunda frase:");
		frase2 = in.nextLine();
		
		// Comparación distinguiendo mayúsculas
		if(frase1.equals(frase2))
			System.out.println("Las frases son iguales, considerando que las mayúsculas son distintas de las minúsculas.");
		else
			System.out.println("Las frases no son iguales, considerando que las mayúsculas son distintas de las minúsculas.");
		
		// Comparación sin distinguir mayúsculas
		if(frase1.equalsIgnoreCase(frase2))
			System.out.println("Las frases son iguales, considerando que las mayúsculas son iguales que las minúsculas.");
		else
			System.out.println("Las frases no son iguales, considerando que las mayúsculas son iguales que las minúsculas.");
	}
	
	/*
	 * 3. Implementa un programa en Java que pida al usuario palabras o frases hasta que introduzca una que comienza por la cadena “si”.
	 */
	private static void pideCadenaQueInicieSi() {
		Scanner in = new Scanner(System.in);
		String cadena;
		
		do {
			// Pedimos la frase
			System.out.println("Introduzca una cadena que comience por \"si\" para terminar:");
			cadena = in.nextLine();
		}while(!cadena.startsWith("si")); // Hasta que la cadena empiece por "si"
	}
	
	/*
	 * 4. Implementa un programa en Java que pida al usuario palabras o frases hasta que introduzca una que termine con un punto “.”.
	 */
	private static void pideCadenaQueIniciePunto() {
		Scanner in = new Scanner(System.in);
		String cadena;
		
		do {
			// Pedimos la frase
			System.out.println("Introduzca una cadena que termine por \".\" para terminar:");
			cadena = in.nextLine();
		}while(!cadena.endsWith(".")); // Hasta que la cadena termine en "."
	}
	
	
	/*
	 * 5. Escribe un programa en Java que pida al usuario una palabra o frase y realice las siguientes sustituciones:
	 *		 Carácter  Sustitución
	 *			a 			4
	 *			e 			3
	 *			i 			1
	 *			o 			0
	 *			t		 	7
	 *			s		 	5
	 *  Mostrando al final la palabra o frase resultante en mayúsculas.
	 */
	private static void sustituyeVocalesPorNumeros() {
		Scanner in = new Scanner(System.in);
		String frase;
		
		// Pedimos la frase
		System.out.println("Introduzca una frase:");
		frase = in.nextLine();
		
		// Transformamos la frase a mayúsculas
		frase = frase.toUpperCase();
		
		// Realizamos las sustituciones
		frase = frase.replace('A', '4');
		frase = frase.replace('E', '3');
		frase = frase.replace('I', '1');
		frase = frase.replace('O', '0');
		frase = frase.replace('T', '7');
		frase = frase.replace('S', '5');
		
		// Mostramos la frase
		System.out.println("La frase tras las sustituciones queda:\n" + frase);
	}
	
	/*
	 * 6. Implementa un programa que en Java que pida al usuario una frase y una palabra. También le preguntará si quiere o no
	 * 		diferenciar mayúsculas de minúsculas. Y mostrará por pantalla un mensaje informando si la palabra introducida aparece en la frase,
	 *		si es así mostrará cuántas veces, y en qué posiciones.
	 */
	private static void buscaPosicionesPalabraEnFrase() {
		Scanner in = new Scanner(System.in);
		String frase;
		String palabra;
		boolean diferenciaMayusculas;
		int aparicionesPalabra = 0;
		int posicionUltima;
		
		// Pedimos la frase y la palabra
		System.out.println("Introduzca una frase:");
		frase = in.nextLine();
		System.out.println("Introduzca una palabra:");
		palabra = in.nextLine();
		
		// Preguntamos si diferenciamos mayúsculas
		diferenciaMayusculas = Validaciones.pideYesNo("Desea diferenciar mayúsculas de minúsculas?");
		
		if(!diferenciaMayusculas) {
			frase = frase.toLowerCase();
			palabra = palabra.toLowerCase();
		}
		
		// Mientras haya una palabra en frase
		while((posicionUltima = frase.lastIndexOf(palabra)) != -1) {
			// Mostramos la posición de la palabra
			System.out.println("Encontrada la palabra " + palabra + " en la posición: " + posicionUltima);
			
			// Borramos la palabra de la frase
			frase = frase.substring(0, posicionUltima);
			
			aparicionesPalabra++;
		}
		System.out.println("El número de apariciones de la palabra fue de: " + aparicionesPalabra + " veces.");
	}
	
	/*
	 * 7. Basándote en los métodos que hemos visto para el tratamiento de cadenas, reescribe el método trim().
	 */
	private static void testeaTrimPersonalizado() {
		Scanner in = new Scanner(System.in);
		String cadena;
		
		System.out.println("Introduzca una cadena:");
		cadena = in.nextLine();
		
		cadena = trim(cadena);
		System.out.println("La cadena tras recortarla queda:");
		System.out.println(cadena);
	}
	
		private static String trim(String cadena) {
			
			while(cadena.startsWith(" "))
				cadena = cadena.substring(1);
			while(cadena.endsWith(" "))
				cadena = cadena.substring(0, cadena.length() - 1);
			
			return cadena;
		}
	
	/*
	 * 8. Ahora escribe un método que elimine todos los espacios en blanco de una cadena de texto.
	 */
	private static void eliminaEspaciosEnBlanco() {
		Scanner in = new Scanner(System.in);
		String cadena;
		
		System.out.println("Introduzca una cadena de texto:");
		cadena = in.nextLine();
		
		cadena = cadena.replace(" ", "");
		
		System.out.println("La nueva cadena es:");
		System.out.println(cadena);
	}
}
