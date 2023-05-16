package main;

public class Utilidades {
	
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
		for(int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
	}
	
	public static int calculaFactorial(int n) {
		int factorial = 1;
		
		for(int i = 2; i <= n; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
}