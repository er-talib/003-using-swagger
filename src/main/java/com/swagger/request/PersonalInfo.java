package com.swagger.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PersonalInfo {
	
	private String firstName ;
	private String lastName ;
	private String from ;
	private String to ;
	private int price ;
	private String trainName ;
	private Date choseDate ; 

}
