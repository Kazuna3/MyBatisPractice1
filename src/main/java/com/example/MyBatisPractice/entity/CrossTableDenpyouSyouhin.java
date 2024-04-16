package com.example.MyBatisPractice.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrossTableDenpyouSyouhin implements Serializable {

	/*
	CREATE TABLE cross_table_denpyou_syouhin
	(
		denpyou_id INTEGER
	,	syouhin_id INTEGER
	,	urine INTEGER
	,	foreign key (denpyou_id) references denpyou (denpyou_id)
	,	foreign key (syouhin_id) references syouhin (syouhin_id)
	);
	 */

	// denpyou_id INTEGER
	private Integer denpyouId;

	// syouhin_id INTEGER	
	private Integer syouhinId;

	// urine INTEGER
	private Integer urine;

	// １対多の１側の為、List にはしない。
	private Denpyou denpyou;
	private Syouhin syouhin;

}
