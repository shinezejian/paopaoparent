package com.paopao.shop.store.service;


import com.paopao.shop.service.BaseService;
import com.paopao.shop.store.dao.StoreMapper;
import com.paopao.shop.store.vo.StoreModel;
import com.paopao.shop.store.vo.StoreQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StoreService extends BaseService<StoreModel,StoreQueryModel> implements IStoreService{
	private StoreMapper dao = null;
	@Autowired
	private void setDao(StoreMapper dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public StoreModel getByGoodsUuid(int goodsUuid) {
		return dao.getByGoodsUuid(goodsUuid);
	}
	
}