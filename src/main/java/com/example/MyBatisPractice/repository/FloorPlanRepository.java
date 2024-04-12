package com.example.MyBatisPractice.repository;

import java.util.List;

import com.example.MyBatisPractice.entity.FloorPlan;

public interface FloorPlanRepository {

	public List<FloorPlan> selectByFloorPlanIdWithMansion(Integer id);

}
