package com.example.MyBatisPractice.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Syouhin implements Serializable {

	/*
	CREATE TABLE syouhin
	(
		syouhin_id serial PRIMARY KEY
	,	syouhin_name VARCHAR (100) NOT NULL
	,	syouhin_genka INTEGER
	);
	 */

	// syouhin_id serial PRIMARY KEY
	private Integer syouhinId;

	// syouhin_name VARCHAR (100) NOT NULL
	private String syouhinName;

	// syouhin_genka INTEGER
	private Integer syouhinGenka;

}
