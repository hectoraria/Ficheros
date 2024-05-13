package ejercicio04;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		boolean palabraSalir;
		String nombre;

		try {
	       
	       
			Scanner sc = new Scanner(new FileReader("src/ejercicio04/texto.txt"));
			 while (sc.hasNext() && !(nombre = sc.next()).equalsIgnoreCase("fin")) {
		            System.out.println(nombre);
		        }

			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
