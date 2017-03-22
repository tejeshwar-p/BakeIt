package com.bakeitstore.items.service;

import java.util.List;

import com.bakeitstore.dao.IBaseDAO;
import com.bakeitstore.items.entity.Cake;

public class ItemDetailsService {
	
	private IBaseDAO itemDetailsDAO;
	
	public void setItemDetailsDAO(IBaseDAO itemDetailsDAO) {
		this.itemDetailsDAO = itemDetailsDAO;
	}

	public List<Cake> getAllCakes(){
		return itemDetailsDAO.getAllCakes();
	}
	
}
