package edu.ucjc.javagrado.bucles;

import java.util.Scanner;

public class Menu1 {

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
        	case 1: System.out.println("Opción 1"); break; ////////////////7
        	case 2: System.out.println("Opción 2"); break;
        	case 3: System.out.println("Opción 3"); break;
        	case 4: System.out.println("¡Adiós!"); break;
        	default: System.out.println("Opción incorrecta"); break;
        	}
        	
        }while (opcion!= 4); 
        
	}
	
    public static void pintaCuadrado() { // Es como una función
    	System.out.println("Pintando cuadrado");
    	int numLados = 5;
        for (int i = 0 ; i<numLados ; i++ ) { // FILAS
        	for (int j = 0; j < numLados; j++) { // COLUMNAS 
        		if (i == 0 || i == numLados-1) {
        			System.out.println("*\t");
        		}else {
        			if(j == 0 || j == numLados-1) {
        				System.out.print("\t");
        			}else {
        				System.out.print("\t");
        			}
        		}
        	}System.out.println();
        			
        }
        	
    }
    
    // FUERA DE MOSTRAR CUADRADO
	    // 1. Crear CLASE: Persona (nombre, apellido, dni, email)
	    // 2. 3 objetos de tipo Persona
	    // 3. Metemos los objetos en un array
    	// 4. Mostrar los nombres de todas las personas del array

	}

