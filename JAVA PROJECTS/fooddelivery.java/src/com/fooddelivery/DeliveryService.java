package com.fooddelivery;
import java.util.ArrayList;
import java.util.List;


public class DeliveryService {
	 private List<Order> orders;

	    public DeliveryService() {
	        this.orders = new ArrayList<>();
	    }

	    public void placeOrder(Order order) {
	        orders.add(order);
	    }

	    public void markOrderAsDelivered(Order order) {
	        order.markAsDelivered();
	    }

	    public List<Order> getOrders() {
	        return orders;
	    }

}
