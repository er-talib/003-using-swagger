package com.swagger.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.request.PersonalInfo;
import com.swagger.response.Ticket;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("Train Ticket API")
public class MyTicketController {

	@PostMapping(value = { "/ticket", "/" }, 
			produces = { 
					"application/json",
				    "application/xml" 
					}, 
			consumes = {
			          "application/json", 
			          "application/xml" 
			          }
	)
	@ApiOperation("This useg for book ticket")
	public ResponseEntity<Ticket> ticketInfo(@RequestBody PersonalInfo info) {

		Ticket ticket = new Ticket();
		ticket.setFullName(info.getFirstName() + " " + info.getLastName());
		ticket.setFrom(info.getFrom());
		ticket.setTo(info.getTo());
		ticket.setJourneyDate(new Date());
		ticket.setPrice(info.getPrice());
		ticket.setStatus("Confirm");
		ticket.setTrainName(info.getTrainName());
		ticket.setTicketId("INR-1234fns");

		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);

	}

}
