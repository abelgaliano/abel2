package ejercicio;

public class TipoImpuesto {

	int porcentaje;
	int porcentaje30;
	char nombre;

	public TipoImpuesto(int por, int por30, char nom) {
		this.porcentaje = por;
		this.porcentaje30 = por30;
		this.nombre = nom;
	}

	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int _porcentaje) {
		this.porcentaje = _porcentaje;
	}

	public int getPorcentaje30() {
		return this.porcentaje30;
	}

	public void setPorcentaje30(int _porcentaje30) {
		this.porcentaje30 = _porcentaje30;
	}

	public char getNombre() {
		return this.nombre;
	}

	public void setNombre(char _nombre) {
		this.nombre = _nombre;
	}
}
