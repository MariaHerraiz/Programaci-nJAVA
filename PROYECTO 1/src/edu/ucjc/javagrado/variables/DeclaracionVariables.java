package edu.ucjc.javagrado.variables;
// ctrl shift F4 --> Cierras todas las pestañas (NO FUNCIONA)
public class DeclaracionVariables {

	public static void main(String[] args) {
		// Comentario de linea
		
		/*
		 *  Comentario de bloque
		 */
		
		// Para comentar varias lineas de manera rápida --> ctr shift C ó ctr shift 7
		
		/**
		 *  Se supone que así con dos asteriscos es tipo documentación y se pondría azul
		 */

		
		// TIPOS DE DATOS
		int numero = 7; // Numeros enteros
		double numeroDecimal = 7.5; // Numeros decimales
		boolean isMayorEdad = true; //Boleanas
		String nombre = "Jose Luis"; //Mazo de importantes
		// Las clases empiezan en mayusculas y los tipos primitivos empiezan en minusculas
		
		// ARRAYS
		int [] numeros = {1,2,3,4};
		
		// print
		System.out.println("Hola " + numero + 9); //El propio Java convierte el numero a texto
		System.out.println("Suma: " + (numero + 9)); // Con parentesis hace eso primero
		
		//Pasar de STRING a INT y a DOUBLE
		String numero2 = "24";
		int resultado = Integer.parseInt(numero2); //Para convertir a entero
		
		String numero3 = "24.5";
		double resultado2 = Double.parseDouble(numero3);
		
		int num; // DECLARACIÓN de una variable
		num = 8; // INICIALIZACIÓN
		
		// VARIABLE DE INSTANCIA/DE CLASE: 
			// Si la variable está entre la declaracion de la clase y el metodo (Se inician automaticamente)
		
		// VARIABLE DE METODO:
			// La variable está dentro del método y hace falta no solo declararla sino inicializarlas (no se establece un valor automatico)
		
		
		// MAYUSCULAS O MINUSCULAS
			// Minusculas = variable.toLowerCase()
			// Mayusculas = variable.toUpperCase()
	
	
		// PEDIR AL USUARIO
			// 1. Pongo Scanner scan = new Scanner (System.in);
			// 2. Le doy al ctrl shift ó (para el import)
			// Pongo un print para pedir al usuario
			// 3. Establezco la variable
				// a) En STRING
					// Pongo String variable = "Valor inicial"
					// variable = scan.nextLine();
			// B) En INT
			// Pongo Int variable = Valor inicial
			// variable = scan.nextInt();
		
		// ATAJO PARA EL SYSOUT --> syso + ctrl espacio enter
		
		// CONVERSIÓN DE INT A STRING
		String numerito = "4";
		int numerazo = Integer.parseInt(numerito);
		
		Math.random(); // Numero aleatorio entre 1 y 2
	}

}
