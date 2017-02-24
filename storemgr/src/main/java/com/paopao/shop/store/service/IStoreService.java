package com.paopao.shop.store.service;


import com.paopao.shop.service.IBaseService;
import com.paopao.shop.store.vo.StoreModel;
import com.paopao.shop.store.vo.StoreQueryModel;

public interface IStoreService extends IBaseService<StoreModel,StoreQueryModel> {
	public StoreModel getByGoodsUuid(int goodsUuid);
}

