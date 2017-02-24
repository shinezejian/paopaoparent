package com.paopao.shop.order.service;

import com.paopao.shop.order.dao.OrderDetailMapper;
import com.paopao.shop.order.vo.OrderDetailModel;
import com.paopao.shop.order.vo.OrderDetailQueryModel;
import com.paopao.shop.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderDetailService extends BaseService<OrderDetailModel,OrderDetailQueryModel> implements IOrderDetailService{
	private OrderDetailMapper dao = null;
	@Autowired
	private void setDao(OrderDetailMapper dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}