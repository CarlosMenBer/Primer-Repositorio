package Mendoza_Carlos_HerenciaPolim;


public class profresores extends persona{

	private String profesion;

	public profresores() {
		super();
	}

	public profresores(String profesion) {
		super();
		this.profesion = profesion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

// los dos metodos a elegir 
	@Override
	public void saludo() {
		System.out.println("Hola soy "+getNombre()+" y trabajo en "+getProfesion());
		
	}

	@Override
	public void realizarAccionEspecial() {
		// TODO Auto-generated method stub
	System.out.println("Hola soy el profesor "+getNombre()+ " tengo "+getEdad()+" años e imparto clase de "+getProfesion());
	}
	
	
	
	
	
	
	
	
	}