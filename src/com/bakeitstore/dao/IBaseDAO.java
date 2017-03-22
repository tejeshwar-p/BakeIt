package com.bakeitstore.dao;

import java.util.List;

import com.bakeitstore.items.entity.Cake;

public interface IBaseDAO {
	public List<Cake> getAllCakes();
}
