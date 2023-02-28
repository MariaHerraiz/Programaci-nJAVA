package edu.ucjc.javagrado.ejercicios.menu;

public class Persona {

	private String nombre; 
	private String apellidos;
	private String dni;
	private String correo;
	
	public Persona(String nombre, String apellidos, String dni, String correo){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.correo = correo;
	}
	
	public Persona(String nombre, String apellidos, String dni){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	// NOMBRE
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// APELLIDO
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// DNI
	public String getDni() {
		return dni;
	}

	
	// CORREO
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
}


