package Mendoza_Carlos_HerenciaPolim;


abstract class persona {

	
	private String nombre;
	private int edad;
	
	public persona() {
		super();
	}

	public persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
// los dos metodos a elegir
	public void saludo() {
		System.out.println("Hola soy "+getNombre());
		
	}
	
	
	public void realizarAccionEspecial() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
