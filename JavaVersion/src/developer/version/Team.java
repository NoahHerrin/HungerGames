package developer.version;

import java.util.ArrayList;

import User.User;

public class Team {
	private String TeamName;
	private ArrayList<User> TeamMates = new ArrayList<User>();
	
	public Team(String setName) {
		setTeamName(setName);
	}

	public ArrayList<User> getTeamMates() {
		return TeamMates;
	}

	public void setTeamMates(ArrayList<User> teamMates) {
		TeamMates = teamMates;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	
}
