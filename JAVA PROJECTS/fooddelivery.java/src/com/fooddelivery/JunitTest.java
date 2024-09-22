package com.fooddelivery;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

class JunitTest {

	private User user1;
    private User user2;
    private Restaurant restaurant1;
    private Restaurant restaurant2;
    private DeliveryService deliveryService;

   
    public void setUp() {
        // Initialize objects before each test
        user1 = new User("John Doe");
        user2 = new User("Jane Smith");

        restaurant1 = new Restaurant("Pizza Place");
        restaurant1.addDish("Margherita Pizza");
        restaurant1.addDish("Pepperoni Pizza");

        restaurant2 = new Restaurant("Sushi Corner");
        restaurant2.addDish("California Roll");
        restaurant2.addDish("Spicy Tuna Roll");

        deliveryService = new DeliveryService();
    }

    public void testUserPlaceOrder() {
        Order order = new Order(user1, restaurant1, "Margherita Pizza");
        user1.placeOrder(order);
        List<Order> orders = user1.getOrders();
        assertTrue(orders.contains(order));
    }

    
    public void testGetUsername() {
        assertEquals("Jane Smith", user2.getUsername());
    }

  
    public void testAddDishToRestaurant() {
        List<String> menu = restaurant1.getMenu();
        assertTrue(menu.contains("Margherita Pizza"));
        assertTrue(menu.contains("Pepperoni Pizza"));
    }

  
    public void testOrderDetails() {
        Order order = new Order(user2, restaurant2, "California Roll");
        assertEquals(user2, order.getUser());
        assertEquals(restaurant2, order.getRestaurant());
        assertEquals("California Roll", order.getDish());
        assertFalse(order.isDelivered());
    }

   
    public void testMarkOrderAsDelivered() {
        Order order = new Order(user2, restaurant2, "California Roll");
        deliveryService.placeOrder(order);
        deliveryService.markOrderAsDelivered(order);
        assertTrue(order.isDelivered());
    }

   
    public void testPlaceOrderInDeliveryService() {
        Order order = new Order(user1, restaurant1, "Margherita Pizza");
        deliveryService.placeOrder(order);
        List<Order> orders = deliveryService.getOrders();
        assertTrue(orders.contains(order));
    }

  
    public void testOrderStatusAfterDelivery() {
        Order order = new Order(user1, restaurant1, "Margherita Pizza");
        deliveryService.placeOrder(order);
        deliveryService.markOrderAsDelivered(order);
        List<Order> orders = deliveryService.getOrders();
        for (Order o : orders) {
            if (o.getDish().equals("Margherita Pizza")) {
                assertTrue(o.isDelivered());
            }
        }
    }

}
