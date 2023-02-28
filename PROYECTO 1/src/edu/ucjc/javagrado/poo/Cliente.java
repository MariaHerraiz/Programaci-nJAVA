
public class Cliente {
	
	// Atributos o Variables de instancia
		// Las variables de INSTANCIA no hace falta inicializarlas
	
	String nombre; // Los modificadores de acceso nos permiten restringir algunas variables
	String apellidos;
	String dni;
	int edad; // ojo que edad es de tipo INT, por lo tanto, de tipo (package)
	
	
	// CONSTRUCTOR 
	
	// Metodos
	public void comprar() {
		System.out.println("Cliente" + nombre + "está comprando");
		
		String test = "Hola"; // Variables de Metodo / Locales --> Se tienen que inicializar antes de usarse
		System.out.println(apellidos);
		System.out.println(test);
	
	}
	
// Objeto está en memoria
}
