package DeathSystem;

import java.util.ArrayList;

import Match.Match;
import user.User;

public class SingleElimination implements DeathSystem{
	
	private ArrayList<User> DeadUsers;
	private Match match;
	
	public SingleElimination(Match setMatch) {
		this.match = setMatch;
		this.DeadUsers = new ArrayList<User>();
	}

	@Override
	public ArrayList<User> getDeadUsers() {
		
		return this.DeadUsers;
	}

	@Override
	public void newKill(User killer, User victim) {
		killer.addKill(victim);
		victim.killed();
		DeadUsers.add(victim);
		//Announce Death
		System.out.println(killer + " has killed " + victim + ".");
		
	}

	@Override
	public boolean isDead(User u) {
		return DeadUsers.contains(u);
	}
	
}
