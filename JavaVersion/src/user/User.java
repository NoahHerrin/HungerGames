package user;

import java.util.ArrayList;

public class User {
	
	private String Name;
	private boolean alive = true;
	private User killedBy = null;
	private ArrayList<User> killList = new ArrayList<User>();
	
	public User(String setName) {
		this.Name = setName;
	}
	
	public boolean isAlive() {
		return this.alive;
		
	}
	
	public User getMurderer() {
		return this.killedBy;
	}
	
	public void addKill(User u) {
		killList.add(u);
	}
	
	public String toString() {
		return "Name: " + Name;
	}
	public void killed() {
		this.alive = false;
	}
 }
