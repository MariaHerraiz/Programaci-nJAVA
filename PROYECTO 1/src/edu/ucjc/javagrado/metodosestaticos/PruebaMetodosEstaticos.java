package edu.ucjc.javagrado.metodosestaticos;

public class PruebaMetodosEstaticos {

	public static void main(String[] args) {
		PruebaMetodosEstaticos pme = new PruebaMetodosEstaticos();
		pme.metodo1();
	}

	
	// METODO DINÁMICO
	public void metodo1 (){
		System.out.println("Metodo 1 (No estático)");
		metodo2();
	}
		// Uno dinamico puede acceder a uno estatico
		// Uno estatico necesita crear un objeto para acceder a uno dinámico
		
		
	// MÉTODO ESTÁTICO
	public static void metodo2 (){
		System.out.println("Metodo 2 (Estático)");
		// LLAMAR A OTROS MÉTODOSA
		Utilidades.metodo3(); // Puedo llamar al M3 porque ambos son estaticos y están en el mismo paquete
		
		Utilidades utils = new Utilidades();
		utils.metodo4();
		
		String numero = "4";
		int num = Integer.parseInt(numero);
		
		Math.random();
		
	}
		
		
}
