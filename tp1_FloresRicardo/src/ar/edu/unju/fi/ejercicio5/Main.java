package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
		System.out.println("Ingrese el numero a multiplicar entre 1 y 9: ");
		numero = sc.nextInt();
		}while(numero<=0 || numero>=10);
		
		for(int i = 0; i <=10;i++)
		System.out.println(numero+" x "+i+" = "+numero*i);
		
		sc.close();
	}
}
