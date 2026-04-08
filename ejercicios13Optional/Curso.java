package ejercicios13Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Curso {
	private List<Alumno> listaAlumnos;

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void addAlumno(Alumno alumno) {
		listaAlumnos.add(alumno);
	}

	public Curso() {
		listaAlumnos = new ArrayList<Alumno>();
	}

	Optional<Alumno> findRepeaterStudent(String nombre) {
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getNombre().equalsIgnoreCase(nombre) && alumno.isRepetidor()) {
				return Optional.of(alumno);
			}
		}
		return Optional.empty();
	}

}
