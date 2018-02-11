/**
 * 
 */
package io.javaa.controller;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.javaa.model.Ticket;
import io.javaa.service.TicketService;

/**
 * @author ramesh
 *
 */
@RestController
@RequestMapping("/tickets")
public class TicketController {
	

	@Autowired
	private TicketService ticketService;

	@RequestMapping(value = "/{club}/book", method = RequestMethod.GET)
	//@ResponseStatus(value = HttpStatus.OK)
	public Ticket createBook(Ticket tickets, Integer bookingId, String club, String name, Integer seatscount, Date travelDate){
		return ticketService.createBook(bookingId, club, name, seatscount, travelDate);
		
	}
	
	@RequestMapping(value = "/generatecost/{bookingid}", method = RequestMethod.GET)
	//@ResponseStatus(value = HttpStatus.OK)
	public Ticket estimate(@PathVariable("bookingid") Long id) {
		return ticketService.estimate(id);
	}
	
	@RequestMapping(value = "/cancel/{bookingid}", method = RequestMethod.GET)
	//@ResponseStatus(value = HttpStatus.OK)
	public void cancel(@PathVariable("bookingid") Integer id) {
		ticketService.cancel(id);
	}

}
