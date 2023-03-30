package program;

public class EqualsMain {
	
	public static void main(String[] args) {
		User u1 = new User("Pedro","pedro@gmail.com");
		User u2 = new User("Pedro","pedro@gmail.com");
		
		System.out.println(u1.equals(u2));
	}
}
