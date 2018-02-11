package io.javaa.service;

import java.util.Date;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javaa.model.Fixture;
import io.javaa.model.Teams;
import io.javaa.repository.FixtureRepo;


@Service
public class FixtureService {

	@Autowired
	private FixtureRepo fixtureRepo;

	public List<Fixture> getAllFixtures() {
		// TODO Auto-generated method stub
		List<Fixture> fixtures=new ArrayList<>();
		fixtureRepo.findAll()
		.forEach(fixtures::add);
				return fixtures;
	}

	public void generateFixture(Fixture fixture, Date date, String teams,boolean reverseFixture) {
		// TODO Auto-generated method stub
		Fixture fixtures = new Fixture();
		Teams t = new Teams();
		GregorianCalendar gregDate = new GregorianCalendar(2005 + 1900, Calendar.AUGUST, 6, 15, 0);
		int noteams = 20;
		int totalRounds = noteams - 1;
		int matchesPerRound = noteams / 2;
		for(int round = 0;round < totalRounds; round++) {
			for(int match = 0;match < matchesPerRound; match++) {
				if(round != match) {
					fixtures.setMatchday(fixture.getMatchday());
					fixture.setHome(t.teams[round]);
					fixture.setAway(t.teams[match]);
					fixtures.setStadium(fixture.getStadium());
				}
			}
			gregDate.add(Calendar.DATE,7);	
		}
		if(reverseFixture) {
		
			for(int round = 0;round < totalRounds; round++) {
				for(int match = 0;match < matchesPerRound; match++) {
					if(round != match) {
						fixtures.setMatchday(fixture.getMatchday());
						fixture.setHome(t.teams[match]);
						fixture.setAway(t.teams[round]);
						fixtures.setStadium(fixture.getStadium());
					}
				}
				gregDate.add(Calendar.DATE,7);	
			}
		}
		fixtureRepo.save(fixture);
	
	}

	public void delete(String matchday) {
		// TODO Auto-generated method stub
		fixtureRepo.delete(matchday);
	}

	/*public List<Fixture> getFixture(String club) {
		// TODO Auto-generated method stub
		List<Fixture> fixture = new ArrayList<>();
		Fixture fix = new Fixture();
		for(int i=0;i<fixture.size();i++) {
			Fixture f = fixture.get(i);
			if(f.getHome().equals(club)) {
				fix = fixture.get(i);
			}
				
		}
		return fixture;
	}*/
	
}	