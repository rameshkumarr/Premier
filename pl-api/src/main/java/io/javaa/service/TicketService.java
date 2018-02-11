package io.javaa.service;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javaa.model.Ticket;
import io.javaa.repository.TicketRepo;

@Service
public class TicketService {
	@Autowired
	private TicketRepo ticketRepo;
	
	//private TicketService ticketService;
	
	public static final int Seasontckt=869; //Season tickets
	
	public static final int Plmatches=59; //premier league matches
	
	public static final int Europeantckts=57; //European matches
	
	public static final int Domestic=46; //Domestic cup matches
	
	public Ticket createBook(Integer bookingId, String club, String name, Integer seatscount, Date travelDate){
		Ticket tickets = new Ticket();
		tickets.setBookingId(bookingId);
		tickets.setClub(club);
		tickets.setName(name);
		tickets.setSeatscount(seatscount);
		tickets.setTravelDate(travelDate);
		return tickets;
	}

	public Ticket estimate(Long id) {
		// TODO Auto-generated method stub
		Ticket tickets = new Ticket();
		double cost=0.0;
		if(tickets.getTotal()!=null){
			return tickets;
		}
		else {
			String matchType = tickets.getMatchType();
			int seatscount = tickets.getSeatscount();
			switch(matchType) {
			case "Seasontckt" : cost = seatscount * Seasontckt;
			break;
			case "Plmatches" : cost = seatscount * Plmatches;
			break;
			case "Europeantckts" : cost = seatscount * Europeantckts;
			break;
			case "Domestic" : cost = seatscount * Domestic;
			break;
			}
		}

	    tickets.setTotal(cost);
		return tickets;
	}

	public void cancel(Integer id) {
		// TODO Auto-generated method stub
		
		ticketRepo.delete(id);
	}

}
