package com.paopao.shop.order.service;


import com.paopao.shop.order.vo.OrderModel;
import com.paopao.shop.order.vo.OrderQueryModel;
import com.paopao.shop.service.IBaseService;

public interface IOrderService extends IBaseService<OrderModel,OrderQueryModel> {
	public void order(int customerUuid);
}

