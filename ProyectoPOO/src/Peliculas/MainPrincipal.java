package Peliculas;

import java.util.Scanner;

public class MainPrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// director 1 
		
		Director director1 = new Director();
		System.out.println("Introduce el nombre del primer director");
		director1.setNombre(sc.next());
		System.out.println("Introduce el Pais de origen");
		director1.setPaisDeorigen(sc.next());
		System.out.println("Introduce el año de nacimiento");
		director1.setAnoNacimiento(sc.nextInt());
		
		// director 2
		
		Director director2 = new Director();
		System.out.println("Introduce el nombre del segundo director");
		director2.setNombre(sc.next());
		System.out.println("Introduce el Pais de origen");
		director2.setPaisDeorigen(sc.next());
		System.out.println("Introduce el año de nacimiento");
		director2.setAnoNacimiento(sc.nextInt());
		
		// pelicula 1 
		
		Peliculas peli1 = new Peliculas();
		System.out.println("Introduce el nombre de la primera pelicula");
		peli1.setTitulo(sc.next());
		System.out.println("Introduce el año de creacion de la primera pelicula");
		peli1.setAnoProduccion(sc.nextInt());
		peli1.setNombDirector(director1);
		
		// pelicula 2 
		
		Peliculas peli2 = new Peliculas();
		System.out.println("Introduce el nombre de la segunda pelicula");
		peli2.setTitulo(sc.next());
		System.out.println("Introduce el año de creacion de la segunda pelicula");
		peli2.setAnoProduccion(sc.nextInt());
		peli2.setNombDirector(director2);
		
		// Lo Mostramos
		
		System.out.println(director1.toString());
		System.out.println(peli1.toString());
		System.out.println(director2.toString());
		System.out.println(peli2.toString());
		
		
		sc.close();
	}

}
