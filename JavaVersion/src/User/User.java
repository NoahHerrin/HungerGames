package User;

import java.util.ArrayList;

public class User {
	private String name;
	private boolean alive = true;
	
	
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
