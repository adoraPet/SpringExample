package io.adorapet.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.adorapet.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {
	
	// used_goods 테이블 데이터 조회 리턴 
	public List<UsedGoods> selectUsedGoodsList();
}
