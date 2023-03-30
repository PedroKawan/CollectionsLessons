package program;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		//É indexado, e mantem a ordem de incessão;
		ArrayList<Fruits> list = new ArrayList<Fruits>();
		list.add(new Fruits("Apple"));
		list.add(new Fruits("Banana"));
		list.add(new Fruits("Grape"));
		list.add(new Fruits("StrawBerry"));
		list.add(new Fruits("Apple"));
		
		System.out.println(list);
		System.out.println(list.get(1));
	
		l();
		
		System.out.println(list.remove(new Fruits("Grape")));
		System.out.println(list.remove(1));
		
		l();
		
		System.out.println(list);
		System.out.println(list.get(0).equals(list.get(2)));

		
	}
	public static void l() {
		System.out.println();
	}
}
