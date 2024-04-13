package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		System.out.println("Ingrese numero: ");
		
		calc.setN(sc.nextInt());
	
		System.out.println("Sumatoria: "+calc.calcularSumatoria());
		
		System.out.println("Productoria: "+calc.calcularProductoria());
		
		sc.close();
	}

}
