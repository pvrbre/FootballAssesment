package com.demoprojet.FootballMicroService;

//Football MicroService Module Class

public class FootballModule {
	
	String country_id;
	String country_name;
	String league_id;
	String league_name;
	String team_id;	
	String team_name;
	String league_position;
	
	//Constructor
	FootballModule() {
		
	}
	
	//Parameterized Constructor
	public FootballModule(String country_id, String country_name, String league_id, String league_name, String team_id,
			String team_name, String league_position) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.league_id = league_id;
		this.league_name = league_name;
		this.team_id = team_id;
		this.team_name = team_name;
		this.league_position = league_position;
	}

	//Getter and Setter Methods
	public String getCountry_id() {
		return country_id;
	}
	
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getLeague_id() {
		return league_id;
	}

	public void setLeague_id(String league_id) {
		this.league_id = league_id;
	}

	public String getLeague_name() {
		return league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}

	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getLeague_position() {
		return league_position;
	}

	public void setLeague_position(String league_position) {
		this.league_position = league_position;
	}
	
}
