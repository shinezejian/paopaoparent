package com.paopao.shop.customer.service;


import com.paopao.shop.customer.vo.CustomerModel;
import com.paopao.shop.customer.vo.CustomerQueryModel;
import com.paopao.shop.service.IBaseService;

public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel> {
	public CustomerModel getByCustomerId(String customerId);
}
