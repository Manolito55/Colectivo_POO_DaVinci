package Logica;

public class Motor {
	private int id;
	private String modelo;
	private	boolean is_on;
	
	
	
	public Motor(int id, String modelo, boolean is_on) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.is_on = is_on;
	}

	public int getNum_partes() {
		return id;
	}

	public void setNum_partes(int num_partes) {
		this.id = num_partes;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isIs_on() {
		return is_on;
	}

	public void setIs_on(boolean is_on) {
		this.is_on = is_on;
	}
	
	public boolean Arrancar() {
		
		if (is_on == true) {
			System.out.println("El motor se ha encendido");
			return true;
		
			
		} else {
			
			System.out.println("El motor NO se ha encendido");
			return false;
			
		}
		
	}
	
}



