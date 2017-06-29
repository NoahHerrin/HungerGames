package DeathSystem;

import java.util.ArrayList;

import user.User;

public interface DeathSystem {
	public ArrayList<User> getDeadUsers();
	public void newKill(User killer, User victim);
	public boolean isDead(User u);
}
