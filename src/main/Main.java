package main;

import java.text.DecimalFormat;
import java.util.Random;
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
			break;
			case 14: analizaResultadosExamen();
			break;
			case 15: esPrimo();
			break;
			case 16: cuentaDigitosNumero();
			break;
			case 17: sumaXVeces();
			break;
			case 18: sumaMultiplosCualquiera();
			break;
			case 19: cuentaNegativos();
			break;
			case 20: muestraMayorMenorMedia();
			break;
			case 21: muestraTablasDel1Al10();
			break;
			case 22: muestraRectangulo();
			break;
			case 23: mostrarTriangulo();
			break;
			case 24: mostrarTrianguloInvertido();
			break;
			case 25: mostrarRectanguloHueco();
			break;
			case 26: mostrarPiramide();
			break;
			case 27: multiplo2Y5();
			break;
			case 28: dobleONada();
			break;
			case 29: averiguaSignoZodiaco();
			break;
			case 30: dobleONadaInfinito();
			break;
			case 31: adivinaNumero(1, 6);
			break;
			case 32: password();
			break;
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
		System.out.println("14: Analizar los resultados de un examen");
		System.out.println("15: Calcular si un número es primo");
		System.out.println("16: Mostrar el número de dígitos de un número");
		System.out.println("17: Sumar una cantidad determinada de veces");
		System.out.println("18: Suma de multiplos de un número");
		System.out.println("19: Cuenta de las introducciones negativas");
		System.out.println("20: Muestra del mayor, menor y la media de las introducciones");
		System.out.println("21: Muestra las tablas de multiplicar del 1 al 10");
		System.out.println("22: Mostrar un rectángulo");
		System.out.println("23: Mostrar un triángulo");
		System.out.println("24: Mostrar un triángulo invertido");
		System.out.println("25: Mostrar un rectángulo hueco");
		System.out.println("26: Mostrar una pirámide");
		System.out.println("27: Determinar si un número es múltiplo de 2 y de 5");
		System.out.println("28: Jugar al doble o nada una vez");
		System.out.println("29: Averiguar el signo zodiacal");
		System.out.println("30: Jugar al doble o nada a peticion");
		System.out.println("31: Jugar a adivinar un número");
		System.out.println("32: Acceder con la contraseña");
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
			teclado (­-1 para terminar) y se debe ir mostrando si la nota equivale a: suspenso, suficiente, bien, notable
			o sobresaliente. El programa debe implementarse de tres formas distintas:
			(a) Con un bucle while.
			(b) Con un bucle do­while.
			(c) Con un bucle for.
			Cuida tanto el formato de entrada como el de salida.
	 */
	private static void analizaResultadosExamen() {
		int nota;
		
		/*
		do {
			nota = pideNota();
			System.out.println(transposeNota(nota));
		} while(nota != -1);
		
		nota = pideNota();
		System.out.println(transposeNota(nota));
		
		while(nota != -1) {
			nota = pideNota();
			System.out.println(transposeNota(nota));
		}
		*/
		
		for(nota = pideNota(); nota != -1; nota = pideNota()) {
			System.out.println(transposeNota(nota));
		}
			
	}
	
		private static int pideNota() {
			Scanner in = new Scanner(System.in);
			System.out.println("Introduzca la nota del alumno, o -1 para terminar:");
			return in.nextInt();
		}
		
		private static String transposeNota(int nota) {
			if(nota <= 10 && nota >= 9)
				return "Sobresaliente";
			else if(nota >= 7)
				return "Notable";
			else if(nota >= 6)
				return "Bien";
			else if(nota >= 5)
				return "Suficiente";
			else if(nota >= 0)
				return "Suspenso";
			else if(nota == -1)
				return "Gracias por utilizar nuestra aplicación";
			else
				return "Introduzca un valor válido";
		}
		
	/*
	 * 15. Implementa un programa en Java que dado un número introducido por teclado, averigue si es o no un
			número primo.
	 */
	private static void esPrimo() {
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Por favor, introduzca un número para calcular si es o no un número primo:");
		numero = in.nextInt();
		
		if(Utilidad.isPrimo(numero))
			System.out.println("El número es primo");
		else
			System.out.println("El número no es primo");
	}
	
	/*
	 * 16. Escribe un programa en Java que dado un número entero introducido por teclado muestre por pantalla
			de cuántos digitos está formado. Por ejemplo: 72045 está formado por 5 dígitos.
	 */
	private static void cuentaDigitosNumero() {
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduzca el número del que contar sus dígitos:");
		numero = in.nextInt();
		
		System.out.println("El número de dígitos del número " + numero + " es: " + Utilidad.cuentaDigitos(numero));
	}
	
	/*
	 * 17. Escribe un programa que pregunte cuantos números vas a introducir, pida esos números y calcule su
			suma. Usa un bucle for.
	 */
	private static void sumaXVeces() {
		Scanner in = new Scanner(System.in);
		int veces;
		int suma = 0;
		
		veces = pideIntroducciones();
		
		for(int i = 1; i <= veces; i++) {
			System.out.println("Introduzca el " + i + " sumando:");
			suma += in.nextInt();
		}
		
		System.out.println("El resultado de la suma es: " + suma);
	}
	
	/*
	 * 18. Implementa un programa en Java que sume los múltiplos de un número entero introducido por el
			usuario por teclado. Debe sumar los múltiplos de dicho número entre el 1 y el límite que decida el
			usuario.
	 */
	private static void sumaMultiplosCualquiera() {
		Scanner in = new Scanner(System.in);
		int fin;
		int multiplo;
		int suma;
		
		System.out.println("Introduzca el límite donde dejar de sumar múltiplos:");
		fin = in.nextInt();
		
		System.out.println("Introduzca el número entero del cual sumar sus múltiplos:");
		multiplo = in.nextInt();
		
		suma = Utilidad.sumaMultiplosFor(1, fin, multiplo);
		
		System.out.println("La suma de los múltiplos de " + multiplo + " entre " + 1 + " y " + fin + " es: " + suma);
	}
	
	/*
	 * 19. Escribe un programa que pregunte cuántos números vas a introducir, pida esos números y escriba
			cuántos negativos has puesto. Usa un bucle for.
	 */
	private static void cuentaNegativos() {
		Scanner in = new Scanner(System.in);
		int negativos = 0;
		int limite;
		
		limite = pideIntroducciones();
		
		for(int i = 1; i <= limite; i++) {
			System.out.println("Introduzca el " + i + " numero:");
			if(in.nextInt() < 0)
				negativos++;
		}
		
		System.out.println("Ha introducido: " + negativos + " números negativos.");
	}
	
	/*
	 * 20. Escribe un programa que pregunte cuántos números vas a introducir, pida esos números, y escriba el
			mayor, el menor y la media. Usa un bucle for.
	 */
	private static void muestraMayorMenorMedia() {
		Scanner in = new Scanner(System.in);
		int mayor;
		int menor;
		double media;
		int introducciones;
		int numeroIntroducido;
		DecimalFormat formato = new DecimalFormat("0.00");
		
		introducciones = pideIntroducciones();
		
		System.out.println("Introduzca el " + 1 + " numero:");
		numeroIntroducido = in.nextInt();
		
		media = numeroIntroducido;
		mayor = numeroIntroducido;
		menor = numeroIntroducido;
		
		for(int i = 2; i <= introducciones; i++) {
			System.out.println("Introduzca el " + i + " numero:");
			numeroIntroducido = in.nextInt();
			
			media += numeroIntroducido;
			
			if(numeroIntroducido > mayor)
				mayor = numeroIntroducido;
			if(numeroIntroducido < menor)
				menor = numeroIntroducido;
		}
		media = (double) (media / introducciones);
		
		System.out.println("El mayor número introducido fue el: " + mayor);
		System.out.println("El menor número introducido fue el: " + menor);
		System.out.println("La media de los números introducidos es:" + formato.format(media));
	}
	
	private static void muestraTablasDel1Al10() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Utilidad.tablaMultiplicar(i));
		}
	}
	
	
	/*
	 * 22. Escribe un programa que pida la anchura y altura de un rectángulo y lo dibuje de la siguiente manera:
			Anchura del rectángulo: 5
			Altura del rectángulo: 3
					*****
					*****
					*****
	 */
	private static void muestraRectangulo() {
		Scanner in = new Scanner(System.in);
		int alto;
		int ancho;
		String rectangulo;
		
		System.out.print("Anchura del rectángulo:");
		ancho = in.nextInt();
		System.out.print("Altura del rectángulo:");
		alto = in.nextInt();
		
		rectangulo = Geometria.creaRectangulo(alto, ancho);
		
		System.out.println(rectangulo);
	}
	
	/*
	 * 23. Escribe un programa que pida la altura de un triángulo y lo dibuje de la siguiente manera:
			Altura del triángulo: 4
			*
			**
			***
			****
			Usa un bucle for.
	 */
	private static void mostrarTriangulo() {
		Scanner in = new Scanner(System.in);
		int alto;
		String triangulo;
		
		System.out.print("Altura del triangulo:");
		alto = in.nextInt();
		
		triangulo = Geometria.creaTriangulo(alto);
		
		System.out.println(triangulo);
	}
	
	
	/*
	 * 24. Escribe un programa que pida la altura de un triángulo y lo dibuje de la siguiente manera:
			Altura del triángulo: 4
			****
			***
			**
			*
			Usa un bucle for.
	 */
	private static void mostrarTrianguloInvertido() {
		Scanner in = new Scanner(System.in);
		int alto;
		String triangulo;
		
		System.out.print("Altura del triangulo:");
		alto = in.nextInt();
		
		triangulo = Geometria.creaTrianguloInvertido(alto);
		
		System.out.println(triangulo);
	}
	
	/*
	 * 25. Escribe un programa que pida la anchura y altura de un rectángulo y lo dibuje de la siguiente manera:
		Anchura del rectángulo: 5
		Altura del rectángulo: 4
		*****
		*	*
		*	*
		*****
		Usa un bucle for.
	 */
	private static void mostrarRectanguloHueco() {
		Scanner in = new Scanner(System.in);
		int alto;
		int ancho;
		String rectangulo;
		
		System.out.print("Anchura del rectángulo:");
		ancho = in.nextInt();
		System.out.print("Altura del rectángulo:");
		alto = in.nextInt();
		
		rectangulo = Geometria.creaRectanguloHueco(alto, ancho);
		
		System.out.println(rectangulo);
	}
	
	/*
	 * 26. Escribe un programa que pida la altura de un triángulo y lo dibuje de la siguiente manera:
			Altura del triángulo: 5
				    *
				   ***
				  *****
				 *******
				*********
			Usa un bucle for.
	 */
	private static void mostrarPiramide() {
		Scanner in = new Scanner(System.in);
		int altura;
		String piramide;
		
		System.out.print("Altura del triángulo:");
		altura = in.nextInt();
		
		piramide = Geometria.creaPiramide(altura);
		
		System.out.println(piramide);
	}
	
	/*
	 * 27. Escribir un programa que pida un número entero y determine si es múltiplo de 2 y de 5.
	 */
	private static void multiplo2Y5() {
		Scanner in = new Scanner(System.in);
		int numero;
		
		System.out.println("Por favor, introduzca un número del que calcular si es múltiplo de 2 y de 5.");
		numero = in.nextInt();
		
		if(numero % 2 == 0)
			System.out.println("El número es múltiplo de 2");
		if(numero % 5 == 0)
			System.out.println("El número es múltiplo de 5");
		if(numero % 2 != 0 && numero % 5 != 0)
			System.out.println("El número no es múltiplo ni de 2 ni de 5");
	}
	
	/*
	 * 28. Escribir un programa que permita jugar a doble o nada: El jugador apuesta una cantidad y tira una
			moneda. Si sale cara obtiene el doble de la cantidad apostada. Si sale cruz la pierde todo.
	 */
	private static void dobleONada() {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int apuesta;
		
		System.out.println("Introduzca cúanto desea jugarse:");
		apuesta = in.nextInt();
		
		if(random.nextInt() % 2 == 0) {
			apuesta *= 2;
			System.out.println("Has ganado! Ahora tienes " + apuesta);
		}
		else {
			apuesta = 0;
			System.out.println("Has perdido. Ahora tienes " + apuesta);
		}
		
	}
	
	/*
	 * 29. Escribir un programa que, pida la fecha de nacimiento de una persona e imprima por pantalla su signo
			zodiacal.
	 */
	private static void averiguaSignoZodiaco() {
		Scanner in = new Scanner(System.in);
		int dia;
		int mes;
		int anio;
		String signoZodiaco;
		

		System.out.println("Introduzca su día de nacimiento:");
		dia = in.nextInt();
		
		System.out.println("Introduzca su mes de nacimiento:");
		mes = in.nextInt();
		
		System.out.println("Introduzca su año de nacimiento:");
		anio = in.nextInt();
		
		signoZodiaco = Utilidad.signoZodiaco(dia, mes);
		
		System.out.println("Su signo del zodíaco es: " + signoZodiaco);
	}
	
	
	/*
	 * 30. Modificar el programa del juego de doble o nada para que permita ir jugando hasta que el jugador
			decida abandonar el juego. El programa debe sacar por pantalla el número de jugadas y el total ganado
			por el jugador (si ha perdido debe ser una cantidad negativa).
	 */
	private static void dobleONadaInfinito() {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		String respuesta = "";
		int apuesta;
		
		System.out.println("Introduzca cúanto desea jugarse:");
		apuesta = in.nextInt();
		in.nextLine();
		do {
			if(random.nextInt() % 2 == 0) {
				apuesta *= 2;
				System.out.println("Has ganado! Ahora tienes " + apuesta);
			}
			else {
				apuesta = 0;
				System.out.println("Has perdido. Ahora tienes " + apuesta);
			}
			if(apuesta != 0) {
				do {
					System.out.println("Desea volver a jugar? Si | No");
					respuesta = in.nextLine();
				}while(!respuesta.equalsIgnoreCase("no") && !respuesta.equalsIgnoreCase("si"));
			}
		}while(respuesta.equalsIgnoreCase("si") && apuesta != 0);
		System.out.println("Gracias por jugar a \"Doble o Nada!\"");
	}
	
	
	/*
	 * 31. Escribir un programa para jugar a adivinar un número entre 1 y 6 (generado al azar por el ordenador)
			hasta acertarlo o decirlos todos.
	 */
	private static void adivinaNumero(int minimo, int maximo) {
		Scanner in = new Scanner(System.in);
		int intento;
		int contadorIntentos = 0;
		
		int adivinanza = (int)(Math.random()*6) + 1;
		System.out.println("Cheat: " + adivinanza);
		while(contadorIntentos < maximo + 1 - minimo) {
			System.out.println("Se ha generado un número entre " + minimo +" y " + maximo + ". Intente adivinarlo:");
			intento = in.nextInt();
			contadorIntentos++;
			if(intento == adivinanza) {
				System.out.println("Correcto!");
				return;
			}
			else
				System.out.println("Incorrecto!");
		}
		if(contadorIntentos == maximo + 1 - minimo)
			System.out.println("Se acabaron los intentos...");
	}
	
	
	/*
	 * 32. Uno de los usos más habituales para los bucles condicionales es la validación de entradas. Escribir un
			programa que pida una contraseña y permita tres intentos. Si el usuario da la contraseña correcta responde
			"Enhorabuena!" y queda inactivo, con este mensaje. En caso contrario el programa escribe "Lo siento,
			contraseña equivocada" y se cierra de inmediato.
	 */
	private static void password() {
		Scanner in = new Scanner(System.in);
		final String PASS = "May the bahamuts rise again";
		int intentos = 3;
		String intentoPass = "";
		
		while(intentos > 0 && !intentoPass.equals(PASS)) {
			System.out.println("Introduzca su contraseña. " + intentos + " intentos restantes.");
			intentoPass = in.nextLine();
			intentos--;
			
			if(intentoPass.equals(PASS)) {
				System.out.println("Enhorabuena!");
			}
			else
				System.out.println("Contraseña equivocada.");
		}
		
		if(intentoPass.equals(PASS)) {
			while(true) {
				// Programa
			}
		}
		else {
			System.out.println("Se acabaron los intentos.");
			System.exit(0);
		}
	}
	
	/**
	 * Pide el número de introducciones que hará el usuario y lo devuelve
	 * @return el número de introducciones que el usuario efectuará
	 */
	private static int pideIntroducciones() {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca cuántas introducciones va a efectuar:");
		return in.nextInt();
	}
}