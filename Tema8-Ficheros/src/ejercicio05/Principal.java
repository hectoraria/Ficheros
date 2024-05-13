package ejercicio05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre = "";
		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter in = new BufferedWriter(new FileWriter("src/ejercicio05/prueba.txt", true));

			System.out.println("Inserta un nombre:");
			nombre = sc.nextLine();

			in.write(nombre);
			in.newLine();
			in.flush();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
