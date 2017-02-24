package com.paopao.shop.store.dao;


import com.paopao.shop.dao.BaseDAO;
import com.paopao.shop.store.vo.StoreModel;
import com.paopao.shop.store.vo.StoreQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreMapper extends BaseDAO<StoreModel,StoreQueryModel> {
	StoreModel getByGoodsUuid(int goodsUuid);
}
