package io.javaa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClubsProfile {

	@Id
	public String name;
	public String code;
	public String shortName;
	public Integer squadValue;
	
	public ClubsProfile() {

	}
	public ClubsProfile(String name, String code, String shortName, Integer squadValue) {
		super();
		this.name = name;
		this.code = code;
		this.shortName = shortName;
		this.squadValue = squadValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Integer getSquadValue() {
		return squadValue;
	}
	public void setSquadValue(Integer squadValue) {
		this.squadValue = squadValue;
	}
	
	
}
