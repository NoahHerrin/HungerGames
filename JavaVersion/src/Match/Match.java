package Match;

import java.util.ArrayList;

import User.User;

public class Match {
	
	private String MatchID;
	private ArrayList<User> Members = new ArrayList<User>();

	public Match() {
		MatchID = generateID();
	}
	
	public String getMatchID() {
		return MatchID;
	}
	
	public void setMatchID(String setMatchID) {
		MatchID = setMatchID;
	}
	
	public ArrayList<User> getMembers() {
		return Members;
	}
	
	public void setMembers(ArrayList<User> members) {
		Members = members;
	}
	
	public void addMember(User u) {
		Members.add(u);
	}
	/**
	 * 
	 * @return a random 10 digit alphanumeric  ID 
	 */
	public String generateID() {
		String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";
		for (int i = 10; i > 0; --i) {

			result += chars.toCharArray()[(int) Math.round(Math.random() * (chars.length() - 1))];

		}

		return result;
	}
	
	public void print() {
		System.out.println("Match ID: " + getMatchID());
		for(User u: Members) {
			System.out.println(u.toString());
		}
		System.out.println(""); 
	}


}
