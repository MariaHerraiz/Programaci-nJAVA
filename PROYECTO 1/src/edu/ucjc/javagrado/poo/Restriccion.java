package edu.ucjc.javagrado.poo;

public class Restriccion {

	public static void main(String[] args) {
		// METODOS DE RESTRICCION
		
		
		// PRIVADA
			// Solo puede acceder desde la clase donde está definido
		private String nombre; 
		
		// PUBLICA
			// Acceso de todos lados
		public String apellidos;
		
		// (pakage) 
			// no hace falta ponerlo --> Unicamente las clases que estan en el mismo paquete pueden usarlo
		String dni;
		
		// PROTECTED
			// En el mismo paquete y en las clases hijas
		protected int edad;
		

	}

}
