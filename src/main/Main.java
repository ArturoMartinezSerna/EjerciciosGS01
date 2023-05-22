package main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int opcion;
		Scanner in = new Scanner(System.in);
		
		do {
			mostrarMenu();
			opcion = in.nextInt();
			
			switch(opcion) {
			case 1: pideOrdena3Valores();
			break;
			case 2: pideCalculaFactorial();
			break;
			case 3: pideCalculaPotencia();
			break;
			case 4: juegoDosSumas();
			break;
			case 5: juegoSecuenciaConsecutivaRepetida();
			break;
			case 6: pideCalculaPosicionNumero();
			break;
			case 7: calcula3NumerosPerfectos();
			break;
			case 8: buscaMayor10Decenas();
			break;
			case 9: suma100PrimerosEnteros();
			break;
			case 10: sumaMultiplos3(1, 1000);
			break;
			case 11: promedio3Notas();
			break;
			case 12: sumaEnterosImpares(0, 100);
			break;
			case 13: mostrarTablaNumero();
			}
		}while(opcion != 0);
	}
	
	private static void mostrarMenu() {
		System.out.println("***** Introduzca el número del ejercicio: *****");
		System.out.println(" 1: Ordenar 3 valores");
		System.out.println(" 2: Calcular factorial");
		System.out.println(" 3: Elevar potencia");
		System.out.println(" 4: Dos sumas hasta 200 y hasta que salga el 0");
		System.out.println(" 5: Secuencia consecutiva más repetida hasta que salga el 0");
		System.out.println(" 6: Calcula el valor del dígito de un número");
		System.out.println(" 7: Busca los primeros tres números perfectos");
		System.out.println(" 8: Busca el mayor número entre 10 decenas");
		System.out.println(" 9: Suma los primeros 100 enteros");
		System.out.println("10: Suma los múltiplos de 3 entre 1 y 1000");
		System.out.println("11: Calcula la media de 3 números");
		System.out.println("12: Suma los enteros impares entre 0 y 100");
		System.out.println("13: Mostrar la tabla de multiplicar de un número");
		System.out.println("0: Salir");
	}
	
	/*
	 * 1. Escribe un algoritmo que, introducidos por teclado tres valores, los represente en pantalla ordenados de mayor a menor.
	 */
	private static void pideOrdena3Valores() {
		Scanner in = new Scanner(System.in);
		int[] arrayInts = new int[3];
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Introduzca el " + i + " valor:");
			arrayInts[i-1] = in.nextInt();
		}
		
		arrayInts = Utilidad.ordenaValoresMm(arrayInts);
		
		System.out.println("Los valores ordenados de mayor a menor son:");
		Utilidad.mostrarArray(arrayInts);
	}
	
	/*
	 * 2. Escribe un algoritmo que dado un número natural que se introduce por teclado calcule su factorial.
	 */
	private static void pideCalculaFactorial() {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Introduzca un número del que calcular su factorial:");
		n = in.nextInt();
		
		System.out.println("El factorial de " + n + " es: " + Utilidad.calculaFactorial(n));
	}
	
	/*
	 * 3. Escribe un programa en Java que reciba dos números (x, y) muestre por pantalla el resultado de x elevado a y.
	 */
	private static void pideCalculaPotencia() {
		Scanner in = new Scanner(System.in);
		int x;
		int y;
		double resul;
		System.out.println("Introduzca la base de la potencia:");
		x = in.nextInt();
		System.out.println("Introduzca el exponente de la potencia:");
		y = in.nextInt();
		
		resul = Utilidad.calculaPotencia(x, y);
		
		System.out.println("El resultado de " + x + " elevado a " + y + " es: " + resul);
	}
	
	/*
	 * 4. Escribe un algoritmo que lea números introducidos de manera consecutiva y aleatoria por teclado hasta
			que el valor introducido sea 0 (cero). Suma todos los valores introducidos antes de que aparezca el
			primero mayor que 200. Por otra parte, suma todos los que entran a continuación de éste hasta la
			aparición del cero. Por último, el algoritmo deberá visualizar el número de introducciones (sin contar el
			cero ni el primer número mayor de 200), la primera suma y la segunda. Contempla la posibilidad de que
			entre antes el 0 que el primer número mayor de 200.
	 */
	private static void juegoDosSumas() {
		Scanner in = new Scanner(System.in);
		int primeraSuma = 0;
		int segundaSuma = 0;
		int num;
		System.out.println("Sumaremos los números introducidos hasta que se introduzca uno mayor de 200.");
		System.out.println("Introduzca 0 para finalizar.");
		
		do {
			System.out.println("Introduzca un número para la primera suma:");
			num = in.nextInt();
			primeraSuma += num;
			if(num > 200)
				primeraSuma -= num;
		}while(num != 0 && num <= 200);
		while(num != 0) {
			System.out.println("Introduzca un número para la segunda suma:");
			num = in.nextInt();
			segundaSuma += num;
		}
		
		System.out.println("La primera suma dio como resultado: " + primeraSuma);
		System.out.println("La segunda suma dio como resultado: " + segundaSuma);
	}
	
	/*
	 * 5. Escribe un algoritmo que lea números introducidos aleatoriamente por teclado hasta que el valor
			introducido sea 0 (cero). A continuación, deberá visualizar el número de introducciones efectuadas y la
			mayor secuencia de números consecutivos iguales, indicando cuál fue el número que se repitió y cuántas
			veces seguidas lo hizo.
	 */
	private static void juegoSecuenciaConsecutivaRepetida() {
		Scanner in = new Scanner(System.in);
		int numeroActual;
		int introducciones = 0;
		int repeticiones = 0;
		int numeroRepetido = 0;
		
		int recordRepeticiones = 0;
		int recordNumeroRepetido = 0;
		
		do {
			System.out.println("Introduzca un número entero por teclado, o 0 para terminar.");
			numeroActual = in.nextInt();
			
			if(numeroActual != 0) {
				introducciones++;
				
				if(numeroActual == numeroRepetido) {
					repeticiones++;
				}
				else {
					numeroRepetido = numeroActual;
					repeticiones = 1;
				}
				if(repeticiones >= recordRepeticiones) {
					recordRepeticiones = repeticiones;
					recordNumeroRepetido = numeroRepetido;
				}
			}
		} while(numeroActual != 0);
		
		System.out.println("Fin del juego!");
		System.out.println("Introducciones efectuadas: " + introducciones);
		System.out.println("Número que más se repitió: " + recordNumeroRepetido);
		System.out.println("Veces que se repitió: " + recordRepeticiones);
	}
	
	/*
	 * 6. Escribe un número que lea por teclado un número entero N y otro K, para después mostrar por pantalla
			el valor del K_ésimo dígito del número N empezando por la derecha.
	 */
	private static void pideCalculaPosicionNumero() {
		int posicion;
		int numero;
		int valorDigito;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero:");
		numero = in.nextInt();
		System.out.println("Introduzca el dígito empezando por la derecha que desea calcular:");
		posicion = in.nextInt();
		
		valorDigito = Utilidad.calculaPosicionNumero(numero, posicion);
		
		System.out.println("El valor del " + posicion + " digito es: " + valorDigito);
	}
	
	/*
	 * 7. Escribe un programa que encuentre los tres primeros números perfectos. Un número perfecto es un
			entero positivo igual a la suma de todos los enteros positivos (excluido el mismo) que son divisores del
			número. El primer número perfecto es el 6 = 1 + 2 + 3.
	 */
	private static void calcula3NumerosPerfectos() {
		int contadorPerfectos = 0;
		long lastPerfecto = 2;
		
		while(contadorPerfectos < 5) {
			System.out.print("Buscando el " + (1 + contadorPerfectos) + " número perfecto:");
			lastPerfecto = Utilidad.nextPerfecto(lastPerfecto);
			System.out.println(lastPerfecto);
			contadorPerfectos++;
		}
	}
	
	/*
	 * 8. Escribe un algoritmo que lea 100 números introducidos por teclado de forma aleatoria y consecutiva.
			Para cada 10 números introducidos se procederá a mostrar la decena actual y a la obtención del mayor de
			los números leídos de la decena. Por último, se deberá obtener el mayor valor introducido y en qué
			decena apareció.
	 */
	private static void buscaMayor10Decenas() {
		int actual;
		int record;
		int decenaRecord;
		
		record = buscaMayorDecena(1);
		decenaRecord = 1;
		
		for(int i = 2; i <= 10; i++) {
			actual = buscaMayorDecena(i);
			
			if(actual > record) {
				record = actual;
				decenaRecord = i;
			}
		}
		
		System.out.println("Fin del programa!");
		System.out.println("El mayor valor introducido fue el " + record + ", encontrado en la decena: " + decenaRecord);
	}
	
		private static int buscaMayorDecena(int decena) {
			Scanner in = new Scanner(System.in);
			String MENSAJE_PETICION = "Introduzca un número para la " + decena + " decena:";
			int actual;
			int record;
			System.out.println(MENSAJE_PETICION);
			record = in.nextInt();
			
			for(int i = 1; i < 10; i++) {
				System.out.println(MENSAJE_PETICION);
				actual = in.nextInt();
				
				if(actual > record)
					record = actual;
			}
			System.out.println("Finalizada la introducción de la " + decena + " decena");
			System.out.println("El mayor número fue el: " + record);
			return record;
		}
	
	/*
	 * 9. Realiza un programa en Java que sume los 100 primeros números enteros. Usa el bucle for
	 */
	private static void suma100PrimerosEnteros() {
		int suma;
		
		System.out.println("Calculando la suma de los 100 primeros números enteros:");
		suma = Utilidad.sumaMultiplosFor(1, 100, 1);
		
		System.out.println("La suma es: " + suma);
	}
	
	/*
	 * 10. Implementa un programa en Java que sume los múltiplos de 3 entre el 1 y el 1000. Usa el bucle for.
	 */
	private static void sumaMultiplos3(int inicio, int fin) {
		int suma;
		
		System.out.println("Calculando la suma de los múltiplos de 3 entre " + inicio + " y " + fin + ":");
		suma = Utilidad.sumaMultiplosFor(inicio, fin, 3);
		
		System.out.println("La suma es: " + suma);
	}
	
	/*
	 * 11. Implementa un programa en Java que calcule el promedio de 3 notas introducidas por teclado y
			muestre por pantalla el resultado. Cuida tanto el formato de entrada como el de salida.
	 */
	private static void promedio3Notas() {
		
		final int NUM_NOTAS = 3;
		
		Scanner in = new Scanner(System.in);
		int[] notas = new int[NUM_NOTAS];
		DecimalFormat format = new DecimalFormat("0.00");	
		for(int i = 0; i < NUM_NOTAS; i++) {
			System.out.println("Introduzca la " + i + " nota:");
			notas[i] = in.nextInt();
		}
		
		System.out.println("La media de las notas es: " + format.format(Utilidad.promedio(notas)));
	}
	
	/*
	 * 12. Escribe un programa en Java que sume los enteros impares entre 0 y 100. El programa debe
			implementarse de tres formas distintas:
			(a) Con un bucle while.
			(b) Con un bucle do­while.
			(c) Con un bucle for.
	 */
	private static void sumaEnterosImpares(int inicio, int fin) {
		int suma;
		
		suma = Utilidad.sumaMultiplosFor(inicio, fin, 2);
		suma = Utilidad.sumaMultiplosWhile(inicio, fin, 2);
		suma = Utilidad.sumaMultiplosDoWhile(inicio, fin, 2);
		
		System.out.println("La suma de los enteros impares entre " + inicio + " y " + fin + " es: " + suma);
	}
	
	/*
	 * 13. Realiza un programa en Java que lea por teclado un entero y muestre por pantalla la tabla de
			multiplicar correspondiente. Cuida tanto el formato de entrada como el de salida.
	 */
	private static void mostrarTablaNumero() {
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca el número del que mostrar su tabla de multiplicar:");
		numero = in.nextInt();
		
		System.out.println(Utilidad.tablaMultiplicar(numero));
	}
	
	/*
	 * 14. Escribe un programa en Java que analice los resultados de un examen. El usuario introducirá notas por
			teclado (­1 para terminar) y se debe ir mostrando si la nota equivale a: suspenso, suficiente, bien, notable
			o sobresaliente. El programa debe implementarse de tres formas distintas:
			(a) Con un bucle while.
			(b) Con un bucle do­while.
			(c) Con un bucle for.
			Cuida tanto el formato de entrada como el de salida.
	 */
	private static void analizaResultadosExamen() {
		
	}
}