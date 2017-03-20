package com.bakeitstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.bakeitstore.items.entity.Cake;


public class ItemDetailsDAO implements IBaseDAO{
	
	List cakesList;
	List vegCakesList;
	List nonVegCakesList;
	
	public List getAllCakes(){
		//TODO - get all the cakes - combine veg cakes and non veg cakes lists
		//TODO - for the time being create a dummy cakes
		// and send.
		//TODO - fetch the data from db after tables are created.
		cakesList = new ArrayList();;
		Cake chocolateCake = new Cake(new Integer(1), "Chocolate Cake",
				"Chocolate", new Double(1.0), "Square", "Vegetarian",
				Boolean.TRUE);
		Cake vanillaCake = new Cake(new Integer(1), "Vanilla Cake",
				"Vanilla", new Double(2.0), "Square", "Vegetarian",
				Boolean.TRUE);
		Cake strawberryCake = new Cake(new Integer(1), "Strawberry Cake",
				"Strawberry", new Double(3.0), "Square", "Vegetarian",
				Boolean.TRUE);
		Cake pineappleCake = new Cake(new Integer(1), "Pineapple Cake",
				"Pineapple", new Double(4.0), "Square", "Vegetarian",
				Boolean.TRUE);
		Cake blackForest = new Cake(new Integer(1), "Black Forest Cake",
				"Chocolate", new Double(5.0), "Square", "Vegetarian",
				Boolean.TRUE);
		Cake whiteForest = new Cake(new Integer(1), "White Forest Cake",
				"White Chocolate", new Double(6.0), "Square", "Vegetarian",
				Boolean.TRUE);
		cakesList.add(chocolateCake);
		cakesList.add(vanillaCake);
		cakesList.add(strawberryCake);
		cakesList.add(pineappleCake);
		cakesList.add(blackForest);
		cakesList.add(whiteForest);
		return cakesList;
	}
	
	public List getVegCakesList(){
		//TODO - get veg cakes
		return null;
	}
	
	public List getNonVegCakesList(){
		//TODO - get non veg cakes
		return null;
	}
	
	public List getAllPuffs(){
		//TODO - get all the puffs - combine veg cakes and non veg cakes lists
		return null;
	}
	
	public List getVegPuffsList(){
		//TODO - get veg puffs
		return null;
	}
	
	public List getNonVegPuffsList(){
		//TODO - get non veg puffs
		return null;
	}
	
}
