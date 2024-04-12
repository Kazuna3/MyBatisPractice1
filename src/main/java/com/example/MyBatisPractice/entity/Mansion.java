package com.example.MyBatisPractice.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class Mansion implements Serializable {

	private Integer id;
	private String name;
	private String address;
	private String station;
	private Integer floorPlanId;
	private Date buildingDate;
	private Boolean status;

	// １対多の１側の為、List にはしない。
	private FloorPlan floorPlan;

}
