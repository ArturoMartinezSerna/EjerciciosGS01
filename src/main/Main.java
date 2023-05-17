package main;

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
			}
		}while(opcion != 0);
	}
	
	private static void mostrarMenu() {
		System.out.println("***** Introduzca el número del ejercicio: *****");
		System.out.println("1: Ordenar 3 valores");
		System.out.println("2: Calcular factorial");
		System.out.println("3: Elevar potencia");
		System.out.println("4: Dos sumas hasta 200 y hasta que salga el 0");
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
		
}