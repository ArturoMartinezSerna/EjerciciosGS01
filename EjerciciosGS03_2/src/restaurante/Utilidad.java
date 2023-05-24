package restaurante;

import java.text.DecimalFormat;

/*
 * 1. Clase Utilidades. Esta clase dispondrá de una serie de métodos útiles en el resto de clases
		de la aplicación, por tanto, los métodos serán estáticos.
		Contiene las siguientes constantes:
		 - dolar: 1.17521 (corresponde a los dólares que equivalen 1€)
		 - bitcoin: 0.000154250 (bitcoins que equivalen 1€)
		Métodos estáticos:
		 - getDolares. Devuelve el número de dólares que equivalen una cantidad de euros
						pasados por parámetro.
		 - getBitcoins. Igual que el método anterior, pero devuelve las bitcoins equivalentes.
		 - getFormatoNombre. Recibe por parámetro una cadena de caracteres y devuelve
								la misma cadena, pero la primera letra estará en mayúscula y el resto en
								minúscula.
		 - getTotal. Recibe 3 parámetros: precio, unidades e iva, devuelve el total de aplicar
						la unidades por el precio y el iva recibido.
		- getDescuento. Recibe 2 parámetros: total y descuento, retorna el total aplicando
						el descuento recibido
 */
public class Utilidad {
	private final static double DOLAR = 1.17521; // Dólares que equivalen a 1€
	private final static double BITCOIN = 0.000154250; // Bitcoins que equivalen a 1€
	
	public static DecimalFormat formato = new DecimalFormat("00.00€");
	
	/**
	 * Devuelve el número de dólares que equivalen a una cantidad de euros pasados por parámetro
	 * @param euros la cantidad de euros
	 * @return los dólares que corresponden a euros
	 */
	public static double getDolares(double euros) {
		return (double)(euros * DOLAR);
	}

	/**
	 * Devuelve el número de bitcoins que equivalen a una cantidad de euros pasados por parámetro
	 * @param euros la cantidad de euros
	 * @return los bitcoins que corresponden a euros
	 */
	public static double getBitcoins(double euros) {
		return (double)(euros * BITCOIN);
	}
	
	/**
	 * Transforma una cadena, poniendo su primera letra mayúscula y el resto en minúscula
	 * @param nombre el String a transformar
	 * @return el String en formato primera letra mayúscula y resto minúscula
	 */
	public static String getFormatoNombre(String nombre) {
		return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
	}
	
	/**
	 * Calcula el precio total de un conjunto del mismo producto
	 * @param precio el precio del producto
	 * @param unidades las unidades compradas
	 * @param iva el iva del producto
	 * @return devuelve el total de aplicar unidades * precio * iva
	 */
	public static double getTotal(double precio, int unidades, double iva) {
		return (precio * unidades + (double)(iva * precio * unidades / 100));
	}
	
	/**
	 * Aplica el descuento recibido a total, y lo aplica
	 * @param total el total de los productos
	 * @param descuento el descuento aplicado
	 * @return el total con el descuento aplicado
	 */
	public static double getDescuento(double total, int descuento) {
		 return (total - (double)(total * descuento / 100));
	}
}
