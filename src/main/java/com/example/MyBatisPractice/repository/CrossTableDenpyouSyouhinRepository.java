package com.example.MyBatisPractice.repository;

import java.util.List;

import com.example.MyBatisPractice.entity.CrossTableDenpyouSyouhin;

//Mapper Interface
//@MapperScan を書かない場合は、Mapper Repository のクラスに @Mapper アノテーションを付ける必要がある。
//@Mapper
public interface CrossTableDenpyouSyouhinRepository {

	public List<CrossTableDenpyouSyouhin> selectByDenpyouId(Integer id);

}
