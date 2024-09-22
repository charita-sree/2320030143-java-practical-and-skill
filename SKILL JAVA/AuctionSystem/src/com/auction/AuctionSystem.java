package com.auction;

public class AuctionSystem {

	public static void main(String[] args) {
		AuctionEvent auction = new AuctionEvent();

        Bidder bidder1 = new ConcreteBidder("Bidder 1");
        Bidder bidder2 = new ConcreteBidder("Bidder 2");

        auction.registerBidder(bidder1);
        auction.registerBidder(bidder2);

        auction.setAuctionStatus("Auction started!");

        AuctionTemplate englishAuction = new EnglishAuction();
        englishAuction.startAuction();

        auction.setAuctionStatus("Auction ended!");
    }


}
