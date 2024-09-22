package com.fooddelivery;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	  private String name;
	    private List<String> menu;

	    public Restaurant(String name) {
	        this.name = name;
	        this.menu = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public void addDish(String dish) {
	        menu.add(dish);
	    }

	    public List<String> getMenu() {
	        return menu;
	    }

}
