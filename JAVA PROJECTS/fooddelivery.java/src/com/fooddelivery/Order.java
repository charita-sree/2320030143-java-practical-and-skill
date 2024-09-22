package com.fooddelivery;

public class Order {
	private String customerName;
    private String restaurantName;
    private String dish;
    private boolean isDelivered;

    public Order(String customerName, String restaurantName, String dish) {
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.isDelivered = false;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getDish() {
        return dish;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void markAsDelivered() {
        this.isDelivered = true;
    }

}
