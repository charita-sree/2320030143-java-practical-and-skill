package com.ridesharing;

public class DigitalWalletFactory implements PaymentFactory{
	  public PaymentMethod createPaymentMethod() {
	        return new DigitalWallet();
	    }

}
