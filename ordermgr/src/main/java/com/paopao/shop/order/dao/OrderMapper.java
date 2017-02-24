package com.paopao.shop.order.dao;


import com.paopao.shop.dao.BaseDAO;
import com.paopao.shop.order.vo.OrderModel;
import com.paopao.shop.order.vo.OrderQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends BaseDAO<OrderModel,OrderQueryModel> {
	
}
