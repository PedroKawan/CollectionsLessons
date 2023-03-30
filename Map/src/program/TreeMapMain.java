package program;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapMain {
	
	public static void main(String[] args) {
		//Mantem a ordem crescente
		TreeMap<Integer,String> tree = new TreeMap<>();
		tree.put(0, "Pedro");
		tree.put(31, "Ana");
		tree.put(23, "Guilerme");
		tree.put(10, "Marcos");
		tree.put(60, "Antony");
		tree.put(25, "Adam");
		tree.put(16, "Lia");
		tree.put(7, "João");
		
		printl(tree.entrySet());
		
		//retorna a ultima e primeira chave
		printl(tree.lastKey());
		printl(tree.firstKey());
		
		l();
		
		//headMap -> retorna os elementos abaixo do elemento passado como referencia
		printl(tree.headMap(23));
		printl(tree.headMap(23, true)); // incluindo o mesmo
		
		l();
		
		//subMap -> retorna os elementos dentro do intervalo de 'fromKey' até 'toKey'
		printl(tree.subMap(7, 31));
		printl(tree.subMap(7, false, 31, true)); //incluindo e excluindo os parametros do retorno
		printl(tree.subMap(7, false, 31, false));
		printl(tree.subMap(7, true, 31, true));
		
		l();
		
		//ceilingKey -> retorna a (menor) key maior ou igual que a key especificada 
		printl("ceilingKey: " + tree.ceilingKey(10));
		
		//higherKey -> retorna a (menor) key maior que a key especificada 
		printl("higherKey: " + tree.higherKey(10));
		
		//floorKey -> retorna a (maior) key menor ou igual que a key especificada 
		printl("floorKey: " + tree.floorKey(10));
		
		//lowerKey -> retorna a (maior) key menor que a key especificada 
		printl("lowerKey: " + tree.lowerKey(10));
		
		l();
		for(Entry<Integer, String> a: tree.entrySet()) {
			print(a.getKey() + ": ");
			printl(a.getValue());
		}	
	}
	static private void printl(Object o) {
		System.out.println(o);
	}
	static private void print(Object o) {
		System.out.print(o);
	}
	static private void l() {
		System.out.println();
	}
}

