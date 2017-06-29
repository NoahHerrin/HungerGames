package application;

import Match.FFA;
import Match.Match;
import user.User;

public class Application {
	public static void main(String[] args) {
		Match ffa = new FFA();
		User[] users = { 
				new User("Noah"), new User("Takashi"), new User("Kai"),
				new User("Ben"), new User("Griffin")
		};
		for(User u: users) {
			
			ffa.addUser(u);
			
		}
		System.out.println("Testing addition of users");
		ffa.ListUsers();
		//trying to kill somebody before match starts
		ffa.kill(users[0], users[2]);
		
		((FFA) ffa).startMatch();
		
		ffa.kill(users[0], users[2]);
		ffa.kill(users[2], users[3]);
		ffa.kill(users[2], users[3]);
		ffa.kill(users[0], users[1]);
		ffa.kill(users[3], users[0]);
		ffa.ListAliveUsers();
		ffa.ListDeadUsers();
		
		
	}
}
