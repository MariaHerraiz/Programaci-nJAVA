package edu.ucjc.javagrado.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		
		int num1 = 9, num2 = 8; // Se puede hacer pero es mejor nombrarlas por separado
		
		//Sin llaves
		if (num1<num2)
			System.out.println("Sin llaves"); 
			// Si se pone un if sin llaves, solo va a afectar a la primera linea despues del if
		
		// Normal
			// Para comparar STRINGS no se utiliza el == , se utiliza el .equal()
		
			// Para comparar sin ignorar mayusculas: .equalsIgnoreCase()
		
		if (num1>num2){
			System.out.println("Num1 es mayor que Num2");
		}else if (num1<0){
			System.out.println("Num1 es menor que 0"); 
		}else {
			System.out.println("Ninguna de las dos"); 
		}
		
		// Varias condiciones
		
			// If si se cumple alguna de las dos: if((condicion1) || (condicion2)) -> Para poner esas lineas se pulsa Altgr + 1
		
			// If si se cumplen ambas: if(condicion1 && condicion2)
		
		
		// SWITCH = Solo podemos evaluar el valor de una variable
		
		String vocal = "I";
		switch (vocal) {
			case "A": System.out.println("Es la vocal A");break;
			case "E": System.out.println("Es la vocal E");break;
			case "I": System.out.println("Es la vocal I");break;
			case "O": System.out.println("Es la vocal O");break;
			case "U": System.out.println("Es la vocal U");break;
			default: System.out.println("Es una consonante");
					
			
		}
				
				
				
		
	}

}
