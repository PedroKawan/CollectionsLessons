package program;

import java.util.HashSet;

public class HashSetMain{
	
	public static void main(String[] args) {
		//<Object> for all objects;
		HashSet<Object> retain = new HashSet<Object>();
		HashSet<Object> set = new HashSet<Object>();		
		
		set.add("Pedro");
		set.add('P');
		set.add(10);
		set.add(5.5);
		set.add(true);
		print(set);
		
		//<Number> for all number values;
		HashSet<Number> set2 = new HashSet<Number>();
		set2.add(5);
		set2.add(2.3);
		set2.add(5.5);
		print(set2);
		
		retain.addAll(set); 
		retain.retainAll(set2); //Reter apenas o valores iguais entre as collections
		print(".retainAll: " + retain);
		
		set.addAll(set2); // União entre collections
		print(".addAll: " + set);
		
		
		set.removeAll(set2);  //Remoção dos valores de uma collections detro da outra
		print(".removeAll: " + set); 

	}
	
	public static void print(Object o) {
		System.out.println(o);
	}
}
