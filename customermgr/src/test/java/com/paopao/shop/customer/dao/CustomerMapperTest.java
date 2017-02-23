package com.paopao.shop.customer.dao;

import com.paopao.shop.customer.service.CustomerService;
import com.paopao.shop.customer.vo.CustomerQueryModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by wuzejian on 2017/2/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerMapperTest {

    @Autowired
    CustomerMapper mapper;
    @Autowired
    CustomerService customerService;

    @Test
    public void testGetByCustomerId() throws Exception {
        CustomerQueryModel qm=new CustomerQueryModel();
        customerService.getByConditionPage(qm);
    }
}