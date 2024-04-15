package com.example.MyBatisPractice.repository;

import java.util.List;

import com.example.MyBatisPractice.entity.FloorPlan;

// Mapper Interface
// @MapperScan を書かない場合は、Mapper Repository のクラスに @Mapper アノテーションを付ける必要がある。
// @Mapper
public interface FloorPlanRepository {

	public List<FloorPlan> selectByFloorPlanIdWithMansion(Integer id);

	public List<FloorPlan> selectAll();

	// public List<FloorPlan> selectById(Integer id);
	public FloorPlan selectById(Integer id);

	public List<FloorPlan> selectByIdIN(List<Integer> idList);

	public List<FloorPlan> selectByFloorPlanNameLike(String floorPlanName);

	public List<FloorPlan> selectByTrim(FloorPlan floorPlan);

	public Boolean insert_01(FloorPlan floorPlan);

	public Boolean update_01(FloorPlan floorPlan);

	public Boolean update_02(FloorPlan floorPlan);

}
