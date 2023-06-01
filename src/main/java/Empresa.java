import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private String rut;
	private String direccion;
	private ArrayList<String> sociales;

	public ArrayList<Conductor> getConductores() {
		return conductores;
	}

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

	public void setBuses(ArrayList<Bus> buses) {
		this.buses = buses;
	}

	public void agregarConductor() {
		Scanner teclado =  new Scanner(System.in);
		Conductor objConductor = new Conductor();
		System.out.println("Ingreso de Nuevo Conductor");
		System.out.println("Ingrese el nombre del conductor");
		objConductor.setNombre(teclado.next());
		System.out.println("Ingrese el apellido del conductor");
		objConductor.setApellido(teclado.next());
		System.out.println("Ingrese el tipo de licencia del conductor");
		objConductor.setLicencia(teclado.next());
		System.out.println("Ingrese el numero de telefono, de la forma 9XXXXXXXX");
		objConductor.setTelefono(teclado.nextInt());

		this.conductores.add(objConductor);

		System.out.println("Nuevo Conductor ingresado");
		System.out.println("Nombre: "+objConductor.getNombre());
		System.out.println("Apellido: "+objConductor.getApellido());
		System.out.println("Tipo de Licencia: "+objConductor.getLicencia());
		System.out.println("Numero de telefono: "+objConductor.getTelefono());
	}

	public void agregarBus() {
		Scanner teclado =  new Scanner(System.in);
		Bus objBus = new Bus();
		System.out.println("Ingreso de nuevo Bus");
		System.out.println("Ingrese la patente del Bus, de la forma AABB11");
		objBus.setPatente(teclado.next());
		System.out.println("Ingrese el modelo del Bus");
		objBus.setModelo(teclado.next());
		System.out.println("Ingrese la marca del Bus");
		objBus.setMarca(teclado.next());

		this.buses.add(objBus);

		System.out.println("Nuevo Bus Ingresado");
		System.out.println("De patente: "+objBus.getPatente());
		System.out.println("De modelo: "+objBus.getModelo());
		System.out.println("De marca: "+objBus.getMarca());
	}


	public void crearViajeABus() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("selecione ingresando el numero, el bus al cual quiere agregarle un viaje");
		for (int i = 0; i < this.buses.size(); i++) {
			System.out.println("["+i+1+"] Bus de Patente: "+this.buses.get(i).getPatente());
		}
		int eleccion = teclado.nextInt()-1;

		this.buses.get(eleccion).crearViaje();
	}

	public void descontinuarBus() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("discontinuar bus segun patente");
		System.out.println("Buses actuales:");
		for (int i = 0; i < this.buses.size(); i++) {
			System.out.println("["+i+1+"] Bus de Patente: "+this.buses.get(i).getPatente());
		}

		System.out.println("ingrese la patente de la forma AABB11 del bus que desea discontinuar");
		String eleccion = teclado.next();

		for (int i = 0; i < this.buses.size(); i++) {
			if (this.buses.get(i).getPatente()==eleccion){
				this.buses.remove(this.buses.get(i));
			}
		}
	}

	public void obtenerBus() {
		throw new UnsupportedOperationException();
	}



}