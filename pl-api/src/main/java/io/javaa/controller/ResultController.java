package io.javaa.controller;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javaa.model.Result;
import io.javaa.service.ResultService;

@RestController
@RequestMapping("/results")
public class ResultController {

	@Autowired
	private ResultService resultService;
	
	@RequestMapping(value = "/results", method = RequestMethod.GET)
	public List<Result> getAllResults(){
			return resultService.getAllResults();
		}
	
	@RequestMapping(value = "/results/{matchday}", method = RequestMethod.GET)
	public Result getResult(@PathVariable String matchday)
	{
		return resultService.getResult(matchday);
	}
	
	@RequestMapping(value="/results", method=RequestMethod.POST)
	public void addResult(Result result, String matchday, Date date, String homecode, String awaycode, Integer homeScore, Integer awayScore, String stadium)
	{
		resultService.addResult(result,matchday,date,homecode,awaycode,homeScore,awayScore,stadium);
	}
	
	
}
 
