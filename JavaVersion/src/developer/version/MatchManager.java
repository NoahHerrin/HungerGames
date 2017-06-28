package developer.version;

import java.util.ArrayList;

import Match.Match;

public class MatchManager {
	
	private ArrayList<Match> MatchList = new ArrayList<Match>();
	
	public MatchManager() {
		
	}
	
	public String addMatch(Match m) {
		MatchList.add(m);
		return m.getMatchID();
	}
	
	/**
	 * 
	 * @param MatchID takes a valid id for a Match Object
	 * @return the match with a id corresponds to MatchID
	 */
	public Match getMatch(String MatchID) {
		for(Match m: MatchList) {
			if(m.getMatchID().equals(MatchID)) {
				return m;
			}
		}
		throw new IllegalArgumentException();
	}
	
	public void print() {
		for(Match m: MatchList) {
			m.print();
		}
	}
}
