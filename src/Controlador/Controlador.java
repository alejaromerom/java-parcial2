package Controlador;

import Modelo.Empleado;
import Vista.Consola;

public class Controlador {
	private Empleado empleado;
	private Consola consola;

	public Controlador() {
		empleado = new Empleado();
		consola = new Consola();
	}

	public void iniciar() {
		int opcion = 0;
		do {
			opcion = consola.readInt("1. Ingresar datos del empleado\n2. Salir\nIngrese una opcion: ");
			switch (opcion) {
			case 1:
				ingresarDatos();
				break;
			case 2:
				System.out.println("Hasta luego!");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion != 2);
	}

	private void ingresarDatos() {
		empleado.setId(consola.readInt("Ingrese el id: "));
		empleado.setNombre(consola.readString("Ingrese el nombre: "));
		empleado.setSalario(consola.readDouble("Ingrese el salario: "));
		calcularDatos();
	}

	private void calcularDatos() {
		double nuevoSalario = 0;
		if (empleado.getSalario() > 0 && empleado.getSalario() <= 1000000) {
		nuevoSalario = empleado.getSalario() + (empleado.getSalario() * 0.20);
		} else if (empleado.getSalario() > 1000000 && empleado.getSalario() <= 4000000) {
		nuevoSalario = empleado.getSalario() + (empleado.getSalario() * 0.10);
		} else if (empleado.getSalario() > 4000000 && empleado.getSalario() <= 9000000) {
		nuevoSalario = empleado.getSalario() + (empleado.getSalario() * 0.05);
		} else if (empleado.getSalario() > 9000000 && empleado.getSalario() <= 15000000) {
		nuevoSalario = empleado.getSalario();
		} else {
			consola.printMsg("Fuera de rango");
		}
			
		System.out.println("El nuevo salario de " + empleado.getNombre() + " es: " + nuevoSalario);
	}

	public static void main(String[] args) {
		Controlador controlador = new Controlador();
		controlador.iniciar();
	}
}
