package developer.version;

public class User {
	private String name;
	
	public User(String setName) {
		this.setName(setName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Name: " + getName();
	}
}
