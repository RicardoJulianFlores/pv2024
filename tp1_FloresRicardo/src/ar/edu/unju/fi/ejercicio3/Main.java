package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un entero: ");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) 
			System.out.println("Numero par por 3: " + numero * 3);
		else
			System.out.println("Numero impar por 2: " + numero * 2);
		sc.close();
	}

}
