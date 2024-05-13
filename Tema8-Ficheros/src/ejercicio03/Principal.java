package ejercicio03;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String nombre;
		double mediaEdad = 0;
		double mediaAltura = 0;
		int cont = 0;

		try {
			Scanner sc = new Scanner(new FileReader("src/ejercicio03/Alumnos.txt"));
			while (sc.hasNext()) {
				nombre = sc.next();
				System.out.println(nombre);
				mediaEdad += sc.nextInt();
				mediaAltura += Double.parseDouble(sc.next());
				cont++;
			}

			mediaEdad = (mediaEdad / cont);
			mediaAltura = (mediaAltura / cont);
			System.out.println("Edad media: " + mediaEdad);
			System.out.println("Altura media: " + mediaAltura);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
