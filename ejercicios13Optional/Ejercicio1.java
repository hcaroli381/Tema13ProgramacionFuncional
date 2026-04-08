package ejercicios13Optional;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class Ejercicio1 {
	public void show() {
		Scanner sc = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(sc);
		Curso curso = new Curso();
		String buscador;
		Optional<Alumno> option;
		curso.addAlumno(new Alumno("Hugo", true, 5));
		curso.addAlumno(new Alumno("Luca", false, 5));
		curso.addAlumno(new Alumno("David", false, 5));
		curso.addAlumno(new Alumno("Pedro", true, 5));

		buscador = ci.readString();
		option = curso.findRepeaterStudent(buscador);

		option.ifPresentOrElse(b -> System.out.printf("%s es repetidor\n", b.getNombre()),
				() -> System.out.println("Este alumno no existe en la BD o no es repetidor"));
		try {
			Alumno alumno = option
					.orElseThrow(() -> new IllegalStateException("El alumno no es repetidor o no existe"));
			alumno.setNota(alumno.getNota() + 1);
			System.out.printf("Nota actualizada : %s", alumno.toString());
		} catch (Exception e) {
			System.err.println(e);
		}

		try {
			option.filter(student -> student.getNota() >= 5)
					.ifPresentOrElse(student -> System.out.printf("Alumno aprobado : %s", student.toString()), () -> {
						throw new NoSuchElementException("Error, el alumno está suspenso o no existe");
					});
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
