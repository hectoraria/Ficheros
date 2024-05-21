package ejercicio06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		BufferedWriter bw=null;
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		try {
			Scanner sc = new Scanner(new FileReader("src/ejercicio06/desordenados.txt"));
			
			while(sc.hasNext()) {
				numeros.add(sc.nextInt());
				
			}
			System.out.println(numeros);
			bw= new BufferedWriter(new FileWriter("src/ejercicio06/Ordenados.txt",true));
			
			for(Integer num : numeros) {
				System.out.println(num);
				bw.write(num.toString());
				bw.newLine();
			}
			
			sc.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	

	}

}
