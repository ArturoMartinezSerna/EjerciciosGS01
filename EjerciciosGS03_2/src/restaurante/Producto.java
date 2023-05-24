package restaurante;



/*
 * 3. Clase Producto
			- Guarda datos como son: un código, título, precio, iva y stock del producto, así como un
			objeto donde se asocie a la categoría que pertenece.
			- También posee un atributo estático necesario para generar los códigos de los productos
			nuevos.
			- Métodos:
					- Constructor por defecto. Genera el código del producto, ayudándose del valor del
							atributo estático.
					- Constructor con parámetros donde inicializa cada uno de los atributos de la clase
							excepto el atributo código (no se recibe por parámetro), su valor se genera
							utilizando el atributo estático de la clase. El título del producto deberá
							almacenarse con la primera letra en mayúscula y el resto en minúscula.
					- Métodos para consultar los valores de todos los atributos de la clase, excepto el
							atributo estático.
					- Métodos para modificar todos los atributos de la clase excepto el código y el
							atributo estático. Recuerda que el título debe seguir el formato primera letra en
							mayúscula y el resto en minúscula.
					- Método toString(). Devuelve una cadena de texto donde se detalle los valores
							de los atributos de la clase (excepto el atributo estático) así como el nombre de la
							categoría de la cual pertenece.
 */
public class Producto {
	
	static int nextCodigo = 1;
	int codigo;
	String titulo;
	double precio;
	int iva;
	int stock;
	Categoria categoria;
	
	public Producto() {
		this.codigo = nextCodigo++;
	}

	public Producto(String titulo, double precio, int iva, int stock, Categoria categoria) {
		super();
		this.codigo = nextCodigo++;
		this.titulo = Utilidad.getFormatoNombre(titulo);
		this.precio = precio;
		this.iva = iva;
		this.stock = stock;
		this.categoria = categoria;
	}

	public static int getNextCodigo() {
		return nextCodigo;
	}

	public static void setNextCodigo(int nextCodigo) {
		Producto.nextCodigo = nextCodigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = Utilidad.getFormatoNombre(titulo);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", titulo=" + titulo + ", precio=" + precio + ", iva=" + iva + ", stock="
				+ stock + ", categoria=" + categoria + "]";
	}
}
