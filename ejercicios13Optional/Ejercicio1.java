package ejercicios13Optional;

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

		option.ifPresentOrElse(b -> System.out.printf("%s es repetidor", b.getNombre()),
				() -> System.out.println("Este alumno no existe en la BD o no es repetidor"));
		option.ifPresent(a -> a.setNota(a.getNota() + 1),()-> throw);

	}

	public static void main(String[] args) {
		new Ejercicio1().show();

	}

}
