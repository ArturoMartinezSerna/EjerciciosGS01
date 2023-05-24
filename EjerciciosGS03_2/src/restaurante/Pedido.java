package restaurante;

import java.text.DecimalFormat;
import java.util.Date;

/*
 * 		5. Clase Pedido
			- Almacena datos como son: el número, la fecha y el total del pedido, así como un objeto
				que se asocie al cliente que realizó el pedido.
			- Existe un atributo estático utilizado para generar los números de pedido.
			- También dispone de un atributo entero donde almacene el número de líneas pedidas
			- Queremos almacenar en un atributo el descuento que le vamos a aplicar al pedido (será
				numérico).
			- Métodos:
				- Constructor por defecto. Genera el valor del número de pedido, e inicializa a 0 los
					atributos total y líneas.
				- Constructor con parámetros (recibe únicamente la fecha y el objeto cliente)
					donde inicializa cada uno de los atributos de la clase.
						- Para el caso del número de pedido, su valor se genera utilizando el atributo
							estático de la clase, el valor de los atributos total y líneas será de 0.
						- Se deberá incrementar en una unidad el número de pedidos realizado por
							el cliente.
						- El valor del atributo descuento dependerá del tipo de cliente
								- Si el cliente es VIP, el valor del atributo descuento será de 15.
								- En caso contrario. El valor de descuento será de 5.
				- Métodos para consultar los valores de todos los atributos de la clase, excepto el
					atributo estático.
				- Métodos para modificar todos los atributos de la clase excepto el número, el
					atributo estático y el descuento. Para el método que modifique el cliente, deberá
					incrementar en una unidad el número de pedidos realizados por el cliente y
					calcular el descuento que le corresponde.
				- Método toString(). Devuelve una cadena de caracteres con el siguiente formato:
						- Número del pedido y fecha
						- Nombre y apellidos del cliente y el tipo de cliente que es.
						- Total del pedido sin descuento (con el símbolo del € al final)
						- Total del pedido con el descuento aplicado (con el símbolo del € al final)
				- Método toStringDivisa(). Recibe por parámetro el tipo de divisa (dólar o
					bitcoin). Devuelve lo mismo que el método toString() pero el total del pedido y el
					total del pedido con descuento será el equivalente teniendo en cuenta la divisa
					recibida, es decir, si recibe la divisa dólar, devolverá el total y el total con
					descuento en dólares en vez de euros.
 */

public class Pedido {

	int numero;
	Date fecha;
	double total;
	Cliente cliente;
	int lineas; // Número de lineas del pedido
	int descuento;
	
	static int nextNumero = 1;

	public Pedido() {
		super();
		this.total = 0;
		this.lineas = 0;
		this.numero = nextNumero++;
	}

	public Pedido(Date fecha, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = 0;
		this.lineas = 0;
		this.numero = nextNumero++;
		this.descuento = calculaDescuentoNuevoPedido(cliente);
	}

	public int getNumero() {
		return numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		descuento = calculaDescuentoNuevoPedido(cliente);
		this.cliente = cliente;
	}
	
		// Calcula el descuento tras meter un nuevo pedido, y lo devuelve (pero no lo actualiza aún)
		private int calculaDescuentoNuevoPedido(Cliente cliente) {
			cliente.setNumPedidos(cliente.getNumPedidos() + 1);
			return cliente.getTipo().equals("cliente vip") ? 15 : 5;
		}

	public int getLineas() {
		return lineas;
	}

	public void setLineas(int lineas) {
		this.lineas = lineas;
	}

	public int getDescuento() {
		return descuento;
	}

	@Override
	public String toString() {
		return "Pedido [numero del pedido:" + numero + ", fecha:" + fecha
				+ "\nNombre: " + cliente.getNombre() + " " + cliente.getApellidos() + " tipo de cliente: " + cliente.getTipo()
				+ "\nTotal del pedido sin descuento:" + Utilidad.formato.format(total)
				+ "\nTotal del pedido con descuento:" + Utilidad.formato.format(Utilidad.getDescuento(total, descuento));
	}
	
	/**
	 * Igual que toString(), pero con divisas en dolares o en bitcoin
	 * @param dolar true para divisa dolar, false para divisa bitcoin
	 * @return un toString con la divisa en dolares o en bitcoins
	 */
	public String toStringDivisa(boolean dolar) {
		return "Pedido [numero del pedido:" + numero + ", fecha:" + fecha
				+ "\nNombre: " + cliente.getNombre() + " " + cliente.getApellidos() + " tipo de cliente: " + cliente.getTipo()
				+ "\nTotal del pedido sin descuento:" + Utilidad.formato.format(dolar ? Utilidad.getDolares(total) : Utilidad.getBitcoins(total))
				+ "\nTotal del pedido con descuento:" + Utilidad.formato.format(Utilidad.getDescuento(dolar ? Utilidad.getDolares(total) : Utilidad.getBitcoins(total), descuento));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
