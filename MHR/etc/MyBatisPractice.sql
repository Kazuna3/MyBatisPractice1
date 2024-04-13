DROP TABLE IF EXISTS mansion;
DROP TABLE IF EXISTS floor_plan;

CREATE TABLE floor_plan
(
   id serial PRIMARY KEY,
   floor_plan_name VARCHAR (100)
);

CREATE TABLE mansion
(
   id serial PRIMARY KEY,
   name VARCHAR (100),
   address VARCHAR (100),
   station VARCHAR (100),
   floor_plan_id INTEGER,
   building_date DATE,
   status boolean,
   foreign key (floor_plan_id) references floor_plan (idid)
);

insert into floor_plan(floor_plan_name) values('1K');
insert into floor_plan(floor_plan_name) values('1LDK');
insert into floor_plan(floor_plan_name) values('2DK');
insert into floor_plan(floor_plan_name) values('2LDK');
insert into floor_plan(floor_plan_name) values('3LDK');

insert into mansion (name,address,station,floor_plan_id,building_date,status)values('グリーンヒルズ','東京都渋谷区渋谷1-1-1','渋谷駅','4','2010/5/1','true');
insert into mansion (name,address,station,floor_plan_id,building_date,status)values('サンシャインレジデンス','大阪府大阪市中央区難波1-2-3','難波駅','1','2010/5/1','true');
insert into mansion (name,address,station,floor_plan_id,building_date,status)values('レインボーハイツ','神奈川県中郡二宮町二宮961','二宮駅','5','2008/12/1','true');
insert into mansion (name,address,station,floor_plan_id,building_date,status)values('パークサイド','神奈川県横浜市西区南1-4-5','西横浜駅','2','2012/7/1','true');
insert into mansion (name,address,station,floor_plan_id,building_date,status)values('ローズガーデンハイツ','東京都品川区大井1-5-6','大井町駅','3','2005/3/1','true');
insert into mansion (name,address,station,floor_plan_id,building_date,status)values('グランドパレス','福岡県福岡市博多区博多1-6-7','博多駅','5','2011/11/1','true');
insert into mansion (name,address,station,floor_plan_id,building_date,status)values('ブルーリバー','愛知県名古屋市中村区名駅2-7-8','名古屋駅','1','2007/6/1','true');
insert into mansion (name,address,station,floor_plan_id,building_date,status)values('グレースパレス','兵庫県神戸市中央区三宮4-8-9','三宮駅','4','2013/4/1','false');