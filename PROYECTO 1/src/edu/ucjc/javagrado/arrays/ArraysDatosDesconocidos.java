package edu.ucjc.javagrado.arrays;

import java.util.Scanner;

public class ArraysDatosDesconocidos { //Un array es inmutable

	public static void main(String[] args) {
		// [][] array --> bidimensional 
		int [][] numeros = new int [2][3]; 
		//El primer corchete dice el num de filas y el segundo de columnas
			// [2] = num filas , [3] = num columnas
		
		// PEDIR LOS DATOS
		int dato = 0;
		
		for (int i = 0; i<numeros.length;i++ ) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print("Introduce elemento ["+i+"],["+j+"]: ");
				Scanner scan = new Scanner (System.in);
				numeros[i][j] = scan.nextInt();
			}
		}
		
		// MOSTRAR MATRIZ
		for (int i = 0; i<numeros.length;i++ ) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j]);
			}
			System.out.println( );
		}
 	}

}
