package io.javaa.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Result {

	private String matchday;
	private Date date;
	private String homecode;
	private String awaycode;
	public Integer homeScore;
	public Integer awayScore;
	@Id
	private String stadium;
	
	public Result() {
		
	}
	
	public Result(String matchday, Date date, String homecode, String awaycode, Integer homeScore, Integer awayScore, String stadium) {
		super();
		this.matchday = matchday;
		this.date = date;
		this.homecode = homecode;
		this.awaycode = awaycode;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.stadium = stadium;
	}
	
	public String getMatchday() {
		return matchday;
	}

	public void setMatchday(String matchday) {
		this.matchday = matchday;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHomecode() {
		return homecode;
	}
	public void setHomecode(String homecode) {
		this.homecode = homecode;
	}
	public String getAwaycode() {
		return awaycode;
	}
	public void setAwaycode(String awaycode) {
		this.awaycode = awaycode;
	}
	public Integer gethomeScore() {
		return homeScore;
	}
	public void sethomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}
	public Integer getawayScore() {
		return awayScore;
	}
	public void setawayScore(Integer awayScore) {
		this.awayScore = awayScore;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	} 
	
	
}
