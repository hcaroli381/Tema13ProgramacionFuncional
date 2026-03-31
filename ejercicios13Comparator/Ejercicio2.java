package ejercicios13Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {
	public List<Alumno> crearLista() {
		List<Alumno> lista = new ArrayList<Alumno>();

		lista.add(new Alumno("Dani", false, 8.0));
		lista.add(new Alumno("Hugo", false, 9.0));
		lista.add(new Alumno("Antonio", true, 10.0));
		lista.add(new Alumno("Antonio", true, 6.0));
		return lista;
	}

	public void mostrarLista(List<Alumno> lista) {
		for (Alumno a : lista) {
			System.out.print(a.toString());
		}
	}

	public void ordenarAscendente(List<Alumno> lista) {
		lista.sort(Comparator.comparing(Alumno::getNombre).reversed());
	}

	public void ordenarDescendente(List<Alumno> lista) {
		lista.sort(Comparator.comparing(Alumno::getNombre).thenComparing(Alumno::getNota, Comparator.reverseOrder()));
	}

	public void show() {
		List<Alumno> alumnos = crearLista();
		System.out.println("---Lista ORIGINAL---");
		mostrarLista(alumnos);

		System.out.println("---Ordenar ASCENDENTEMENTE POR NOMBRE---");
		ordenarAscendente(alumnos);
		mostrarLista(alumnos);

		System.out.println("---Ordenar DESCENDENTEMENTE POR NOMBRE Y LUEGO POR NOTA---");
		ordenarDescendente(alumnos);
		mostrarLista(alumnos);
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
