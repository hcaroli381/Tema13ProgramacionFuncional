package ejercicios13InterfacesFuncionales;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
	public Map<String, Double> crearMapa() {
		Map<String, Double> empleados = new HashMap<>();

		empleados.put("Ana", 2000.96);
		empleados.put("Rodrigo", 2500.74);
		empleados.put("Juan", 1000.45);
		empleados.put("Antonio", 3000.32);
		empleados.put("Pepe", 1500.58);
		return empleados;
	}

	public void mostrarMapa(Map<String, Double> empleados) {
		empleados.forEach((nombre, sueldo) -> {
			System.out.printf("Empleado : %s Sueldo : %.2f\n", nombre, sueldo);
		});
	}

	public void introducirEmpleado(String nombre, Double sueldo, Map<String, Double> empleados) {
		empleados.computeIfAbsent(nombre, k -> sueldo);
		System.out.printf("Empleado añadido : %s Sueldo %.2f\n", nombre, sueldo);
	}

	public void subirSueldoEmpleado(String nombreEmpleado, Map<String, Double> empleados) {
		empleados.computeIfPresent(nombreEmpleado, (nombre, sueldo) -> sueldo * 1.20);
		System.out.printf("El sueldo de %s ha subido : %.2f\n", nombreEmpleado, empleados.get(nombreEmpleado));
	}

	public void subirSueldoPlantilla(Map<String, Double> empleados) {
		empleados.replaceAll((nombre, sueldo) -> sueldo * 1.10);
		System.out.println("-----Valor actual-----");
		mostrarMapa(empleados);
	}

	public void show() {
		Map<String, Double> empleados = crearMapa();
		mostrarMapa(empleados);
		introducirEmpleado("Luis", 1000.00, empleados);
		subirSueldoEmpleado("Luis", empleados);
		subirSueldoPlantilla(empleados);
	}

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

}
