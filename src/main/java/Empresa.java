import java.util.ArrayList;
public class Empresa {
	private String rut;
	private String direccion;
	private ArrayList<String> sociales;
	private ArrayList<Conductor> conductores;
	private ArrayList<Bus> buses;
	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void agregarConductor() {
		throw new UnsupportedOperationException();
	}

	public void agregarBus() {
		throw new UnsupportedOperationException();
	}

	public void descontinuarBus() {
		throw new UnsupportedOperationException();
	}

	public void obtenerBus() {
		throw new UnsupportedOperationException();
	}

	public void crearViajeABus() {
		throw new UnsupportedOperationException();
	}
}