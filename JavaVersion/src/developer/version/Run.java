package developer.version;

public class Run {
	public static void main(String[] args) {
		//creates Match Manager
		MatchManager server = new MatchManager();
		
		//tests match creation
		String a = server.addMatch(new Match());
		String b = server.addMatch(new Match());
		String c = server.addMatch(new Match());
		
		//tests adding users to matches
		server.getMatch(b).addMember(new User("Noah"));
		server.getMatch(b).addMember(new User("Kirby"));
		server.getMatch(b).addMember(new User("Daisy"));
		
		server.getMatch(a).addMember(new User("Kai"));
		
		server.getMatch(c).addMember(new User("Ben"));
		server.getMatch(c).addMember(new User("Griffin"));
		server.getMatch(c).addMember(new User("Takashi"));
		
		//print out server data
		server.print();
	}
}
