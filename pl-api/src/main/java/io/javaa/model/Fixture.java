package io.javaa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fixture {

	private String matchday;
	private Date date;
	private String time;
	private String home;
	private String away;
	@Id
	private String stadium;
	
	public Fixture() {

	}

	public Fixture(String matchday, Date date, String home, String away, String time, String stadium) {
		super();
		this.matchday = matchday;
		this.date = date;
		this.home = home;
		this.away = away;
		this.time = time;
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
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getAway() {
		return away;
	}
	public void setAway(String away) {
		this.away = away;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
	
}
