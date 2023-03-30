package program;

import java.util.HashSet;

public  class HashSetOrganized{
	
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("Pedro");
		names.add("Ana");
		names.add("Joao");
		names.add("Marcos");
		names.add("Emille");
		println(names);
		println(names.contains("Pedro") + "\n");
		
		println(names.size());
		for(String a: names) {println(a);}
		
		names.forEach(n -> {print(n);});
	}
	
	public static void print(Object o) {
		System.out.print(o);
	}
	public static void println(Object o) {
		System.out.println(o);
	}
}
