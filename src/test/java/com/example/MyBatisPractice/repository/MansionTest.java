package com.example.MyBatisPractice.repository;

import java.sql.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.example.MyBatisPractice.entity.Mansion;

// Mapper Interface などのテストをする場合に使用するアノテーションである。
// テスト実施後は、ロールバックされる模様。
@MybatisTest
// 次行は、実際のデータベースを使用して、テストする事を表すアノテーションである。
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MansionTest {

	@Autowired
	MansionRepository mansionRepository;

	@Test
	void test() {

		Mansion actual = mansionRepository.selectById(2);

		// 次行以降に、取得されるであろうデータの期待値を実装する。
		Mansion expected = new Mansion();
		expected.setId(2);
		expected.setName("サンシャインレジデンス");
		expected.setAddress("大阪府大阪市中央区難波1-2-3");
		expected.setBuildingDate(Date.valueOf("2010-05-01"));
		expected.setStatus(true);
		expected.setFloorPlanId(1);
		expected.setStation("難波駅");

		// 実際に取得した値と期待値の比較を行い、テスト結果として評価する。
		Assertions.assertEquals(expected, actual);

	}

	@Test
	public void testInsert_01() {

		Mansion expected = new Mansion();
		expected.setName("トゥモローランド");
		expected.setAddress("大阪府大阪市北区中之島123");
		expected.setBuildingDate(Date.valueOf("2023-05-01"));
		expected.setStatus(true);
		expected.setFloorPlanId(1);
		expected.setStation("淀屋橋駅");
		Boolean result = mansionRepository.insert_01(expected);
		Assertions.assertTrue(result);

	}

}
