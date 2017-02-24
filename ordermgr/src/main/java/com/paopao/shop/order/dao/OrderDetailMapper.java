package com.paopao.shop.order.dao;

import com.paopao.shop.dao.BaseDAO;
import com.paopao.shop.order.vo.OrderDetailModel;
import com.paopao.shop.order.vo.OrderDetailQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailMapper extends BaseDAO<OrderDetailModel,OrderDetailQueryModel> {
	
}
