package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Persona 1");
		
		Persona persona1 = new Persona();
		
		System.out.print("Ingrese Nombre: ");
		persona1.setNombre(sc.nextLine());
		
		System.out.print("Ingrese numero de DNI: ");
		persona1.setDni(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Ingrese provincia natal: ");
		persona1.setProvincia(sc.nextLine());
		
		System.out.print("Ingrese una fecha de nacimiento (dd/MM/yyyy): ");
		persona1.setFechanac(LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		sc.nextLine();
		
		persona1.mostrarDatos();
		
		System.out.println("Persona 2");
		
		Persona persona2 = new Persona(45767542, "Ricardo", LocalDate.of(2004, 04, 21), "Jujuy");
		
		System.out.print("Ingrese Nombre: ");
		persona2.setNombre(sc.nextLine());
		
		System.out.print("Ingrese numero de DNI: ");
		persona2.setDni(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Ingrese provincia donde nacio: ");
		persona2.setProvincia(sc.nextLine());
		
		System.out.print("Ingrese una fecha de nacimiento (dd/MM/yyyy): ");
		persona2.setFechanac(LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		sc.nextLine();
		
		persona2.mostrarDatos();
		
		System.out.println("Persona 3");
		
		Persona persona3 = new Persona(45327596, "Josue", LocalDate.of(2003, 11, 20));
		
		System.out.print("Ingrese Nombre: ");
		persona3.setNombre(sc.nextLine());
		
		System.out.print("Ingrese numero de DNI: ");
		persona3.setDni(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Ingrese provincia donde nacio: ");
		persona3.setProvincia(sc.nextLine());
		
		System.out.print("Ingrese una fecha de nacimiento (dd/MM/yyyy): ");
		persona2.setFechanac(LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		sc.nextLine();
		
		persona3.mostrarDatos();
		sc.close();
	}

}
