package Peliculas;

public class Peliculas {

	private String titulo;
	private int anoProduccion;
	private Director nombDirector;
	
	public Peliculas() {
		//super();
		//this.titulo
	}
	
	public Peliculas(String titulo, int anoProduccion, Director nombDirector) {
		super();
		this.titulo = titulo;
		this.anoProduccion = anoProduccion;
		this.nombDirector = nombDirector;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoProduccion() {
		return anoProduccion;
	}
	public void setAnoProduccion(int anoProduccion) {
		this.anoProduccion = anoProduccion;
	}
	public Director getNombDirector() {
		return nombDirector;
	}
	public void setNombDirector(Director nombDirector) {
		this.nombDirector = nombDirector;
	}

	@Override
	public String toString() {
		return "La pelicula introducida es " + titulo + " se produjo en el año " + anoProduccion + " , su director fue " + nombDirector
				;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
