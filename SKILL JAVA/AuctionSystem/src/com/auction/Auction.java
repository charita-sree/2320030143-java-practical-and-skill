package com.auction;

public interface Auction {
	   void registerBidder(Bidder bidder);
	    void removeBidder(Bidder bidder);
	    void notifyBidders();

}
