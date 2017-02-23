package com.paopao.shop.service;
import com.paopao.shop.dao.BaseDAO;
import com.paopao.shop.pageutil.Page;
import com.paopao.shop.vo.BaseModel;

import java.util.List;

public class BaseService<M, QM extends BaseModel> implements IBaseService<M,QM> {
	private BaseDAO dao = null;
	public void setDAO(BaseDAO dao){
		this.dao = dao;
	}
	public void create(M m) {
		dao.create(m);
	}

	public void update(M m) {
		dao.update(m);
	}

	public void delete(int uuid) {
		dao.delete(uuid);
	}

	public M getByUuid(int uuid) {
		return (M)dao.getByUuid(uuid);
	}

	public Page<M> getByConditionPage(QM qm) {
		List list = dao.getByConditionPage(qm);
		qm.getPage().setResult(list);
		
		return qm.getPage();
	}
}
