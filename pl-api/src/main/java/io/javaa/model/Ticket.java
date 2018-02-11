package io.javaa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	private Integer bookingId;
	private String  club;
	private String name;
	private Integer seatscount;
	private Date travelDate;
	private String matchType;
	private Double total;
	
	public Ticket() {
		
	}
	
	public Ticket(Integer bookingId, String club, String name, Integer seatscount, Date travelDate,String matchType,Double total) {
		super();
		this.bookingId = bookingId;
		this.club = club;
		this.name = name;
		this.seatscount = seatscount;
		this.travelDate = travelDate;
		this.matchType = matchType;
		this.total = total;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
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
	public Integer getSeatscount() {
		return seatscount;
	}
	public void setSeatscount(Integer seatscount) {
		this.seatscount = seatscount;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	

	
}
