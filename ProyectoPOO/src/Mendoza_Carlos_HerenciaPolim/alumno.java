package Mendoza_Carlos_HerenciaPolim;


public class alumno extends persona{

	private int numeroAlumn;
	


	public alumno() {
		super();
	}



	public alumno(int numeroAlumn) {
		super();
		this.numeroAlumn = numeroAlumn;
	}



	public int getNumeroAlumn() {
		return numeroAlumn;
	}



	public void setNumeroAlumn(int numeroAlumn) {
		this.numeroAlumn = numeroAlumn;
	}

// los dos metodos a elegir

	@Override
	public void saludo() {
		System.out.println("Hola soy "+getNombre()+" y mi numero es "+getNumeroAlumn());
	}



	@Override
	public void realizarAccionEspecial() {
		if (getEdad()>=18) {
			System.out.println("Hola me llamo "+getNombre()+" y soy mayor de Edad");
		} else {
			System.out.println("Hola me llamo "+getNombre()+" y soy menor de Edad");
		}
	}

	
	
	
}
