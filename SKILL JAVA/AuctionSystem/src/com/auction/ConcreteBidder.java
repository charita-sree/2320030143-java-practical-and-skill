package com.auction;

public class ConcreteBidder implements Bidder{
	  private String name;

	    public ConcreteBidder(String name) {
	        this.name = name;
	    }

	    @Override
	    public void update(String message) {
	        System.out.println(name + " received update: " + message);
	    }

}
