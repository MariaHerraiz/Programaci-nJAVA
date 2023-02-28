package edu.ucjc.javagrado.poo;

public class Alumno2 {
	private String nombre; // TODAS LAS VARIABLES DE INSTANCIA PRIVADAS
	private String apellidos;
	private int edad;
	private String dni;
	
	// CONSTRUCTOR HECHO YA
		// Alt shift S -- > Generate Constructor 
	public Alumno2(String nombre, String apellidos, int edad, String dni) {
		super(); // Llama a la clase padre
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		
	}
	
	// GETTERS Y SETTERS
		// Alt shift S --> Generate getters y setters
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	
}
