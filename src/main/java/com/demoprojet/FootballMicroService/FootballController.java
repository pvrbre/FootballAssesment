package com.demoprojet.FootballMicroService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Football MicroService Controller Class

@RestController
public class FootballController {
	
	@Autowired
	FootballService footbalserv;
	
	@RequestMapping("/{?action=}/{get_countries}/")
	public ArrayList<String> get_countries() {
		return footbalserv.getCountries();
	}
	
	@RequestMapping("{/?action}/{get_leagues}/")
	public ArrayList<String> get_leagues() {
		return footbalserv.getLeagues();
	}
	
}