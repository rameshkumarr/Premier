package io.javaa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.javaa.model.Result;
import io.javaa.repository.ResultRepo;

@Service
public class ResultService {

	@Autowired
	private ResultRepo resultRepo;
	

	public List<Result> getAllResults()
	{
		List<Result> results=new ArrayList<>();
		resultRepo.findAll()
		.forEach(results::add);
				return results;
	}


	public Result getResult(String matchday) {
		// TODO Auto-generated method stub
		Result results = new Result();
		if(results.getMatchday()!=null) {
			return resultRepo.findOne(matchday);
		}
		else
			return null;
	}


	public void addResult(Result result, String matchday, Date date, String homecode, String awaycode, Integer homeScore, Integer awayScore, String stadium) {
		// TODO Auto-generated method stub
		Result results = new Result();
		results.setMatchday(result.getMatchday());
		results.setHomecode(result.getHomecode());
		results.setAwaycode(result.getAwaycode());
		results.sethomeScore(result.gethomeScore());
		results.setawayScore(result.getawayScore());
		results.setStadium(result.getStadium());
	}
	
	
	
}
