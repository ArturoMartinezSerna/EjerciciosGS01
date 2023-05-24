package restaurante;

import java.util.Date;

public class Main {

	/*
	 * Queremos desarrollar un programa que permita realizar la gestión de un restaurante, para ello
	 * debemos desarrollar las siguientes clases:
	 */
	
	/*
	 * 7. Clase Principal
			Contendrá el método principal de la aplicación (main). Realizar las siguientes acciones:
			- Crea 3 categorías y 5 productos por cada categoría.
			- Visualiza los datos de todos los productos por consola.
			- A continuación, crea 2 clientes.
			- Seguidamente crea 2 pedidos uno por cada cliente.
			- Crea 3 líneas por cada pedido y visualiza sus datos por pantalla.
			- Por último, visualiza toda la información de cada uno de los pedidos por pantalla.
	 */
	public static void main(String[] args) {
		
		Categoria c1 = new Categoria("Frutas");
		Producto manzanas = new Producto("Manzanas", 2.15, 21, 10, c1);
		Producto peras = new Producto("Peras", 2.55, 15, 13, c1);
		Producto fresas = new Producto("Fresas", 2.25, 22, 11, c1);
		Producto melocotones = new Producto("Melocotones", 2.00, 21, 10, c1);
		Producto sandias = new Producto("Sandias", 5.99, 21, 10, c1);
		
		Categoria c2 = new Categoria("Verduras");
		Producto zanahorias = new Producto("Zanahorias", 2.15, 21, 10, c2);
		Producto patatas = new Producto("Patatas", 2.15, 21, 10, c2);
		Producto pepinos = new Producto("Pepinos", 2.15, 21, 10, c2);
		Producto pimientos = new Producto("Pimientos", 2.15, 21, 10, c2);
		Producto puerros = new Producto("Puerros", 2.15, 21, 10, c2);
		
		Categoria c3 = new Categoria("Carnes");
		Producto cerdo = new Producto("Cerdo", 2.15, 21, 10, c3);
		Producto caballo = new Producto("Caballo", 2.15, 21, 10, c3);
		Producto cabra = new Producto("Cabra", 2.15, 21, 10, c3);
		Producto vaca = new Producto("Vaca", 2.15, 21, 10, c3);
		Producto pollo = new Producto("Pollo", 2.15, 21, 10, c3);
		
		System.out.println(manzanas.toString());
		System.out.println(peras.toString());
		System.out.println(fresas.toString());
		System.out.println(melocotones.toString());
		System.out.println(sandias.toString());
		
		System.out.println(zanahorias.toString());
		System.out.println(patatas.toString());
		System.out.println(pepinos.toString());
		System.out.println(pimientos.toString());
		System.out.println(puerros.toString());

		System.out.println(cerdo.toString());
		System.out.println(caballo.toString());
		System.out.println(cabra.toString());
		System.out.println(vaca.toString());
		System.out.println(pollo.toString());
		
		Cliente cliente1 = new Cliente("Paco", "Martínez", "616161616");
		Cliente cliente2 = new Cliente();
		
		Pedido pedido1 = new Pedido(new Date(), cliente1);
		Pedido pedido2 = new Pedido();
		pedido2.setFecha(new Date());
		pedido2.setCliente(cliente2);
		
		LineaPedido l1 = new LineaPedido(pedido1, peras, 2);
		LineaPedido l2 = new LineaPedido(pedido1, patatas, 1);
		LineaPedido l3 = new LineaPedido(pedido1, puerros, 3);
		
		LineaPedido l4 = new LineaPedido(pedido2, vaca, 4);
		LineaPedido l5 = new LineaPedido(pedido2, cerdo, 5);
		LineaPedido l6 = new LineaPedido(pedido2, caballo, 10);
		
		System.out.println(pedido1.toString());
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		
		System.out.println(pedido2.toString());
		System.out.println(l4.toString());
		System.out.println(l5.toString());
		System.out.println(l6.toString());
	}

}
