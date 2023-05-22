package main;

public class Geometria {

	
	/**
	 * *******
	 * *******
	 * *******
	 * @return un String que contiene un rectangulo de asteriscos
	 */
	public static String creaRectangulo(int alto, int ancho) {
		String rectangulo = "";
		
		for(int i = 1; i <= alto; i++) {
			rectangulo += lineaCaracteres(ancho, '*') + "\n";
		}
		
		return rectangulo;
	}
	
	/**
	 * *
	 * **
	 * ***
	 * ****
	 * @return un String que contiene un triangulo de asteriscos
	 */
	public static String creaTriangulo(int alto) {
		String triangulo = "";
		for(int i = 1; i <= alto; i++) {
			triangulo += lineaCaracteres(i, '*') + "\n";
		}
		return triangulo;
	}
	
	/**
	 * *****
	 * *   *
	 * *   *
	 * *****
	 * 
	 * @return un String que contiene un rectángulo lleno de espacios
	 */
	public static String creaRectanguloHueco(int alto, int ancho) {
		String rectangulo = "";
		
		
		// Borde superior
		if(alto > 0)
			rectangulo += lineaCaracteres(ancho, '*') + "\n";
		
		// Niveles del medio
		for(int i = 2; i <= alto - 1; i++) {
			// Borde lateral izquierdo
			rectangulo += lineaCaracteres(1, '*');
			
			// Espacios y borde lateral derecho
			rectangulo += lineaEspaciada(1, ancho - 2, 0, '*') + "\n";
		}
		
		// Borde inferior
		if(alto > 1)
			rectangulo += lineaCaracteres(ancho, '*') + "\n";
		
		return rectangulo;
	}
	
	/**
	 * Crea un triángulo pegado a la derecha
	 * @param alto la altura del triangulo
	 * @return un String con el triangulo invertido
	 */
	public static String creaTrianguloInvertido(int alto) {
		String triangulo = "";
		for(int i = 1; i <= alto; i++) {
			triangulo += lineaEspaciada(i, alto - i, 0, '*') + "\n";
		}
		return triangulo;
	}
	
	/**
	 *   *  
	 *  ***
	 * *****
	 * Crea una piramide de alto pisos
	 * @param alto el número de pisos de la pirámide
	 * @return un String con la pirámide
	 */
	public static String creaPiramide(int alto) {
		String piramide = "";
		
		for(int i = 0; i < alto; i++) {
			piramide += lineaEspaciada(1 + 2 * i, alto - 1 - i, alto - 1 - i, '*') + "\n";
		}
		
		return piramide;
	}
	
	
	public static String lineaEspaciada(int caracteres, int antesEspacios, int despuesEspacios, char caracter) {
		String linea;
		
		linea = lineaCaracteres(antesEspacios, ' ') + lineaCaracteres(caracteres, caracter) + lineaCaracteres(despuesEspacios, ' ');
		
		return linea;
	}
	
	public static String lineaCaracteres(int caracteres, char caracter) {
		String linea = new String("");
		
		for(int i = 0; i < caracteres; i++)
			linea += caracter;
		
		return linea;
	}
}
