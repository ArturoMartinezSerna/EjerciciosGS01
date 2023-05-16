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
			}
		}while(opcion != 0);
	}
	
	private static void mostrarMenu() {
		System.out.println("***** Introduzca el número del ejercicio: *****");
		System.out.println("1: Ordenar 3 valores");
		System.out.println("2: Calcular factorial");
		System.out.println("3: Elevar potencia");
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
		
		arrayInts = Utilidades.ordenaValoresMm(arrayInts);
		
		System.out.println("Los valores ordenados de mayor a menor son:");
		Utilidades.mostrarArray(arrayInts);
	}
	
	/*
	 * 2. Escribe un algoritmo que dado un número natural que se introduce por teclado calcule su factorial.
	 */
	private static void pideCalculaFactorial() {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Introduzca un número del que calcular su factorial:");
		n = in.nextInt();
		
		System.out.println("El factorial de " + n + " es: " + Utilidades.calculaFactorial(n));
	}
	
	/*
	 * 3. Escribe un programa en Java que reciba dos números (x, y) muestre por pantalla el resultado de x elevado a y.
	 */
	
}