package ejercicios13InterfacesFuncionales;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MainAnonimas {
	public void main() {
		Ejercicio1 metodos = new Ejercicio1();

		System.out.print("showArray para mostrar los elementos en la misma linea :");
		metodos.showArray(new Consumer<Integer>() {
			@Override
			public void accept(Integer n) {
				System.out.printf("%d ", n);
			}
		});
		System.out.println();
		System.out.println("showArray para mostrar los elementos cada uno en una línea: ");
		metodos.showArray(new Consumer<Integer>() {
			@Override
			public void accept(Integer n) {
				System.out.printf("%d\n ", n);
			}
		});
		System.out.println("showArray para mostrar los elementos con su índice: ");
		metodos.showArray(new BiConsumer<Integer, Integer>() {
			@Override
			public void accept(Integer arg0, Integer arg1) {
				System.out.printf("Elemento %d: %d\n", arg0, arg1);
			}
		});

		System.out.println();
		System.out.print("countArray para contar pares :");
		System.out.println(metodos.countArray(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				if (arg0 % 2 == 0) {
					return true;
				} else {
					return false;
				}
			}
		}));
		System.out.print("countArray para contar impares :");
		System.out.println(metodos.countArray(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				if (!(arg0 % 2 == 0)) {
					return true;
				} else {
					return false;
				}
			}
		}));
		System.out.print("countArray para contar mayores de 3 :");
		System.out.println(metodos.countArray(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				if (arg0 > 3) {
					return true;
				} else {
					return false;
				}
			}
		}));
		System.out.println();
		System.out.print("filterArray para filtrar pares :");
		System.out.println(Arrays.toString(metodos.filterArray(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				if (arg0 % 2 == 0) {
					return true;
				} else {
					return false;
				}
			}
		})));

		System.out.print("filterArray para filtrar impares :");
		System.out.println(Arrays.toString(metodos.filterArray(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				if (!(arg0 % 2 == 0)) {
					return true;
				} else {
					return false;
				}
			}
		})));
		System.out.print("filterArray para filtrar mayores de 3 :");
		System.out.println(Arrays.toString(metodos.filterArray(new Predicate<Integer>() {

			@Override
			public boolean test(Integer arg0) {
				if (arg0 > 3) {
					return true;
				} else {
					return false;
				}
			}
		})));
		System.out.println();
		System.out.print("transformArray para obtener el doble: ");
		System.out.println(Arrays.toString(metodos.transformArray(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer arg0) {
				return arg0 * 2;
			}
		})));
		System.out.print("transformArray para obtener el triple: ");
		System.out.println(Arrays.toString(metodos.transformArray(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer arg0) {
				return arg0 * 3;
			}
		})));

	}

	public static void main(String[] args) {
		new MainAnonimas().main();
	}

}
