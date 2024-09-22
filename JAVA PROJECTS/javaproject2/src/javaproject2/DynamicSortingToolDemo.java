package javaproject2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class DynamicSortingToolDemo {
	 static class Item {
	        private String name;
	        private double price;
	        private int quantity;

	        public Item(String name, double price, int quantity) {
	            this.name = name;
	            this.price = price;
	            this.quantity = quantity;
	        }

	        public String getName() {
	            return name;
	        }

	        public double getPrice() {
	            return price;
	        }

	        public int getQuantity() {
	            return quantity;
	        }

	        @Override
	        public String toString() {
	            return "Item{" +
	                    "name='" + name + '\'' +
	                    ", price=" + price +
	                    ", quantity=" + quantity +
	                    '}';
	        }
	    }

	    // Nested class to implement the dynamic sorting tool
	    static class DynamicSortingTool {

	        // Method to sort a list of items based on a given comparator
	        public void sortItems(List<Item> items, Comparator<Item> comparator) {
	            Collections.sort(items, comparator);
	        }
	    }

	    public static void main(String[] args) {
	        // Create a list of items to sort
	        List<Item> items = new ArrayList<>();
	        items.add(new Item("Apple", 1.99, 50));
	        items.add(new Item("Banana", 0.99, 100));
	        items.add(new Item("Cherry", 2.99, 20));
	        items.add(new Item("Date", 3.99, 15));
	        items.add(new Item("Elderberry", 4.99, 10));

	        // Create an instance of the dynamic sorting tool
	        DynamicSortingTool dynamicSortingTool = new DynamicSortingTool();

	        // Sorting by name using a lambda expression
	        System.out.println("Sorting by Name:");
	        dynamicSortingTool.sortItems(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));
	        items.forEach(System.out::println);

	        // Sorting by price using a lambda expression
	        System.out.println("\nSorting by Price:");
	        dynamicSortingTool.sortItems(items, (item1, item2) -> Double.compare(item1.getPrice(), item2.getPrice()));
	        items.forEach(System.out::println);

	        // Sorting by quantity using a lambda expression
	        System.out.println("\nSorting by Quantity:");
	        dynamicSortingTool.sortItems(items, (item1, item2) -> Integer.compare(item1.getQuantity(), item2.getQuantity()));
	        items.forEach(System.out::println);

	        // Sorting by price in descending order using a lambda expression
	        System.out.println("\nSorting by Price Descending:");
	        dynamicSortingTool.sortItems(items, (item1, item2) -> Double.compare(item2.getPrice(), item1.getPrice()));
	        items.forEach(System.out::println);
	    }

}
