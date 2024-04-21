package ar.edu.unju.fi.ejercicio18.model;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DestinoTuristico {


	private int codigo;
	private String nombre;
	private double precio;
	private Pais pais;
	private int dias;
	
	
	public DestinoTuristico() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
	public void altaDt(List<Pais> paises)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean band = false;
		do {
		try {
		System.out.println("Ingrese Codigo Numerico: ");
		codigo= sc.nextInt();
		sc.nextLine();}
		catch( InputMismatchException e)
		{System.out.println("Debe ser un numero");
			band = true;}
		}while(band);
			band = false;
		System.out.println("Ingrese Nombre del Destino: ");
		nombre= sc.nextLine();
		System.out.println("Ingrese Precio: ");
		precio=sc.nextDouble();
		sc.nextLine();
		do {
			band = false;
		System.out.println("Ingrese Codigo del Pais: ");
		String cod = sc.nextLine();
		for(Pais p: paises)
			if(p.getCodigo().equals(cod)) {
				pais = p;
				band = true;}
		}while(!band);
	}
	public void mostrarDatos() {
		System.out.println("");
		System.out.println("Nombre:"+ nombre);
		System.out.println("Codigo:"+ codigo);
		System.out.println("Precio:"+ precio);
		System.out.println("Pais:"+ pais.getNombre());
		System.out.println("");
	}
}
