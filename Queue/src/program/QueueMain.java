package program;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	
	public static void main(String[] args) {
		//Fist in, fist out
		Queue<String> fila = new LinkedList<>();
		
		// Adiciona elementos a fila
		// Se a fila estiver cheia:
		fila.add("Jõao"); //.add -> retorna uma excessão
		fila.offer("Pedro"); //.offer -> retorma false
		fila.add("Ana");
		fila.offer("Guilerme");
		
		
		//obtem o proximo elemento (sem remover)
		//Se a fila estiver vazia
		printl(fila.peek());  //.peek -> retorna null
		printl(fila.element()); //.element -> retorna uma excessão
		
		l();
		
		
		//obtem o proximo elemento e o remove
		//Se a fila estiver vazia
		printl(fila.poll()); //.poll -> retorna null
		printl(fila.poll()); //.remove -> retorna uma excessão
		printl(fila.remove());
		
	}
	
	public static void l() {
		System.out.println();
	}
	public static void printl(Object e) {
		System.out.println(e);
	}
}
