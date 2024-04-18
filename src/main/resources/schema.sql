DROP TABLE IF EXISTS mansion;
DROP TABLE IF EXISTS floor_plan;
DROP TABLE IF EXISTS cross_table_denpyou_syouhin;
DROP TABLE IF EXISTS denpyou;
DROP TABLE IF EXISTS telephone;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS syouhin;

CREATE TABLE floor_plan
(
		id serial PRIMARY KEY
	,	floor_plan_name VARCHAR (100)
);

CREATE TABLE mansion
(
		id serial PRIMARY KEY
	,	name VARCHAR (100)
	,	address VARCHAR (100)
	,	station VARCHAR (100)
	,	floor_plan_id INTEGER
	,	building_date DATE
	,	status boolean
	,	foreign key (floor_plan_id) references floor_plan (id)
);

CREATE TABLE employee(
		emp_id serial PRIMARY KEY
	,	emp_name VARCHAR (100) NOT NULL
	,	emp_name_kana VARCHAR (100)
	,	emp_age INTEGER
	,	emp_hiredate DATE
);

CREATE TABLE denpyou
(
		denpyou_id serial PRIMARY KEY
	,	hakkou_date DATE
	,	emp_id INTEGER
	,	foreign key (emp_id) references employee (emp_id)
);

CREATE TABLE syouhin
(
		syouhin_id serial PRIMARY KEY
	,	syouhin_name VARCHAR (100) NOT NULL
	,	syouhin_genka INTEGER
);

CREATE TABLE cross_table_denpyou_syouhin
(
   		denpyou_id INTEGER
	,	syouhin_id INTEGER
	,	urine INTEGER
	,	foreign key (denpyou_id) references denpyou (denpyou_id)
	,	foreign key (syouhin_id) references syouhin (syouhin_id)
	,	PRIMARY KEY (denpyou_id, syouhin_id)
);

CREATE TABLE telephone(
		number VARCHAR (100) PRIMARY KEY
	,	owner_id INTEGER
	,	foreign key (owner_id) references employee (emp_id)

);
