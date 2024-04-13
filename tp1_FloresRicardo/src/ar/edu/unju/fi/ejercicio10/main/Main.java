package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		for(int i=1;i<=3;i++) 
		{
			System.out.print("Ingrese Diametro de 20, 30 o 40: ");
			pizza.setDiametro(sc.nextInt());
			sc.nextLine();
			System.out.print("¿Tiene Ingredientes especiales? (True o False): ");
			pizza.setEspeciales(sc.nextBoolean());
			pizza.calcularPrecio();
			pizza.calcularArea();
			pizza.mostrarDatos();
		}
		sc.close();
	}

}
