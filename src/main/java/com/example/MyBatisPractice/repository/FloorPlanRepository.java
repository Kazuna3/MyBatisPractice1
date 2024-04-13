package com.example.MyBatisPractice.repository;

import java.util.List;

import com.example.MyBatisPractice.entity.FloorPlan;

// Mapper Interface
// @MapperScan を書かない場合は、Mapper Repository のクラスに @Mapper アノテーションを付ける必要がある。
// @Mapper
public interface FloorPlanRepository {

	public List<FloorPlan> selectByFloorPlanIdWithMansion(Integer id);

}
