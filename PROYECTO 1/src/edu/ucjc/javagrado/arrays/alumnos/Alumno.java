package edu.ucjc.javagrado.arrays.alumnos;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private Asignatura [] asignatura; 

	
	 // CONSTRUCTORES
	Alumno(String nombre, String apellidos, Asignatura [] asignatura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.asignatura = asignatura;
	}
		// Sobrecarga de constructores
	
	Alumno(String nombre, String apellidos) { // Por si no tiene asignaturas
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	 // NOMBRE
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// APELLIDOS
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	// ASIGNATURA
	public Asignatura[] getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura[] asignatura) {
		this.asignatura = asignatura;
	}
	
	
	
	
}
