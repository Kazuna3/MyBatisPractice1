package com.example.MyBatisPractice.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.example.MyBatisPractice.entity.FloorPlan;

//Mapper Interface などのテストをする場合に使用するアノテーションである。
//テスト実施後は、ロールバックされる模様。
@MybatisTest
//次行は、実際のデータベースを使用して、テストする事を表すアノテーションである。
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
// MyBatis の単体テストでは、@AllArgsConstructor, @RequiredArgsConstructor は使えないので、@Autowired を使用すること！
// @AllArgsConstructor
// @RequiredArgsConstructor
public class FloorPlanTest {

	@Autowired
	FloorPlanRepository floorPlanRepository;

	@Test
	public void testSelectById() {

		FloorPlan actual = floorPlanRepository.selectById(2);

		FloorPlan expected = new FloorPlan();
		expected.setId(2);
		expected.setFloorPlanName("1LDK");

		// 実際に取得した値と期待値の比較を行い、テスト結果として評価する。
		Assertions.assertEquals(expected, actual);

	}

	@Test
	public void testInsert_01() {

		FloorPlan expected = new FloorPlan();
		expected.setFloorPlanName("10LDK");

		Boolean result = floorPlanRepository.insert_01(expected);
		Assertions.assertTrue(result);

	}

}
