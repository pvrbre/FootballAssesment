package com.demoprojet.FootballMicroService;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Football MicroService Service Class

@Service
public class FootballService {
	
	private ArrayList<FootballModule> footballInfoList = new ArrayList<>(Arrays.asList(
	new FootballModule("41","England","150","League One","2611","EnglandTeam","1"),
	new FootballModule("68","Italy","151","League Two","2612","ItalyTeam","2"),
	new FootballModule("135","Spain","152","League Three","2613","Spain","3"),
	new FootballModule("51","Germany","153","League Four","2614","GermanyTeam","4"),
	new FootballModule("46","France","154","League Five","2615","FranceTeam","5"),
	new FootballModule("100","Netherlands","155","League Six","2616","NetherlandsTeam","6"))
	);	
	
	@Autowired
	FootballModule footballmodule;
	
	ArrayList<String> countries = new ArrayList<String>();
	ArrayList<String> leagues = new ArrayList<String>();
	
	public List<FootballModule> getList() {
		return footballInfoList;
	}

	public ArrayList<String> getCountries() {		
			
		countries.add(footballmodule.country_id);
		countries.add(footballmodule.country_name);		
		
		//return footballInfoList.stream().filter(t -> t.getCountry_id());
		return countries;
		
	}
	
	
	public ArrayList<String> getLeagues() {
		
		leagues.add(footballmodule.country_id);
		leagues.add(footballmodule.country_name);		
		leagues.add(footballmodule.league_id);
		leagues.add(footballmodule.league_name);
		
		return leagues;
			
		}
	
/*	public List<FootballModule> getTeams() {
		
	}
	
	
	public List<FootballModule>getPlayers() {
		
	} */
	
}
