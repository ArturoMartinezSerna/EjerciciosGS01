package restaurante;


/*
 * 2. Clase Categoria
			- Almacenará el código del producto y el nombre de la categoría.
			- Además, dispone de un atributo estático de tipo entero denominado “nextCodigo”,
				inicialmente su valor será de 1. Este atributo almacena el código de la siguiente
				categoría a insertar.
			
			- Métodos:
			
					Constructor por defecto, inicializa los atributos a los siguientes valores:
					- Nombre: Cadena vacía (es decir, “”)
					- Código: Corresponderá al valor que almacena el atributo nextCodigo, no
						olvides actualizar el valor de nextCodigo (incrementa su valor en una
						unidad).
					- Constructor con parámetro (recibe únicamente el nombre de la categoría), el
							valor del atributo código se generará utilizando el atributo estático nextCodigo. El
							nombre de la categoría debe almacenarse con la primera letra en mayúscula y el
							resto de caracteres en minúscula, por tanto, deberás hacer uso del método
							getFormatNombre de la clase Utilidades.
					- Métodos para consultar cada uno de los atributos de la clase, excepto el atributo
					estático.
					- Método para modificar el atributo nombre. Recuerda que el nombre de la cadena
						se almacena con la primera letra en mayúscula y el resto en minúscula.
					- Método toString(). Devuelve una cadena de texto donde se detalle el nombre el
						código de la categoría y su nombre.
 */
public class Categoria {
	int codigo;
	String nombre;
	static int nextCodigo = 1;
	
	public Categoria() {
		this.nombre = "";
		this.codigo = nextCodigo++;
	}
	
	public Categoria(String nombreCategoria) {
		this.nombre = Utilidad.getFormatoNombre(nombreCategoria);
		this.codigo = nextCodigo++;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreCategoria) {
		this.nombre = Utilidad.getFormatoNombre(nombreCategoria);
	}

	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
}
