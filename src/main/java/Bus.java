import java.util.ArrayList;
import java.util.Scanner;

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

	public void crearViaje(){
		Scanner teclado = new Scanner(System.in);
		Viaje objViaje = new Viaje();

		System.out.println("Crear viaje para el bus de patente " + this.patente);
		System.out.println("Ingrese la ciudad de origen del viaje");
		objViaje.setOrigen(teclado.next());
		System.out.println("Ingrese la ciudad de destino del viaje");
		objViaje.setDestino(teclado.next());
		System.out.println("Ingrese el horario de salida del viaje, de la forma 1530");
		objViaje.setHoraSalida(teclado.nextInt());
		System.out.println("Ingrese el horario de llegada del viaje, de la forma 1645");
		objViaje.setHoraSalida(teclado.nextInt());

		this.viajes.add(objViaje);

		System.out.println("Nuevo viaje creado");
		System.out.println("Ciudad de origen: " + objViaje.getOrigen());
		System.out.println("Ciudad de destino: " + objViaje.getDestino());
		System.out.println("Hora de salida: " + objViaje.getHoraSalida());
		System.out.println("Hora de llegada: " + objViaje.getHoraLlegada());
	}
}