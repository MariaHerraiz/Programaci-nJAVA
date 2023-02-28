package edu.ucjc.javagrado.metodosestaticos;

public class Utilidades {
	
	// VARIABLES ESTÁTICAS
		
		//Para poder acceder desde un metodo estatico a la variable pongo (static) al nombrarla
	    private static String variable1 = "var1";
	    
	    // Elemento cómun para todos los objetos (Si creo nuevos objetos, no se crea una nueva variable, sino que ese nuevo objeto empieza a apuntar a esa var)
	    // Esa variable la comparten todos los objetos que se creen de esa clase
    
	    
	    
	// MÉTODO ESTÁTICO
		public static void metodo3() {
			System.out.println("Llamando a metodo 3 (estático)");
			System.out.println(variable1);
	
		}
		
		
	// MÉTODO DINÁMICO
		public void metodo4() {
			System.out.println("Metodo 4 (no estático)");
		}

	
}
