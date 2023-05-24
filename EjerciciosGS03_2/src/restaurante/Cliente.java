package restaurante;

/*
 * 4. Clase Cliente
		- Almacena datos como son: código, nombre, apellidos, móvil. También dispone de un
				atributo denominado “puntos” que almacenará datos numéricos enteros, y un atributo
				donde almacenará el número de pedidos realizados por el cliente.
		- Dispone de un atributo estático utilizado para generar los códigos de los clientes
				nuevos.
		- Métodos:
				- Constructor por defecto. Genera el valor del atributo código, e inicializa a 0 los
						atributos de puntos y número de pedidos.
				- Constructor con parámetros donde inicializa cada uno de los atributos de la clase
						excepto los atributos código, puntos y número de pedidos (no se reciben por
						parámetro). Para el caso del código su valor se genera utilizando el atributo
						estático de la clase, y para los atributos puntos y número de pedidos se
						inicializará al valor de 0. El nombre y apellidos del cliente deberán almacenarse
						con la primera letra en mayúscula y el resto en minúscula.
				- Métodos para consultar los valores de todos los atributos de la clase, excepto el
						atributo estático.
				- Métodos para modificar todos los atributos de la clase excepto el código y el
						atributo estático. El nombre y apellidos del cliente deberán almacenarse con la
						primera letra en mayúscula y el resto en minúscula.
				- Método denominado getTipo(). Devuelve una cadena de caracteres de acuerdo a
						la siguiente condición (obligatorio utilizar el operador condicional):
							- Si el número de puntos del cliente es superior a 50 o el número de pedidos
							es superior a 3, devuelve la cadena de texto “cliente vip”.
							- En caso contrario, devolverá “cliente básico”.
				- Método toString(). Devuelve una cadena de texto donde se detalla el código,
						nombre y apellidos del cliente, el número de pedidos que ha realizado y el tipo de
						cliente que es (vip o básico).
 */

public class Cliente {
	
	int codigo;
	String nombre;
	String apellidos;
	String movil;
	int puntos;
	int numPedidos;
	
	static int nextCodigo = 1;

	public Cliente() {
		super();
		this.codigo = nextCodigo++;
		this.puntos = 0;
		this.numPedidos = 0;
	}
	
	public Cliente(String nombre, String apellidos, String movil) {
		super();
		this.codigo = nextCodigo++;
		this.nombre = Utilidad.getFormatoNombre(nombre);
		this.apellidos = Utilidad.getFormatoNombre(apellidos);
		this.movil = movil;
		this.puntos = 0;
		this.numPedidos = 0;
	}

	public String getTipo() {
		final String VIP = "cliente vip";
		final String BASICO = "cliente básico";
		
		if(puntos > 50 || numPedidos > 3)
			return VIP;
		else
			return BASICO;
	}
	
	
	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = Utilidad.getFormatoNombre(nombre);
	}

	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = Utilidad.getFormatoNombre(apellidos);
	}

	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}

	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getNumPedidos() {
		return numPedidos;
	}
	public void setNumPedidos(int numPedidos) {
		this.numPedidos = numPedidos;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", numPedidos="
				+ numPedidos + ", tipo de cliente: " + getTipo() + "]";
	}
	
	
}
