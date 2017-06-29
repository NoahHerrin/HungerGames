package Match;
import java.util.ArrayList;

import DeathSystem.DeathSystem;
import user.User;

public interface Match {
	public void ListUsers();
	public ArrayList<User> getUsers();
	public void ListAliveUsers();
	public void ListDeadUsers();
	public ArrayList<String> getActionFeed();
	public void kill(User killer, User Victim);
	public void newAction(String action);
	public DeathSystem getDeathSystem();
	public void addUser(User u);
}
