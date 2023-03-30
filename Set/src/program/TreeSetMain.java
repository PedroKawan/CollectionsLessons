package program;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		TreeSet<Integer> num = new TreeSet<>();
		num.add(62);
		num.add(30);
		num.add(4);
		num.add(10);
		num.add(84);
		num.add(100);
		num.add(130);
		System.out.println(num);
		
		
		// floor: retorna o maior elemento no conjunto menor ou igual ao elemento fornecido.
		println("floor: " + num.floor(40));
		println("-> " + num.floor(100));
		/**/
		
		l();
		
		// lower: retorna o maior elemento neste conjunto estritamente menor (não igual) do que o elemento fornecido.
		println("lower: " + num.lower(40));
		println("-> " + num.lower(100));
		/**/
		
		l();
		
		// ceiling: retorna o menor elemento neste conjunto maior ou igual ao elemento fornecido.
		println("cieiling: " + num.ceiling(62));
		println("-> " + num.ceiling(100));
		/**/
		
		l();
		
		// higher: retorna o menor elemento neste conjunto estritamente maior do que o elemento fornecido
		println("higher: " + num.higher(62));
		println("-> " + num.higher(100));
		/**/
		
		l();
		
		// subSet: método retornará elementos que variam de 'fromElement ' a ' toElement '.
		// Booleans inclusives - > Se o 'from or to Element' estarão incluidos na seleção.
 		println("subSet:" + num.subSet(10, 84));
 		println("-> " + num.subSet(10, false, 84, true));
 		println("-> " + num.subSet(10, true, 84, true));
 		println("-> " + num.subSet(10, false, 84, false));
 		/**/
 		
 		l();
 		
 		// headSet: retornará os valores que são menores que o Elemento especificado.
 		println("headSet: " + num.headSet(30));
 		println("-> " + num.headSet(30, true));
 		/**/
 		
 		l();
 		
 		// tailSet: retornará os valores que são maiores ou iguais que o Elemento especificado.
 		println("tailSet: " + num.tailSet(30));
 		println("-> " + num.tailSet(30, false));
 		/**/
	}

	

	
	public static void println(Object o) {
		System.out.println(o);
	}
	public static void l(){
		System.out.println();
	}
}
