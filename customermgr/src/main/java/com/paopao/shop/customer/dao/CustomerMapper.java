package com.paopao.shop.customer.dao;


import com.paopao.shop.customer.vo.CustomerModel;
import com.paopao.shop.customer.vo.CustomerQueryModel;
import com.paopao.shop.dao.BaseDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper extends BaseDAO<CustomerModel,CustomerQueryModel> {
	public CustomerModel getByCustomerId(String customerId);
}
