package edu.ucjc.javagrado.ejercicios.menu;

import java.util.Scanner;

import edu.ucjc.javagrado.metodosestaticos.utils.UtilidadesEjercicios;
//Si una clase está en otro paquete pongo --> ctrl shift ó 

public class Menú {

	public static void main(String[] args) {
        
		// EJERCICIO 3: MENÚ
        
        int opcion = 0;
        
        do {
        	System.out.println("1. Validar email");
        	System.out.println("2. Pintar cuadrado");
        	System.out.println("3. Recoger datos");
        	System.out.println("4. Salir");
        	
        	System.out.println("Selecciona una opción: ");
        	Scanner reader = new Scanner (System.in);
        	opcion = reader.nextInt();
        	
        	switch (opcion) {
        	case 1: UtilidadesEjercicios.ValidarEmail(); break; 
        	case 2: System.out.println("Opción 2"); break;
        	case 3: System.out.println("Opción 3"); break;
        	case 4: System.out.println("¡Adiós!"); break;
        	default: System.out.println("Opción incorrecta"); break;
        	}
        	
        }while (opcion!= 4); 
        
	}
	public static void MostrarDatos() {
		// Definición de objetos de tipo persona
		Persona persona1 = new Persona("Pedro", "Perez", "4917P", "juan@gmail.com");
		Persona persona2 = new Persona("Maria", "Sanchez", "123A", "mari@gmail.com");
		Persona persona3 = new Persona("Juana", "Hernandez", "768L", "juana@hotmail.es");
		
		// Array de tipo persona
		Persona [] grupo = {persona1, persona2, persona3};
		
		for (Persona persona: grupo) {
			System.out.println(persona.getNombre());
		}
		
	}

	 
        	
}
    
    

