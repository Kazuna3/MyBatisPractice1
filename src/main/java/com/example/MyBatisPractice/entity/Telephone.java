package com.example.MyBatisPractice.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Telephone implements Serializable {

	/*
	CREATE TABLE telephone(
			number VARCHAR (100) PRIMARY KEY
		,	owner_id INTEGER
		,	foreign key (owner_id) references employee (emp_id)
	
	);	
	 */

	// number VARCHAR (100) PRIMARY KEY
	private String number;

	// owner_id INTEGER
	private Integer ownerId;

}
