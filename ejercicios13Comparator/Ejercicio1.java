package ejercicios13Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {
	public List<String> crearLista() {
		List<String> lista = new ArrayList<String>();
		lista.add("Hugo");
		lista.add("Nuria");
		lista.add("Ariadna");
		lista.add("Cristina");
		return lista;
	}

	public void addNombre(String nombre, List<String> lista) {
		lista.add(nombre);
	}

	public List<String> ordenarListaNatural(List<String> lista) {
		lista.sort(Comparator.naturalOrder());
		return lista;
	}

	public List<String> ordenarListaNaturalReversa(List<String> lista) {
		lista.sort(Comparator.reverseOrder());
		return lista;
	}

	public List<String> ordenarListaNaturalNull(List<String> lista) {
		lista.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
		return lista;
	}

	public List<String> ordenarListaNaturalReversaNull(List<String> lista) {
		lista.sort(Comparator.nullsLast(Comparator.reverseOrder()));
		return lista;
	}

	public void show() {
		List<String> lista = crearLista();
		System.out.println("-----Sin NULL-----");
		System.out.println(lista.toString());
		System.out.println("Orden natural :");
		System.out.println(ordenarListaNatural(lista).toString());
		System.out.println("Orden reverso :");
		System.out.println(ordenarListaNaturalReversa(lista).toString());
		System.out.println("-----Con NULL-----");
		addNombre(null, lista);
		addNombre(null, lista);
		System.out.println("Orden natural, nulls al principio :");
		System.out.println(ordenarListaNaturalNull(lista).toString());
		System.out.println("Orden reverso, nulls al final :");
		System.out.println(ordenarListaNaturalReversaNull(lista).toString());
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
