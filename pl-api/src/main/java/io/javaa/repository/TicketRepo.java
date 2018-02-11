package io.javaa.repository;

import org.springframework.data.repository.CrudRepository;


import io.javaa.model.Ticket;

public interface TicketRepo extends CrudRepository<Ticket,Integer> {
	
	public Ticket findByName(String name);

}
