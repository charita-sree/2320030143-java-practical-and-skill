package com.auction;
import java.util.ArrayList;
import java.util.List;

public class AuctionEvent implements Auction {
	 private List<Bidder> bidders = new ArrayList<>();
	    private String auctionStatus;

	    public void setAuctionStatus(String status) {
	        this.auctionStatus = status;
	        notifyBidders();
	    }

	    @Override
	    public void registerBidder(Bidder bidder) {
	        bidders.add(bidder);
	    }

	    @Override
	    public void removeBidder(Bidder bidder) {
	        bidders.remove(bidder);
	    }

	    @Override
	    public void notifyBidders() {
	        for (Bidder bidder : bidders) {
	            bidder.update(auctionStatus);
	        }
	    }

}
