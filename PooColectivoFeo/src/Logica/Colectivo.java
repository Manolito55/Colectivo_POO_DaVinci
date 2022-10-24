package Logica;

public class Colectivo {
	private Motor motor; 
	private String patente;
	private Double tarifa;
	private int cant_pasajeros;
	
	public Colectivo(Motor motor, String patente, Double tarifa) {
		super();
		this.motor = motor;
		this.patente = patente;
		this.tarifa = tarifa;
	}
	
	
	public Motor getMotor() {
		return motor;
	}



	public void setMotor(Motor motor) {
		this.motor = motor;
	}



	public String getPatente() {
		return patente;
	}



	public void setPatente(String patente) {
		this.patente = patente;
	}



	public Double getTarifa() {
		return tarifa;
	}



	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}



	public int getCant_pasajeros() {
		return cant_pasajeros;
	}



	public void setCant_pasajeros(int cant_pasajeros) {
		this.cant_pasajeros = cant_pasajeros;
	}



	public void SumarPasajero() {	
		
		if (cant_pasajeros <= 40) {
			cant_pasajeros++;
		}
	}
	
	public void RestarPasajero() {	
		cant_pasajeros--;
	}
	
	
	
}
