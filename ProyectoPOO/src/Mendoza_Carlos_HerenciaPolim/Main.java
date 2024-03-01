package Mendoza_Carlos_HerenciaPolim;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<persona>almacenPers =new ArrayList<persona>();
		Scanner sc = new Scanner(System.in);
		
		// Vamos a introducir la edad y los datos de la persona" 
	

	
		System.out.println("Cuantas personas deseas introducir los datos");
		int i = sc.nextInt();
		for (int j = 0; j < i; j++) {
			// damos a elegir el poder llenar los datos del usuario
		System.out.println("Que desea introducir si es 1-alumno  2-profesor");	
		int elegir=sc.nextInt();
		if (elegir==1) {
			
			alumno a1 = new alumno();
			System.out.println("Introduce los datos de esta persona");
			System.out.println("El nombre");
			a1.setNombre(sc.next());
			System.out.println("La edad");
			a1.setEdad(sc.nextInt());
			System.out.println("Introduce el numero del alumno");
			a1.setNumeroAlumn(sc.nextInt());
			almacenPers.add(a1);
		} else if (elegir==2) {
			profresores pr1= new profresores();
			System.out.println("Introduce los datos de esta persona");
			System.out.println("El nombre");
			pr1.setNombre(sc.next());
			System.out.println("La edad");
			pr1.setEdad(sc.nextInt());
			System.out.println("La Asignatura");
			pr1.setProfesion(sc.next());
			almacenPers.add(pr1);

			
		}else{
			System.out.println("El numero introducido es incorrecto");
		}}
		
		boolean term;
		// introducimos un menu con un boolean q nos permite repetir el menu tantas veces como quiera siempre y cuando no 
		// de a salir 
		do {
			
		term =true;
			
			System.out.println("-------------------------------------------");
			System.out.println("Menu");
			System.out.println("1-Saludar");
			System.out.println("2-Realizar una Accion Especial");
			System.out.println("3-Salir");
			System.out.println("-------------------------------------------");
			
			int menu = sc.nextInt();
			
			
			switch (menu) {
			case 1: // Aqui saludaremos mediante un forEach y un instanceof 
					// El instanceof nos permite poder hacer un if que nos diferencia un objeto 
				for (persona persona : almacenPers) {
					if (persona instanceof alumno) {
						persona.saludo();
					}else {
						persona.saludo();
					}
				}
			
				break;
			case 2:
				// Aqui realizaremos la accion caracteristicas mediante un forEach y un instanceof 
				for (persona persona : almacenPers) {
					if (persona instanceof alumno) {
						persona.realizarAccionEspecial();
					}else {
						persona.realizarAccionEspecial();
					}
				}
				
				break;
			case 3:
				// salida del bucle
				term=false;
				break;

			default:
				System.out.println("Numero erroneo");
				break;
			}
			
			
		} while(term==true);
		sc.close();
	

		
	}

}
