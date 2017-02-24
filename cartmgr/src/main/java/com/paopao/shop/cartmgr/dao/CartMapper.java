package com.paopao.shop.cartmgr.dao;


import com.paopao.shop.cartmgr.vo.CartModel;
import com.paopao.shop.cartmgr.vo.CartQueryModel;
import com.paopao.shop.dao.BaseDAO;
import org.springframework.stereotype.Repository;

@Repository
public interface CartMapper extends BaseDAO<CartModel,CartQueryModel> {
	
}
