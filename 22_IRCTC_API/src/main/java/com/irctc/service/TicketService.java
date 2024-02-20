package com.irctc.service;

import java.util.Collection;
import java.util.List;

import com.irctc.bindings.Passenger;
import com.irctc.bindings.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);
	
	public Collection<Ticket> getAllTickets();
}
