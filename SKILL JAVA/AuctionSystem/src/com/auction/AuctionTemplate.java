package com.auction;

public abstract class AuctionTemplate {
	 public final void startAuction() {
	        announceAuction();
	        conductBidding();
	        determineWinner();
	    }

	    protected abstract void conductBidding();
	    protected abstract void determineWinner();

	    private void announceAuction() {
	        System.out.println("Auction has started.");
	    }

}
