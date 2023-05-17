package main;

public class Utilidad {
	
	// Ordena arrays por el método burbuja
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
	
	public static void mostrarArray(int[] valores) {
		for(int valor : valores) {
			System.out.print(valores[valor] + " ");
		}
	}
	
	public static int calculaFactorial(int n) throws IllegalArgumentException{
		int factorial = 1;
		
		if(n < 0)
			throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
		
		for(int i = 2; i <= n; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	// TODO: recursive
	public static double calculaPotencia(int b, int e) throws IllegalArgumentException {
		double resul = 1;
		boolean expNegativo = e < 0;
		
		if(b == 0 && e == 0)
			throw new IllegalArgumentException("Imprecisión. No se puede elevar 0 a 0.");		
		if(e == 0)
			return 1;
		if(b == 0)
			return 0;
		
		e = Math.abs(e);
		
		for(int i = 0; i < e; i++) {
			resul *= b;
		}
		
		if(!expNegativo)
			return resul;
		else
			return 1/resul;
	}
		// todo: recursive
		private static double calculaPotenciaRecursive(int b, int e) {
			if(e == 1)
				return b;
			
			return 0;
		}
	
}