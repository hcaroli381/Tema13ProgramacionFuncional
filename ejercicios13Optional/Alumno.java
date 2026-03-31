package ejercicios13Optional;

public class Alumno {
	private String nombre;
	private boolean repetidor;
	private double nota;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Alumno(String nombre, boolean repetidor, double nota) {
		this.nombre = nombre;
		this.repetidor = repetidor;
		this.nota = nota;
	}

	@Override
	public String toString() {
		String repetidor;
		if (this.repetidor) {
			repetidor = "Sí";
		} else {
			repetidor = "No";
		}
		return String.format("Nombre : %s  ¿Repetidor? : %s  Nota : %.2f\n ", nombre, repetidor, nota);
	}

}
