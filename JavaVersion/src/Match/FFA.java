package Match;

import java.util.ArrayList;

import DeathSystem.DeathSystem;
import DeathSystem.SingleElimination;
import user.User;

public class FFA implements Match{
	
	/*
	 * 
	 * Free For All Game Mode
	 * 
	 */
	private boolean matchStarted = false;
	private ArrayList<User> Users;
	private ArrayList<String> ActionList;
	private DeathSystem deathSystem;
	
	public FFA() {
		this.deathSystem = new SingleElimination(this);
		this.Users = new ArrayList<User>();
		this.ActionList = new ArrayList<String>();
	}
	
	public void startMatch() {
		this.matchStarted = true;
		System.out.println("Match has started");
	}
	
	public void addUser(User u) {

		Users.add(u);
	}
	
	@Override
	public void ListUsers() {
		System.out.println("Users in FFA Match");
		for(User u: Users) {
			System.out.println(u.toString());
		}
	}

	@Override
	public ArrayList<User> getUsers() {
		// TODO Auto-generated method stub
		return this.Users;
	}

	@Override
	public void ListAliveUsers() {
		System.out.println("Remaining Users");
		for(User u: Users) {
			if(u.isAlive()) {
				System.out.println(u.toString());
			}
		}
		
	}

	@Override
	public void ListDeadUsers() {
		System.out.println("Dead Users");
		for(User u: this.getDeathSystem().getDeadUsers()) {
			System.out.println(u.toString());
		}
		
	}

	@Override
	public ArrayList<String> getActionFeed() {
		// TODO Auto-generated method stub
		return this.ActionList;
	}

	@Override
	public void kill(User killer, User victim) {
		//confirm that killer is alive, match has started, and victim is alive
		if(this.matchStarted == true && killer.isAlive() ) {
		this.getDeathSystem().newKill(killer, victim);
		} else {
			System.out.println("Invalid Kill");
		}
		
	}

	@Override
	public void newAction(String action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DeathSystem getDeathSystem() {
		return this.deathSystem;
		
	}

}
