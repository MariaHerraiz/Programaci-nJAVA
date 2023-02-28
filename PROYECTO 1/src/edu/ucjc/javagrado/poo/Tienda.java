package edu.ucjc.javagrado.poo;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cliente c1 = new Cliente();
		// c1 = nombrar la variable = variable apuntando al objeto (Cliente)
		c1.nombre = "Juan";
		c1.comprar();
		
		System.out.println(c1.nombre);
		Cliente c2 = c1; // Apunta al mismo objeto que c1, no crea otro
		c2.nombre = "Maria";
		
		Cliente c3 = null;// Si pone NULL no está apuntando a nada
		
		c2 = null; // Aquí no se elimina el objeto, simplemente c2 deja de apuntar hacia él
		// System.out.println(c2.nombre)--> Esto me va a dar una excepción porque c2 no está apuntando a nada
		
		
		System.out.println(c1.nombre);
		
		
	}

}
