package edu.ucjc.javagrado.arrays.alumnos;

public class Aula {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Nombre1", "Apellido1");
		Asignatura asignatura1 = new Asignatura("Asignatura1", 8.0);
		Asignatura asignatura2 = new Asignatura("Asignatura2", 6.5);
		
		Asignatura [] asignaturas = {asignatura1, asignatura2};
		alumno1.setAsignatura(asignaturas);
		
		System.out.println(alumno1.getAsignatura()[0].getNota());
		
		Asignatura [] asignaturasAlumno1 = alumno1.getAsignatura();
		
		boolean asignaturaEncontrada = false;
		
		for (Asignatura asignatura : asignaturasAlumno1) { //Bucle ForEach
			if (asignatura.getNombre().equals("Asignatura1")) {
				System.out.println("La nota de la Asignatura 1 es " + asignatura.getNota());
				break; // Así no recorre la lista entera
			}
			else if (asignatura.getNombre().equals("Asignatura3")) {
				System.out.println("La nota de la Asignatura 3 es " + asignatura.getNota());
				asignaturaEncontrada = true; // Asignatura encontrada
				break;
			}
		}
		//Asignatura no encontrada
		if (!asignaturaEncontrada) { // Para decir if not -->  if (! blabla)
			System.out.println("El alumno no tiene asignatura 3");
		}
		
		
	}

}
