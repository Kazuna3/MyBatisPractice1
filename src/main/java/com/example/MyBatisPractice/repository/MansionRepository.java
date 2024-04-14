package com.example.MyBatisPractice.repository;

import java.util.List;

import com.example.MyBatisPractice.entity.Mansion;

// Mapper Interface
// @MapperScan を書かない場合は、Mapper Repository のクラスに @Mapper アノテーションを付ける必要がある。
// @Mapper
public interface MansionRepository {

	public List<Mansion> selectAll();

	public Mansion selectById(Integer id);

	public List<Mansion> selectByStatusBuildingDate(Mansion mansion);

	public List<Mansion> selectByFloorPlanIdBuildingDateStatus(Mansion mansion);

	public List<Mansion> selectByIdIN(List<Integer> idList);

	public List<Mansion> selectByStationLike(String stationName);

	public List<Mansion> selectByNameStation(Mansion mansion);

	public Boolean insert_01(Mansion mansion);

	public Boolean update_01(Mansion mansion);

	public Mansion selectByIdWithFloorPlan(Integer id);

	public List<Mansion> selectByFloorPlanIdBuildingDate(Mansion mansion);

}
