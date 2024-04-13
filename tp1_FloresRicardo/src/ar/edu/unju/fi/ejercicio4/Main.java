package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero a factorizar en un rango de 0 a 10: ");
		
		int factorial = sc.nextInt();
		
		int resultado = 1;
		while(factorial>0 && factorial<=10){
			
		resultado = resultado*factorial;
		factorial--;
		
		}
		System.out.println("Resultado: " +resultado);
		sc.close();
	}

}
