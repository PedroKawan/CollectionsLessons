package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {
	
	public static void main(String[] args) {
		Map<Integer,String> user = new HashMap<>(); 
		user.put(0, "Pedro");
		user.put(31, "Ana");
		user.put(23, "Guilerme");
		user.put(7, "João");
		
		printl(user.get(0));
		printl(user.keySet());
		printl(user.values());
		printl(user.entrySet());
		
		l();
		
		printl(user.containsKey(1));
		printl(user.containsValue("Ana"));
		
		l();
		
		for(Entry<Integer, String> a: user.entrySet()) {
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

