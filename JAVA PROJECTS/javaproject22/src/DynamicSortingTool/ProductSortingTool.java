package DynamicSortingTool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductSortingTool {
	 public static void main(String[] args) {
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Laptop", 1000.00));
	        products.add(new Product("Smartphone", 800.00));
	        products.add(new Product("Tablet", 400.00));

	        Sorter sorter = new Sorter();

	        // Sorting by price
	        System.out.println("Sorting by price:");
	        sorter.sort(products, sorter.new PriceComparator());
	        products.forEach(System.out::println);

	        // Sorting by name using lambda expression
	        System.out.println("\nSorting by name:");
	        sorter.sort(products, (p1, p2) -> p1.getName().compareTo(p2.getName()));
	        products.forEach(System.out::println);
	    }

	    // Nested Product class
	    static class Product {
	        private String name;
	        private double price;

	        public Product(String name, double price) {
	            this.name = name;
	            this.price = price;
	        }

	        public String getName() {
	            return name;
	        }

	        public double getPrice() {
	            return price;
	        }

	        @Override
	        public String toString() {
	            return name + " ($" + price + ")";
	        }
	    }

	    // Nested Sorter class
	    static class Sorter {

	        // Nested PriceComparator class
	        class PriceComparator implements Comparator<Product> {
	            @Override
	            public int compare(Product p1, Product p2) {
	                return Double.compare(p1.getPrice(), p2.getPrice());
	            }
	        }

	        // Method to sort a list of products
	        public void sort(List<Product> products, Comparator<Product> comparator) {
	            Collections.sort(products, comparator);
	        }
	    }

}
