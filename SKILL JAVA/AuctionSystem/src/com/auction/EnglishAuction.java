package com.auction;

public class EnglishAuction extends AuctionTemplate{
	 protected void conductBidding() {
	        System.out.println("Conducting bidding in an English Auction.");
	    }

	    @Override
	    protected void determineWinner() {
	        System.out.println("Determining winner in an English Auction.");
	    }

}
