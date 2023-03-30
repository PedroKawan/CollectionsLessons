package program;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {
	
	public static void main(String[] args) {
		// A ordem é definida pela sequencia que os elementos foram adicionados
		// é um meio termo entre HashSet e TreeSet em velocidade
		LinkedHashSet<String> link = new LinkedHashSet<>();
		link.add("Pedro");
		link.add("Ana");
		link.add("João");
		link.add("Kyle");
		
		System.out.println(link);
		System.out.println(link.size());
		
	}
}
