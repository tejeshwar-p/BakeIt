package com.bakeitstore.items.service;

import java.util.List;

import com.bakeitstore.dao.IBaseDAO;

public class ItemDetailsService {
	
	private IBaseDAO itemDetailsDAO;
	
	public void setItemDetailsDAO(IBaseDAO itemDetailsDAO) {
		this.itemDetailsDAO = itemDetailsDAO;
	}

	public List getAllCakes(){
		return itemDetailsDAO.getAllCakes();
	}
	
}
