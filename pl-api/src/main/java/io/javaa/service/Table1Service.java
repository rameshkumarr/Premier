package io.javaa.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javaa.model.Match_Result_Enum;
import io.javaa.model.Result;
import io.javaa.model.Table1;
import io.javaa.repository.Table1Repo;

@Service
public class Table1Service {

	@Autowired
	private Table1Repo table1Repo;
	
	public List<Table1> getAllTables()
	{
		List<Table1> table1s=new ArrayList<>();
		table1Repo.findAll()
		.forEach(table1s::add);
				return table1s;
	}

	/*public Table1 getTable(String club) {
		// TODO Auto-generated method stub
		Table1 table1s = new Table1();
		Fixture fixture = new Fixture();
		FixtureService fix = new FixtureService();
		fixture.setHome(table1s.getClub());
		fix.getFixture(club);
		return table1s;
	}*/

	public Table1 standings(String club, Match_Result_Enum result, int goalsfor, int goalsagainst) {
		// TODO Auto-generated method stub
		Table1 table1s = new Table1();
		Result results = new Result();
		Match_Result_Enum home = table1s.getResult();
		goalsfor = results.gethomeScore();
		goalsagainst = results.getawayScore();
	    if(home == Match_Result_Enum.RESULT_X) {
	    	table1s.addDrawn(goalsfor,goalsagainst);
	    }
	    else if(home == Match_Result_Enum.RESULT_1) {
	    	table1s.addWon(goalsfor,goalsagainst);
	    }
	    else {
	    	table1s.addLoss(goalsfor,goalsagainst);
	    }
		return table1s;
	}

	/*public Table1 awayStandings(String club, Match_Result_Enum result, int goalsfor, int goalsagainst) {
		// TODO Auto-generated method stub
		Table1 table1s = new Table1();
		Result results = new Result();
		Match_Result_Enum away = table1s.getResult();
		goalsfor = results.getawayScore();
		goalsagainst = results.gethomeScore();
	    if(away == Match_Result_Enum.RESULT_X) {
	    	table1s.addDrawn(goalsfor,goalsagainst);
	    }
	    else if(away == Match_Result_Enum.RESULT_1) {
	    	table1s.addWon(goalsfor,goalsagainst);
	    }
	    else {
	    	table1s.addLoss(goalsfor,goalsagainst);
	    }
		return table1s;
	}
		*/
	  public class CustomComparator implements Comparator<Table1> {
	        @Override
	        public int compare(Table1 t1, Table1 t2) {
	            return t1.compareTo(t2);
	        }
	    }

	public List<Table1> sortTable(int points, int goalsfor, int goalsagainst, int goalsdiff, Table1 table1) {
		// TODO Auto-generated method stub
		//Table1 table1s = new Table1();
		List<Table1> sortedList=new ArrayList<>();
		Collections.sort(sortedList, new CustomComparator());
		table1Repo.save(table1);
		return sortedList;
	}
	
	
}
