package edu.ucjc.javagrado.bucles;

public class BucleWhile {

	public static void main(String[] args) {
		int num = 10;
		
		// BUCLE WHILE
		while (num<=10) {
			System.out.println(num++);
			// Si el ++ está a la dcha de la variable (num++), primero utiliza el valor de la variable y luego la cambia
			// Si el ++ está a la izq de la variable (++num), utiliza el valor modificado de la variable
			
			
		// BUCLE do-while (Primero ejecuta, luego evalúa)
		do {
			System.out.println(num++);
		}while (num<= 10);
			
		}

	}

}
