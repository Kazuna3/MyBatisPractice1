package com.example.MyBatisPractice.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class FloorPlan implements Serializable {

	private Integer idid;
	private String floorPlanName;

	// １対多の多側の為、List<Mansion> とする。 
	private List<Mansion> mansions;

}
