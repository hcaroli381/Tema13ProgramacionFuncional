package ejercicios13InterfacesFuncionales;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Ejercicio1 {
	private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public void showArray(Consumer<Integer> consumer) {
		for (int n : array) {
			consumer.accept(n);
		}
	}

	public void showArray(BiConsumer<Integer, Integer> biconsumer) {
		for (int i = 0; i < array.length; i++) {
			biconsumer.accept(i, array[i]);
		}
	}

	public int countArray(Predicate<Integer> predicate) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (predicate.test(array[i])) {
				count++;
			}
		}
		return count;
	}

	public int[] filterArray(Predicate<Integer> predicate) {
		int size = countArray(predicate);
		int[] aux = new int[size];
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (predicate.test(array[i])) {

				aux[cont] = array[i];
				cont++;
			}
		}
		if (aux != null) {
			return aux;
		} else {
			return array;
		}

	}

	public int[] transformArray(UnaryOperator<Integer> unaryOper) {
		int[] resultado = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			resultado[i] = unaryOper.apply(array[i]);
		}
		return resultado;
	}

}
