package edu.ucjc.javagrado.poo;

import edu.ucjc.javagrado.arrays.alumnos.Alumno;
import edu.ucjc.javagrado.arrays.alumnos.Asignatura;

public class Universidad {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Nombre1", "SusApellidos", 45, "123A");
		
		// NOMBRE
		System.out.println(alumno1.getNombre());
		alumno1.setNombre("Nombre modificado");
		System.out.println(alumno1.getNombre());
		// alumno1.nombre = "Juan";
		
		//APELLIDOS
		System.out.println(alumno1.getApellidos());
		alumno1.setApellidos("Apelllido modificado");
		System.out.println(alumno1.getApellidos());
		
		// ASIGNATURA
		Asignatura asignatura1 = new Asignatura("Programación", 8);
		alumno1.setAsignatura(asignatura1);
		System.out.println(alumno1.getAsignatura().getNota());
	}

}
