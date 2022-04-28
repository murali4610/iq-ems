package com.createiq.model;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@NoArgsConstructor
public class Address {
	
	private int id;
	private String name;
	public Address(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
