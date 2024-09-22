package com.ridesharing;

public class CreditFactory implements PaymentFactory{
	public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }

}
