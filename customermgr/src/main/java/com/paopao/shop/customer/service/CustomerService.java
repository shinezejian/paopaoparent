package com.paopao.shop.customer.service;

import com.paopao.shop.customer.dao.CustomerMapper;
import com.paopao.shop.customer.vo.CustomerModel;
import com.paopao.shop.customer.vo.CustomerQueryModel;
import com.paopao.shop.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService{
	private CustomerMapper dao = null;

	@Autowired
	private void setDao(CustomerMapper dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public CustomerModel getByCustomerId(String customerId) {
		return dao.getByCustomerId(customerId);
	}
	
}
