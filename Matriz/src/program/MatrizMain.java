package program;

import java.util.Arrays;

public class MatrizMain {

	public static void main(String[] args) {
		
		String[][] person = new String[2][1];
		person[0][0] = "A";
		person[1][0] = "B";
		
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		}
		
		for(String[] a: person) {
			System.out.println(Arrays.toString(a));
			
		}
	}

}
