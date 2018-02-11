package io.javaa.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javaa.model.Match_Result_Enum;
import io.javaa.model.Table1;
import io.javaa.service.Table1Service;



@RestController
@RequestMapping("/tables")
public class Table1Controller {

	@Autowired
	private Table1Service table1Service;
	
	@RequestMapping(value = "/tables",method = RequestMethod.GET)
	public List<Table1> getAllTables(){
		return table1Service.getAllTables();
	}
	
	
	@RequestMapping(value = "/tables/{club}",method = RequestMethod.PUT)
	public void standings(@PathVariable String club,Match_Result_Enum result,int goalsfor,int goalsagainst) {
		table1Service.standings(club,result,goalsfor,goalsagainst);
	}
	
	/*@RequestMapping(value = "/tables/{club}",method = RequestMethod.PUT)
	public void awayStandings(@PathVariable String club,Match_Result_Enum result,int goalsfor,int goalsagainst) {
		table1Service.awayStandings(club,result,goalsfor,goalsagainst);
	}*/
	
	@RequestMapping(value = "/tables/sort",method = RequestMethod.GET)
	public List<Table1> sortTable(int points,int goalsfor,int goalsagainst,int goalsdiff,Table1 table1) {
		return table1Service.sortTable(points,goalsfor,goalsagainst,goalsdiff, table1);
	}
}
