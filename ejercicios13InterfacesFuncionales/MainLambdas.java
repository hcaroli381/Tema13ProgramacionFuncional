package ejercicios13InterfacesFuncionales;

import java.util.Arrays;

public class MainLambdas {
	public void main() {
		Ejercicio1 metodos = new Ejercicio1();

		System.out.print("showArray para mostrar los elementos en la misma linea :");
		metodos.showArray(n -> System.out.printf("%d ", n));
		System.out.println();
		System.out.println("showArray para mostrar los elementos cada uno en una línea: ");
		metodos.showArray(n -> System.out.printf("%d\n", n));
		System.out.println("showArray para mostrar los elementos con su índice: ");
		metodos.showArray((n, n1) -> System.out.printf("Elemento %d: %d\n ", n, n1));

		System.out.println();
		System.out.print("countArray para contar pares :");
		System.out.println(metodos.countArray(n -> {
			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}));
		System.out.print("countArray para contar impares :");
		System.out.println(metodos.countArray(n -> {
			if (!(n % 2 == 0)) {
				return true;
			} else {
				return false;
			}
		}));
		System.out.print("countArray para contar mayores de 3 :");
		System.out.println(metodos.countArray(n -> {
			if (n > 3) {
				return true;
			} else {
				return false;
			}
		}));
		System.out.println();
		System.out.print("filterArray para filtrar pares :");
		System.out.println(Arrays.toString(metodos.filterArray(n -> {
			if (n % 2 == 0) {
				return true;
			} else {
				return false;
			}
		})));

		System.out.print("filterArray para filtrar impares :");
		System.out.println(Arrays.toString(metodos.filterArray(n -> {
			if (!(n % 2 == 0)) {
				return true;
			} else {
				return false;
			}
		})));
		System.out.print("filterArray para filtrar mayores de 3 :");
		System.out.println(Arrays.toString(metodos.filterArray(n -> {
			if (n > 3) {
				return true;
			} else {
				return false;
			}
		})));
		System.out.println();
		System.out.print("transformArray para obtener el doble: ");
		System.out.println(Arrays.toString(metodos.transformArray(n -> n * 2)));
		System.out.print("transformArray para obtener el triple: ");
		System.out.println(Arrays.toString(metodos.transformArray(n -> n * 3)));
	}

	public static void main(String[] args) {
		new MainLambdas().main();
	}

}
