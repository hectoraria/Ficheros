package ejercicio07;

import java.io.File;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opc = 0;
		String nombre;
		int numero;
		File file = new File("src/ejercicio07/agendacontactos.txt");
		if (file.exists()) {
			Contacto.recuperarDatos();
		}
		do {

			menu();
			System.out.println("ELIGE UNA OPCIÓN");
			opc = sc.nextInt();
			sc.nextLine();
			switch (opc) {
			case 1: {
				System.out.println("Nombre del contacto ");
				nombre = sc.nextLine();
				System.out.println("Numero de tlfn");
				numero = sc.nextInt();
				sc.nextLine();

				if (Contacto.addContacto(nombre, numero)) {
					System.out.println("Contacto añadido correctamente ");
				} else
					System.out.println("Error, contacto no añadido");
				break;
			}
			case 2: {
				System.out.println("Nombre del contacto ");
				nombre = sc.nextLine();
				numero = Contacto.mostrarNumero(nombre);
				if (numero > 0) {
					System.out.println("El número es: " + numero);
				} else {
					System.out.println("No se encontró el contacto ");
				}
				break;
			}
			case 3: {
				Contacto.mostrarLista();
				break;
			}
			case 4: {
				Contacto.guardarLista();
				System.out.println("Has salido ");
				break;
			}
			default:
				System.out.println("Opción no válida ");
			}
		} while (opc != 4);
	}

	static void menu() {
		System.out.println("------MENU------");
		System.out.println("1. Nuevo contacto.\n" + 
		"2. Buscar por nombre.\n" + 
		"3. Mostrar todos.\n"+ 
		"4. Salir.\n" + "");
	}

}
