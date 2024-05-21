package ejercicio08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class gestiontemp {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String fecha;
		int max;
		int min;
		String registro;
		int opc = 0;

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio08/temp.txt", true));
			BufferedReader br = new BufferedReader(new FileReader("src/ejercicio08/temp.txt"));
			do {
				menu();
				System.out.println("Elige una opción ");
				opc = sc.nextInt();
				sc.nextLine();
				switch (opc) {
				case 1: {
					bw.write(nuevoRegistro());
					bw.newLine();
					bw.flush();
					bw.close();
					break;
				}
				case 2: {
					String a;
					while ((a = br.readLine()) != null) {
						System.out.println(a);
					}
					break;
				}
				case 3: {
					System.out.println("Has salido ");
					break;
				}
				default:
					System.out.println("Opción no válida ");
				}
			} while (opc != 3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void menu() {
		System.out.println("MENU");
		System.out.println(
				"1. Registra nueva temperatura.\n" + "2. Mostrar historial de registros.\n" + "3. Salir.\n" + "");
	}

	static String nuevoRegistro() {
		String nuevoRegistro = "";

		System.out.println("Introduce la fecha: dd-mm-aaaa");
		nuevoRegistro += sc.nextLine();
		System.out.println("Temperatura maxima");
		nuevoRegistro += "," + sc.nextInt();
		System.out.println("Temperatura minima");
		nuevoRegistro += "," + sc.nextInt();

		return nuevoRegistro;
	}
}
