package main;

public class Utilidad {
	
	/**
	 * Ordena un array de valores de mayor a menor
	 * @param valores
	 * @return el array ordenado de mayor a menor
	 */
	public static int[] ordenaValoresMm(int[] valores) {
		int n = valores.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				
				if(valores[j+1] > valores[j]) {
					// Intercambiamos posiciones
					int temp = valores[j];
					valores[j] = valores[j+1];
					valores[j+1] = temp;
				}
			}
		}
		return valores;
	}
	
	/**
	 * Muestra los valores del array por consola
	 * @param valores el array a mostrar
	 */
	public static void mostrarArray(int[] valores) {
		for(int valor : valores) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	/**
	 * Calcula el factorial de un número
	 * @param n el número del que calcular el factorial
	 * @return el factorial del número
	 * @throws IllegalArgumentException cuando se le pasa un número negativo
	 */
	public static int calculaFactorial(int n) throws IllegalArgumentException{
		int factorial = 1;
		
		if(n < 0)
			throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
		
		for(int i = 2; i <= n; i++) {
			factorial *= i;
		}
		
		return factorial;
	}

	/**
	 * Calcula la potencia de un número, sea positivo, negativo o decimal.
	 * @param base la base de la potencia
	 * @param exponente el exponente de la potencia
	 * @return el valor de la potencia
	 * @throws IllegalArgumentException cuando se intenta elevar 0 a 0
	 */
	public static double calculaPotencia(int base, int exponente) throws IllegalArgumentException {
		double resul = 1;
		boolean expNegativo = exponente < 0;
		
		if(base == 0 && exponente == 0)
			throw new IllegalArgumentException("Imprecisión. No se puede elevar 0 a 0.");		
		if(exponente == 0)
			return 1;
		if(base == 0)
			return 0;
		
		exponente = Math.abs(exponente);
		
		resul = calculaPotenciaRecursive(base, exponente);
		
		if(!expNegativo)
			return resul;
		else
			return 1/resul;
	}

		// Calcula el valor de una potencia dados b && e != 0, con exponente positivo
		private static double calculaPotenciaRecursive(int b, int e) {
			if(e == 1)
				return b;
			
			if(e % 2 == 0)
				return calculaPotenciaRecursive(b*b, e/2);
			else
				return b * calculaPotenciaRecursive(b*b, (e-1) / 2);
		}
	
		/**
		 * Calcula el valor de la posición empezando por la derecha
		 * @param numero el número del que calcular
		 * @param posicion la posición a calcular
		 * @return el valor del dígito empezando por la derecha
		 */
	public static int calculaPosicionNumero(int numero, int posicion) {
		int valorPosicion = 1;
		
		for(int i = 0; i < posicion; i++) {
			valorPosicion *= 10;
		}
		// Eliminamos los digitos a la izquierda
		numero = numero % valorPosicion;
		
		// Eliminamos los dígitos a la derecha
		numero = numero / (valorPosicion / 10);
		
		return numero;
	}
	
	
	public static long nextPerfecto(long numero) {
		long checkeo = 10;
		for(long i = numero + 1; ; i++) {
			if(isPerfecto(i))
				return i;
			if(numero > checkeo)
			{
				System.out.println("Checkeo! Número mayor de " + checkeo);
				checkeo *= 10;
			}
		}
	}
	
		/**
		 * Calcula si el número recibido es un número perfecto
		 * Un número es perfecto si la suma de sus divisores da el mismo número (contando el 1, sin contar el propio número)
		 * @param numero es el número perfecto
		 * @return true si es perfecto, false si no es perfecto
		 */
		public static boolean isPerfecto(long numero) {
			long sumaDivisores = 1;
			long siguienteDivisor = 2;
						
			while(siguienteDivisor <= Math.sqrt(numero)){
				
				if(numero % siguienteDivisor == 0) {
					sumaDivisores += siguienteDivisor;
					long cociente = numero / siguienteDivisor;
					
					if(cociente != siguienteDivisor)
						sumaDivisores += cociente;
				}
				
				siguienteDivisor++;
			}

			return sumaDivisores == numero;
		}

	/**
	 * Calcula el número primo posterior más cercano al número recibido
	 * @param numero es el número a partir del cual buscamos un primo
	 * @return el número primo siguiente
	 */
	public static int nextPrimo(int numero) {
		
		while(true) {
			numero++;
			if(isPrimo(numero))
				return numero;
		}
	}
	
		/**
		 * Recibe un número, y calcula si es primo o no
		 * @param numero el número primo
		 * @return true si es primo, false si no es primo.
		 */
		public static boolean isPrimo(int primo) {
			
			for(int i = 2; i <= Math.sqrt(primo); i++) {
				if(primo % i == 0) {
					return false;
				}
					
			}
			return true;
		}
}