package edu.ucjc.javagrado.strings;

public class CadenasTexto {

	public static void main(String[] args) {
		String nombre = "Nombre1";
		nombre = "Nombre2"; 
		// String = Array de caracteres
		// Un string es inmutable --> No cambia el valor, solo se guarda en otra celda
		
		
		// MAYÚSCULAS | MINÚSCULAS
			// nombre.toUpperCase(); --> Si no igualo, se crea el objeto pero ninguna variable apuntará a él 
			nombre = nombre.toUpperCase();
			System.out.println(nombre);
			
			
		// CONCATENAR --> Con la suma de strings, por cada suma creas un objeto nuevo
			// (nombre + "Ó" + nombre) --> Aquí estarías creando 3 obejtos
		
			
		// FUNCIONES PARA LOS STRINGS --> nombre de la variable y un punto (te salen todas)
		
			// CONTAINS = Sale un booleano si se encuentra en la cadena de texto
			System.out.println(nombre.contains("bre"));
			
			// ENDS/STARTS WITH --> Recorre los nombres de todos los ficheros 	
			System.out.println(nombre.endsWith("2")); 
			
			// INDEX OF --> Saber en que posición se encuentra un caracter
			System.out.println(nombre.indexOf("2"));
		
			String valor = "asas.es.da.ese";
			System.out.println(valor.indexOf(".")); // imprime el primero que vea (desde la izquierda)
			System.out.println(valor.lastIndexOf(".")); // imprime el último que vea (desde la izquierda)
			
			// TRIM --> Elimina espacios en blanco a la izquierda y derecha del texto
			valor = "   MAZO ESPACIO  ";
			System.out.println(valor.trim()); 
			
			// REPLACE --> Cambiar un caracter por otro
			System.out.println(valor.replace(" ", ""));
			
			// SUbSTRING --> Indicar desde donde empieza a leer
			valor = "   no. el.inicio.   elfinal";
			int posicionUltimoPunto = valor.lastIndexOf(".")+1; // Accedemos a la posición +1 del último punto
			String cadena1 = valor.substring(posicionUltimoPunto); // Obtenemos la subcadena
			System.out.println(cadena1.trim()); // Eliminamos espacios en blanco
			
			int posicionPrimerPunto = valor.indexOf(".")+1; // Accedemos a la posición +1 del último punto
			String cadena2 = valor.substring(posicionPrimerPunto); // Obtenemos la subcadena (el.inicio. blabla)
			System.out.println(cadena2.trim()); // Eliminamos espacios en blanco
		
			// SPLIT --> Trozea a partir del caracter que queramos --> (array de Strings)
			String texto = "Nombre;Apellidos;Dirección;DNI";
			String [] textoTrozeado = texto.split(";");
			 for (String dato : textoTrozeado) {
				 System.out.println(dato);		
				 
			}
			
		}

}
