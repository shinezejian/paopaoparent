package com.paopao.shop.cartmgr.service;

import com.paopao.shop.cartmgr.dao.CartMapper;
import com.paopao.shop.cartmgr.vo.CartModel;
import com.paopao.shop.cartmgr.vo.CartQueryModel;
import com.paopao.shop.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartService extends BaseService<CartModel,CartQueryModel> implements ICartService{
	private CartMapper dao = null;
	@Autowired
	private void setDao(CartMapper dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}