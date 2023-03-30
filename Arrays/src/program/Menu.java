package program;

import java.util.Scanner;

public class Menu {
	String name;
	
	public Menu() {
		Scanner reader = new Scanner(System.in);

		System.out.print("Name: ");
		this.name = reader.nextLine();

		System.out.print("Quantas notas deseja informar? ");
		int amount = reader.nextInt();
		
		
		double[] notas = new double[amount];
		notas = InputNotas(notas);
		somNotas(notas);
		reader.close();
	}

	public double[] InputNotas(double[] array) {
		Scanner reader = new Scanner(System.in);
		String ajuda;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite a " + (i + 1) + "º Nota: ");
			ajuda = reader.nextLine().replaceAll(",", ".");
			array[i] = Double.parseDouble(ajuda);
		}
		reader.close();
		
		return array;
	}
	
	public void somNotas(double[] array) {
		double total = 0;
		for(double a: array) {
			total += a;
		}
		System.out.println("Alune: " + this.name);
		System.out.println("Total: " + total);
		System.out.println("Media: " + total/array.length);
	}
}
