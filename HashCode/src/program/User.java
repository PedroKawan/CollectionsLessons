package program;

import java.util.Objects;

public class User {
	
	String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		System.out.println(this.name + ": " + Objects.hash(name));
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
