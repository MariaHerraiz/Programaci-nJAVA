package edu.ucjc.javagrado.arrays;

public class PruebaArrays {

	public static void main(String[] args) {
		// Arrays tienen un tamaño fijo (no se puede podificar)
		// Solo elementos del tipo del que creemos el array
		// Arrays, matrices, arreglos
		
		String [] colores = {"Blanco", "Azul"};
		// Acceder a una determinada posición 
		System.out.println(colores[1]);
		// ERROR DE COMPILACIÓN (sale en rojito en el programa)
		// ERROR DE EJECUCIÓN (solo da error al equivocarse)
		
		// colores.lenght = Largo de un array
		for (int i = 0 ; i< colores.length ; i++ ) {
			System.out.println(colores[i]);
		}
		// BUCLE FOR EACH --> Para recuperar toda la información sin condiciones
			// atajo de teclado --> fore + ctrl + espacio (la primera opcion)
		
		for ( String color : colores ) {
			System.out.println(color);
		}
		
		

}
