package ejercicio;

public class PersonaFiscal {

	String nombre;
	int edad;
	int sueldo;
	String tipo;
	TipoImpuesto impuesto;

	public int calcularImpuesto() {

		return -1;
	}

	public void vincularTipoImpuesto(String _tipo) {
		this.tipo = _tipo;
		if (this.tipo.equals('a')) {
			this.impuesto = new TipoImpuesto(20, 30, 'a');
		}

		if (this.tipo.equals('b')) {
			this.impuesto = new TipoImpuesto(10, 5, 'b');
		}

		if (this.tipo.equals('c')) {
			this.impuesto = new TipoImpuesto(30, 25, 'c');
		}

		if (this.tipo.equals('d')) {
			this.impuesto = new TipoImpuesto(10, 30, 'd');
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	public int getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(int _sueldo) {
		this.sueldo = _sueldo;
	}
}
