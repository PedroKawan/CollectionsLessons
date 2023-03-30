package program;

import java.util.HashSet;

public class TestMain {
	public static void main(String[] args) {
		HashSet<User> users = new HashSet<>();
		users.add(new User("Pedro"));
		users.add(new User("Ana"));
		users.add(new User("Guilherme"));
		users.add(new User("João"));
		users.add(new User("Emille"));
		
		//HashCode é usado para determinar quais elementos serão usados no equals ou contains
		//Ex: se determinar o hashcode como 1, todos os usuarios serão comparados
		//Ex: se for igual ao tamanho do nome, apenas os users com o tamanho de nome iguais serão comparados
		
		boolean result = users.contains(new User("Emille"));
		boolean resulte = new User("Emille").equals(new User("Ana"));
		boolean resulte2 = new User("Emille").equals(new User("Emille"));
		System.out.println(result);
		System.out.println(resulte);
		System.out.println(resulte2);
	}
}
