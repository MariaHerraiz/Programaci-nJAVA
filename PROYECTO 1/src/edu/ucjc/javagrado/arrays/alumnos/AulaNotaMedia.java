package edu.ucjc.javagrado.arrays.alumnos;

public class AulaNotaMedia {

	public static void main(String[] args) {
		
		// ALUMNO 1
		Alumno alumno1 = new Alumno("Nombre1", "Apellido1");
		Asignatura asignatura1 = new Asignatura("Asignatura1", 7.0);
		Asignatura asignatura2 = new Asignatura("Asignatura2", 6.5);
		
		Asignatura [] asignaturasAlumno1 = {asignatura1, asignatura2};
		alumno1.setAsignatura(asignaturasAlumno1);
		
		// ALUMNO 2
		Asignatura asignatura3 = new Asignatura("Asignatura3", 9.5);
		Asignatura asignatura4 = new Asignatura("Asignatura4", 10.0);
		Asignatura [] asignaturasAlumno2 = {asignatura3, asignatura4};
		Alumno alumno2 = new Alumno("Nombre2", "Apellido2",asignaturasAlumno2);
		
		
		// ALUMNO 3
		Asignatura asignatura5 = new Asignatura("Asignatura5", 3.5);
		Asignatura asignatura6 = new Asignatura("Asignatura6", 2.0);
		Asignatura [] asignaturasAlumno3 = {asignatura5, asignatura6};
		Alumno alumno3 = new Alumno("Nombre3", "Apellido3",asignaturasAlumno3);
		
		//Array de Alumnos --> Almaceno todos los alumnos para recorrerlos
		Alumno[] aula = {alumno1, alumno2, alumno3};
		double notaMasAlta = 0;
		String nombreAlumnoNotaMasAlta = "";
		for (Alumno alumno : aula) {
			// Cojo todas las asignaturas del Alumno
			Asignatura [] asignaturaAlumno = alumno.getAsignatura();
			
			// Recorro las asignaturas
			double notasAlumno = 0;
			for (Asignatura asignatura: asignaturaAlumno) {
				notasAlumno += asignatura.getNota();

			}
			double notaMedia = notasAlumno/asignaturaAlumno.length;
			System.out.println("Nota media del alumno " + alumno.getNombre()+" es "+ notaMedia);
			
			if (notaMedia > notaMasAlta) {
				notaMasAlta = notaMedia;
				nombreAlumnoNotaMasAlta = alumno.getNombre();
			}
		}
		System.out.println("La nota más alta es el "+ notaMasAlta + " del alumno " + nombreAlumnoNotaMasAlta);
				
	}
		

}

