package models;

import java.util.List;

public class Tournament {
	private int id;
	private String name;
	private List<Match> matches;
	
	public Tournament(int id, String name, List<Match> matches) {
		this.id = id;
		this.name = name;
		this.matches = matches;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Match> getMatches() {
		return matches;
	}
}