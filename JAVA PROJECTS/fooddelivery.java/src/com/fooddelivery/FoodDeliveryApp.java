package com.fooddelivery;

public class FoodDeliveryApp {

	public static void main(String[] args) {
		Restaurant restaurant1 = new Restaurant("Pizza Place");
        restaurant1.addDish("Margherita Pizza");
        restaurant1.addDish("Pepperoni Pizza");

        Restaurant restaurant2 = new Restaurant("Sushi Corner");
        restaurant2.addDish("California Roll");
        restaurant2.addDish("Spicy Tuna Roll");

        System.out.println("Menu at " + restaurant1.getName() + ": " + restaurant1.getMenu());
        System.out.println("Menu at " + restaurant2.getName() + ": " + restaurant2.getMenu());

        DeliveryService deliveryService = new DeliveryService();

        Order order1 = new Order("John Doe", restaurant1.getName(), "Margherita Pizza");
        Order order2 = new Order("Jane Smith", restaurant2.getName(), "California Roll");
        deliveryService.placeOrder(order1);
        deliveryService.placeOrder(order2);

        System.out.println("Orders placed:");
        for (Order order : deliveryService.getOrders()) {
            System.out.println("Customer: " + order.getCustomerName() + ", Restaurant: " + order.getRestaurantName() + ", Dish: " + order.getDish() + ", Delivered: " + order.isDelivered());
        }

        deliveryService.markOrderAsDelivered(order1);

        System.out.println("\nOrders after delivery:");
        for (Order order : deliveryService.getOrders()) {
            System.out.println("Customer: " + order.getCustomerName() + ", Restaurant: " + order.getRestaurantName() + ", Dish: " + order.getDish() + ", Delivered: " + order.isDelivered());
        }
    
	}
}
