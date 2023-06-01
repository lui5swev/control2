import java.util.ArrayList;
public class Bus {
	private String patente;
	private String modelo;
	private String marca;
	private ArrayList<Viaje> viajes;

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Viaje crearViaje() {
		throw new UnsupportedOperationException();
	}
}