package edu.ucjc.javagrado.metodosestaticos.utils;

import java.util.Scanner;

public class UtilidadesEjercicios {
	/**
	 * Metodo que solicita el email y lo valida
	 */
	public static void ValidarEmail() {
		// Introducir EMAIL:
				int errorFinal = 1;
				do {
					String email = " ";
					System.out.println("IN email: ");
			    	Scanner scan = new Scanner (System.in);
			    	email = scan.nextLine();
			    	email = email.trim();
			    	
			    	int error = 0;
			    	System.out.println("Ha introducido el email:" + email);
			    	
			    	// Solo 1 @ + Ningún espacio dentro del email
			    	int numArrobas = 0;
			    	int numEspacios = 0;
			    	String [] emailTroceado = email.split("");
			    	for (String letra1 : emailTroceado) {
			    		if (letra1.equals("@")) {
			    			numArrobas +=1;
						}else if(letra1.equals(" ")){
							numEspacios += 1;
						}
					}
			    	if (numArrobas != 1 ) {
			    		error +=1;
			    	}
			    	if (numEspacios != 0) {
			    		error += 1;
			    	}
			    
			    	// Al menos un punto después del @
			    	int posicionArroba = email.lastIndexOf("@")+1; // Accedemos a la posición +1 del último punto
					String cadenaFinal = email.substring(posicionArroba);
					String [] cadenaFinalTroceada = cadenaFinal.split("");
					int numPuntos = 0;
					for (String letra2 : cadenaFinalTroceada) {
						if (letra2.equals(".")) {
							numPuntos += 1;
						}
					}
					if (numPuntos < 1 ) {
			    		error +=1;
					}
			    	
			    	// Solo puede haber entre 2 y 6 caracteres después del último punto
				
					// Solo puede haber entre 2 y 6 caracteres después del último punto
			    	int despuesDelUltimoPunto = email.lastIndexOf(".");
			    	String elFinal = email.substring(despuesDelUltimoPunto + 1);
			    	if ((elFinal.length() < 2) || (elFinal.length() > 6)){
			    		error += 1;
			    	}
				
					// VALIDACIÓN FINAL
			    	
			    	if (error == 0) {
			    		System.out.println("Email válido");
			    		errorFinal -= 1;
			    	}else {
			    		System.out.println("Email no válido");
			    		System.out.println("Intentelo de nuevo");
			    	}
				
				
				}while(errorFinal == 1);
				
				System.out.println("FIN DEL PROGRAMA");
			}

}