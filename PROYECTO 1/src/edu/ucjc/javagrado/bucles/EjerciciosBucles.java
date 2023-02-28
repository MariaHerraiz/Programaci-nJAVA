package edu.ucjc.javagrado.bucles;

import java.util.Scanner; // ctrl shift ó

public class EjerciciosBucles {
	public static void main(String[] args) {
		
		// EJERCICIO 1: Pares 0-100 e impares 99-1 (FOR)
		
		for (int par = 0, impar = 99 ; par <= 100 ; par +=2, impar -= 2) {
			System.out.println(par + "\t" + impar); 
			
			// \t añade una tabulación
			// \n salta al siguiente 
		}
		
		// EJERCICIO 2: Pedir por consola la serie Fibonacci
		
			// a) Seleccionar el número pidiendolo al usuario
	    System.out.println("Escoge un número: ");
	    Scanner reader = new Scanner(System.in);
	    int serie = 0;
	    serie = reader.nextInt();
	   
	    	// b) Fibonacci
	    System.out.println("Serie Fibonacci para el número " + serie + ": ");
	    int a = 0, b = 1, suma = 1;
	    
        System.out.println(a);
         
        for (int i = 1; i < serie; i++) {
            System.out.println(suma);
            suma = a + b;
            a = b;
            b = suma;
        }
       
        
	}
}
