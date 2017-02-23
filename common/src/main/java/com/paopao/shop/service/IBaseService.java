package com.paopao.shop.service;


import com.paopao.shop.pageutil.Page;
import com.paopao.shop.vo.BaseModel;

public interface IBaseService<M,QM extends BaseModel> {
	public void create(M m);
	public void update(M m);
	public void delete(int uuid);
	
	public M getByUuid(int uuid);
	public Page<M> getByConditionPage(QM qm);
}
