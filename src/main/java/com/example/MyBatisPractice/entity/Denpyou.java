package com.example.MyBatisPractice.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class Denpyou implements Serializable {

	/*
	CREATE TABLE denpyou
	(
		denpyou_id serial PRIMARY KEY
	,	hakkou_date DATE
	,	emp_id INTEGER
	,	foreign key (emp_id) references employee (emp_id)
	);
	 */

	// denpyou_id serial PRIMARY KEY
	private Integer denpyouId;

	// hakkou_date DATE
	private Date hakkouDate;

	// emp_id INTEGER
	private Integer empId;

}
