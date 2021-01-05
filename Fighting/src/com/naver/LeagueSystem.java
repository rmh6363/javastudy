package com.naver;

public class LeagueSystem {
	private League league;

	public LeagueSystem() {
		// TODO Auto-generated constructor stub
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}
	public League makeLeague(String name, int number) {
		name = "lol";
		number = 3000;
		return new League();
		
	}

}
