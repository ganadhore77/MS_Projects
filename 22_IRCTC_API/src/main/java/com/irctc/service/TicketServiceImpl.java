package com.irctc.service;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.irctc.bindings.Passenger;
import com.irctc.bindings.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	Map<Integer, Ticket> map = new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger p) {
		
		Ticket t = new Ticket();
		
		Random r = new Random();
		int id = r.nextInt(5);			
		
//		BeanUtils.copyProperties(p, t);
		
		t.setTicketNum(id);
		t.setDoj(p.getDoj());
		t.setEmail(p.getEmail());
		t.setFrom(p.getFrom());
		t.setName(p.getName());
		t.setTo(p.getTo());
		t.setTrainNum(p.getTrainNum());
		t.setStatus("CONFIRMED");
		System.out.println(p);
		map.put(id, t);
		System.out.println(t);
		Date date = new Date();
		System.out.println("Timestamp : "+date);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		
		return map.values();
	}

}