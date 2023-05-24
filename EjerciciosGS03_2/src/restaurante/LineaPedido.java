package restaurante;


/*
 * 6. Clase LineasPedido. Esta clase asocia los productos pedidos dentro de un pedido concreto.
		Atributos:
		- Un número de línea.
		- Un objeto donde se vincule a un pedido.
		- Un objeto donde se asocie al producto comprado.
		- El número de unidades del producto comprado.
		- El importe total de la línea.
			Métodos:
				- Constructor por defecto. Únicamente inicializa los campos unidades e importe al
					valor 0.
				- Constructor donde únicamente se recibe el pedido.
					- Inicializar el atributo pedido de la clase.
					- Asigna el valor de 0 a los campos unidades e importe.
					- Calcula el número de línea, para ello, debe consultar el atributo líneas del
						objeto pedido (no olvides después actualizar el valor de líneas del objeto
						pedido, es decir, lo deberás incrementar en una unidad).
				- Constructor donde recibe el pedido, el producto y el número de unidades.
				 	- Inicializa los 3 atributos de la clase.
					- Obtiene el número de línea, para ello, debe consultar el atributo líneas del
						objeto pedido (no olvides después actualizar el valor de líneas del objeto
						pedido, es decir, lo deberás incrementar en una unidad).
					- Calcula el importe de la línea, es decir, será igual al precio del producto por
						las unidades y teniendo en cuenta el iva del producto (haz uso del método
						de la clase Utilidades).
					- Actualiza el importe del pedido (súmale el importe de la línea al total del
						pedido).
					- Si el importe de la línea es superior a 15 se le obsequiará al cliente con 20
						puntos, en caso contrario, se le darán 2 simbólicos puntos.
					- Deberás actualizar el stock del producto, es decir, decrementar el stock en
						tantas unidades como las pedidas.
				- Métodos para consultar los valores de todos los atributos de la clase.
				- Método toString(). Devuelve una cadena de caracteres con el siguiente
					información y formato:
						- Número y fecha del pedido – Línea “númeroLinea”
						- Título del producto – “unidades” unidades - “precio” precio – “iva” iva
						- Importe línea con el símbolo del euro al final.
 */
public class LineaPedido {
	int numLinea;
	Pedido pedido;
	Producto producto;
	int unidades;
	double importe;
	
	public LineaPedido() {
		super();
		unidades = 0;
		importe = 0;
	}

	public LineaPedido(Pedido pedido) {
		super();
		this.pedido = pedido;
		unidades = 0;
		importe = 0;
		this.numLinea = getNuevoNumLineaPedido(pedido);
	}
	
	public LineaPedido(Pedido pedido, Producto producto, int unidades) {
		this.pedido = pedido;
		this.producto = producto;
		this.unidades = unidades;
		this.numLinea = getNuevoNumLineaPedido(pedido);
		this.importe = Utilidad.getTotal(producto.getPrecio(), unidades, producto.getIva());
		this.pedido.setTotal(pedido.getTotal() + this.importe);
		if(importe > 15)
			pedido.cliente.setPuntos(pedido.cliente.getPuntos() + 20);
		else
			pedido.cliente.setPuntos(pedido.cliente.getPuntos() + 2);
		
		producto.setStock(producto.getStock() - unidades);
	}

		private int getNuevoNumLineaPedido(Pedido pedido) {
			numLinea = pedido.getLineas();
			pedido.setLineas(pedido.getLineas() + 1);
			return numLinea;
		}

		public int getNumLinea() {
			return numLinea;
		}

		public Pedido getPedido() {
			return pedido;
		}

		public Producto getProducto() {
			return producto;
		}

		public int getUnidades() {
			return unidades;
		}

		public double getImporte() {
			return importe;
		}

		@Override
		public String toString() {
			return "Número de pedido: " + pedido.getNumero() + ", Fecha del pedido: " + pedido.getFecha() + " -- Linea " + numLinea
					+ "\n" + producto.getTitulo() + " -- " + unidades + " unidades  -- " + producto.getPrecio() + " precio  --  " + producto.getIva() + " IVA"
					+ "\nImporte de línea: " + Utilidad.formato.format(importe);
		}
		
	
}
