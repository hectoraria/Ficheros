package ejercicio07;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Contacto {
	static TreeMap<String, Integer> lista = new TreeMap<>();

	public static boolean isFull(String nombre) {
		boolean lleno = false;

		if (lista.size() >= 20 || lista.containsKey(nombre)) {
			lleno = true;
		}
		return lleno;
	}

	public static boolean addContacto(String nombre, int numero) {
		boolean done = false;
		if (!isFull(nombre)) {
			lista.put(nombre, numero);
			done = true;

		}
		return done;
	}

	public static int mostrarNumero(String nombre) {
		int numero = 0;
		if (lista.containsKey(nombre)) {
			numero = lista.get(nombre);
		}
		return numero;
	}

	public static void mostrarLista() {
		for (Map.Entry<String, Integer> entry : lista.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void guardarLista() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio07/agendacontactos.txt"));
			for (Map.Entry<String, Integer> entry : lista.entrySet()) {
				bw.write(entry.getKey() + " " + entry.getValue());
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void recuperarDatos() {
		String nombre;
		int numero;
		try {
			Scanner sc = new Scanner(new FileReader("src/ejercicio07/agendacontactos.txt"));
			while (sc.hasNext()){
				nombre = sc.next();
				numero = sc.nextInt();
				lista.put(nombre, numero);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
