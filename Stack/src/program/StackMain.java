package program;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackMain {
	
	public static void main(String[] args) {
		Deque<String> books = new ArrayDeque<String>();
		
		// Adiciona elementos a pilha
		//Se a pilha estiver cheia
		books.add("SchollBook"); //retorna uma excessão
		books.offer("48 Leis"); //retorna false
		books.offer("UniBook");
		
		System.out.println(books.peek());
		System.out.println(books.element());
		System.out.println(books.pop());
		
		//Tem algo errado aqui	
	}
}
