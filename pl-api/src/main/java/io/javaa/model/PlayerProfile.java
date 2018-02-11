package io.javaa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerProfile {

	@Id
	public Integer clubId;
	public String club;
	public String name;
	public Integer jerseyNum;
	public Integer apperances;
	public Integer goals;
	public Date contractUntil;
	public Integer marketValue;
	
	public PlayerProfile() {
	
	}
	
	public PlayerProfile(Integer clubId, String club,String name, Integer jerseyNum, Integer apperances, Integer goals, Date contractUntil, Integer marketValue) {
		super();
		this.clubId = clubId;
		this.club = club;
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.apperances = apperances;
		this.goals = goals;
		this.contractUntil = contractUntil;
		this.marketValue = marketValue;
	}
	
	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJerseyNum() {
		return jerseyNum;
	}

	public void setJerseyNum(Integer jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	public Integer getApperances() {
		return apperances;
	}
	public void setApperances(Integer apperances) {
		this.apperances = apperances;
	}
	public Integer getGoals() {
		return goals;
	}
	public void setGoals(Integer goals) {
		this.goals = goals;
	}
	public Date getContractUntil() {
		return contractUntil;
	}
	public void setContractUntil(Date contractUntil) {
		this.contractUntil = contractUntil;
	}
	public Integer getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(Integer marketValue) {
		this.marketValue = marketValue;
	}
	
	
}
