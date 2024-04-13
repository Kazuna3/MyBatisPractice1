package com.example.MyBatisPractice;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.MyBatisPractice.entity.FloorPlan;
import com.example.MyBatisPractice.entity.Mansion;
import com.example.MyBatisPractice.repository.FloorPlanRepository;
import com.example.MyBatisPractice.repository.MansionRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
// @MapperScan は、MyBatis の Mapper Repository の Interface が
// 配置されているパス（FQCN）を引数に書くことで、Mapper Repository の
// インターフェースを実装し、インジェクションしてもらえるようになる。
// このアノテーションを使わない場合は、Mapper Repository の Interface に、
// @Mapper アノテーションを付与する必要が生じる。
@MapperScan("com.example.MyBatisPractice.repository")
@AllArgsConstructor // Lombokのアノテーション。全フィールドに値をセットするコンストラクタを自動生成する。
public class MyBatisPractice1Application {

	// @Autowired フィールドインジェクションは可能な限り不使用とする。
	private final MansionRepository mansionRepository;
	private final FloorPlanRepository floorPlanRepository;

	public static void main(String[] args) {

		// SpringApplication.run(MyBatisPractice1Application.class, args);

		ApplicationContext context = SpringApplication.run(MyBatisPractice1Application.class, args);
		MyBatisPractice1Application app = context.getBean(MyBatisPractice1Application.class);

		app.execute();

	}

	private void execute() {

		executeSection4_12();
		executeSection5_15();
		executeSection6_16_1();
		executeSection6_16_2();
		executeSection6_17_1();
		executeSection6_17_2();
		executeSection6_17_3();
		executeSection6_17_4();
		executeSection6_18();
		executeSection6_19();
		executeSection6_20();
		// 次行は、レコードが追加されるのでコメントアウトしている。
		// executeSection7_21();
		executeSection7_22();
		executeSection8_23();
		executeSection8_24();

	}

	private void executeSection4_12() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection4_12()");
		List<Mansion> list = mansionRepository.selectAll();
		list.forEach(mansion -> System.out.println(
				"id［" + mansion.getId() + "］, " +
						"name［" + mansion.getName() + "］, " +
						"address［" + mansion.getAddress() + "］, " +
						"station［" + mansion.getStation() + "］, " +
						"floorPlanId［" + mansion.getFloorPlanId() + "］, " +
						"buildingDate［" + mansion.getBuildingDate() + "］, " +
						"status［" + mansion.getStatus() + "］, " +
						"floorPlan［" + mansion.getFloorPlan() + "］"));
		// System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection4_12()");

	}

	private void executeSection5_15() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection5_15()");
		Mansion mansion = mansionRepository.selectById(1);
		System.out.println(
				"id［" + mansion.getId() + "］, " +
						"name［" + mansion.getName() + "］, " +
						"address［" + mansion.getAddress() + "］, " +
						"station［" + mansion.getStation() + "］, " +
						"floorPlanId［" + mansion.getFloorPlanId() + "］, " +
						"buildingDate［" + mansion.getBuildingDate() + "］, " +
						"status［" + mansion.getStatus() + "］, " +
						"floorPlan［" + mansion.getFloorPlan() + "］");
		// System.out.println(mansion);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection5_15()");

	}

	private void executeSection6_16_1() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_16_1()");
		Mansion mansion = new Mansion();
		mansion.setStatus(true);
		List<Mansion> list = mansionRepository.selectByStatusBuildingDate(mansion);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_16_1()");

	}

	private void executeSection6_16_2() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_16_2()");
		Mansion mansion = new Mansion();
		mansion.setStatus(true);
		mansion.setBuildingDate(Date.valueOf("2010-05-01"));
		List<Mansion> list = mansionRepository.selectByStatusBuildingDate(mansion);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_16_2()");

	}

	private void executeSection6_17_1() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_1()");
		Mansion mansion = new Mansion();
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_1()");

	}

	private void executeSection6_17_2() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_2()");
		Mansion mansion = new Mansion();
		mansion.setFloorPlanId(1);
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_2()");

	}

	private void executeSection6_17_3() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_3()");
		Mansion mansion = new Mansion();
		mansion.setBuildingDate(Date.valueOf("2010-01-01"));
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_3()");

	}

	private void executeSection6_17_4() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_17_4()");
		Mansion mansion = new Mansion();
		mansion.setFloorPlanId(1);
		mansion.setBuildingDate(Date.valueOf("2010-01-01"));
		List<Mansion> list = mansionRepository.selectByFloorPlanIdBuildingDateStatus(mansion);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_17_4()");

	}

	private void executeSection6_18() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_18()");
		List<Integer> idList = Arrays.asList(1, 2, 4);
		List<Mansion> list = mansionRepository.selectByIdIN(idList);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_18()");

	}

	private void executeSection6_19() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_19");
		List<Mansion> list = mansionRepository.selectByStationLike("宮");
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_19");

	}

	private void executeSection6_20() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection6_20()");
		Mansion mansion = new Mansion();
		mansion.setName("ローズガーデンハイツ");
		mansion.setStation("大井町駅");
		List<Mansion> list = mansionRepository.selectByNameStation(mansion);
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection6_20()");

	}

	// 本メソッドは、レコードを追加するので、呼び出し側をコメントアウトしている。
	@SuppressWarnings("unused")
	private void executeSection7_21() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection7_21()");
		Mansion mansion = new Mansion();
		mansion.setName("サニーハイツ");
		mansion.setAddress("東京都品川区東大井×××");
		mansion.setStation("大井町駅");
		mansion.setFloorPlanId(1);
		mansion.setBuildingDate(Date.valueOf("2023-04-01"));
		mansion.setStatus(true);
		Boolean isSuccess = mansionRepository.insert_01(mansion);
		System.out.println("executeSection7_21() 処理が成功した？：" + isSuccess);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection7_21()");

	}

	private void executeSection7_22() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection7_22()");
		Mansion mansion = new Mansion();
		mansion.setId(10);
		mansion.setName("GreenHills");
		mansion.setAddress("東京都渋谷区渋谷111");
		mansion.setStation("ＪＲ渋谷駅");

		// ※次の3行分のデータは、MansionRepository.xml の set タグに記載されていないので、反映されない。
		// mansion.setFloorPlanId(2);
		// mansion.setBuildingDate(Date.valueOf("2000-01-01"));
		// mansion.setStatus(false);
		Boolean isSuccess = mansionRepository.update_01(mansion);
		System.out.println("executeSection7_22() 処理が成功した？：" + isSuccess);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection7_22()");

	}

	private void executeSection8_23() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection8_23()");
		//List<FloorPlan> result = floorPlanRepository.selectByFloorPlanIdWithMansion(2);
		List<FloorPlan> result = floorPlanRepository.selectByFloorPlanIdWithMansion(4);
		System.out.println("result：" + result);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection8_23()");

	}

	private void executeSection8_24() {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> executeSection8_24()");
		Mansion result = mansionRepository.selectByIdWithFloorPlan(2);
		System.out.println("result：" + result);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< executeSection8_24()");

	}

}
