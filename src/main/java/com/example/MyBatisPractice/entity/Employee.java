package com.example.MyBatisPractice.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Employee implements Serializable {

	// emp_id serial not null
	private Integer empId;

	// emp_name character varying(100) not null
	private String empName;

	// emp_name_kana character varying(100)
	private String empNameKana;

	// emp_age integer
	private Integer empAge;

	// emp_hiredate date
	private Date empHiredate;

	// １対多の多側の為、List<Telephone> とする。
	private List<Telephone> telephones;

	// １対多の多側の為、List<Denpyou> とする。
	private List<Denpyou> denpyous;

}
