package Logica;

public class Pasajero {
	
	private int dni;
	private String nombre;
	private Sube sube;
	
	public Pasajero(int dni, String nombre, Sube sube) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sube = sube;
	}
	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sube getSube() {
		return sube;
	}
	public void setSube(Sube sube) {
		this.sube = sube;
	}
	
	
	

}
