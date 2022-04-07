package Modelo;

public class Empleado {
	private int id;
	private String nombre;
	private double salario;


	public Empleado() {
	}

	public Empleado(int id, String nombre, int salario) {
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empleado id(int id) {
		setId(id);
		return this;
	}

	public Empleado nombre(String nombre) {
		setNombre(nombre);
		return this;
	}

	public Empleado salario(double salario) {
		setSalario(salario);
		return this;
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", nombre='" + getNombre() + "'" +
			", salario='" + getSalario() + "'" +
			"}";
	}
}
