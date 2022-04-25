package com.swagger.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	
	private String fullName ;
	private String ticketId ;
	private String  status ;
	private String from ;
	private String to ;
	private int price ;
	private String trainName ;
	private Date journeyDate ; 


}
