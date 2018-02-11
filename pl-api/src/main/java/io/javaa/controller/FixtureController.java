package io.javaa.controller;

import java.util.Date;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javaa.model.Fixture;
import io.javaa.service.FixtureService;

@RestController
@RequestMapping("\fixtures")
public class FixtureController {

	@Autowired
	private FixtureService fixtureService;
	
	@RequestMapping(value = "/fixtures",method = RequestMethod.GET)
	public List<Fixture> getAllFixtures() {
		return fixtureService.getAllFixtures();
	}
	
	/*@RequestMapping(value = "/fixtures/{club}",method = RequestMethod.GET)
	public List<Fixture> getFixture(@PathVariable String club){
		return fixtureService.getFixture(club);
	}*/
	
	@RequestMapping(value = "/fixtures",method = RequestMethod.POST)
	public void generateFixture(Fixture fixture,Date date,String teams,boolean reverseFixture) {
		fixtureService.generateFixture(fixture,date,teams, reverseFixture);
	}
	
	@RequestMapping(value="/fixtures{matchday}",method=RequestMethod.DELETE)
	public void delete(@PathVariable String matchday)
	{
		fixtureService.delete(matchday);
	}
}

