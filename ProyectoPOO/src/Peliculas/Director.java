package Peliculas;

public class Director {

	private String nombreDirector;
	private String paisDeorigen;
	private int anoNacimiento;
	
	public Director() {
		//super();
	}
	public Director(String nombre, String paisDeorigen, int anoNacimiento) {
		//super();
		this.nombreDirector = nombre;
		this.paisDeorigen = paisDeorigen;
		this.anoNacimiento = anoNacimiento;
	}
	public String getNombre() {
		return nombreDirector;
	}
	public void setNombre(String nombre) {
		this.nombreDirector = nombre;
	}
	public String getPaisDeorigen() {
		return paisDeorigen;
	}
	public void setPaisDeorigen(String paisDeorigen) {
		this.paisDeorigen = paisDeorigen;
	}
	public int getAnoNacimiento() {
		return anoNacimiento;
	}
	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}
	@Override
	public String toString() {
		return " El director es " + nombreDirector + " ,  cuyo origen es " + paisDeorigen + " que nacio en el año "
				+ anoNacimiento ;
	}
	
	

	
}
