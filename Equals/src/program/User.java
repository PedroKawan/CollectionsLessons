package program;

public class User {
	String name;
	String email;
	
	public User(String name, String email) {
		this.setName(name);
		this.setEmail(email);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof User) {
			User other = (User) obj;
			boolean tfName = this.name.equals(other.name);
			boolean tfEmail = this.email.equals(other.email);
			return tfName && tfEmail;
		} else {
			return false;
		}
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
}
