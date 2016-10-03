package com.techelevator.product;

import com.techelevator.product.Product;

public class ProductTest {

	public static void main(String[] args) {
		
        boolean allTestsPassed = true;

        Product product = new Product();
        
        product.setName("Whatchamacallit");
        String name = product.getName();
		if (!name.equals("Whatchamacallit")) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned ame should be 'Whatchamacallit' but it was "+name);
		}

        product.setPrice(99.99);
        double price = product.getPrice();
		if (price != 99.99) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned price should be 99.99 but it was "+price);
		}

		product.setWeightInOunces(1.25);
		double weightInOunces = product.getWeightInOunces();
		if (weightInOunces != 1.25) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned weight in ouces should be 1.25' but it was "+weightInOunces);
		}
		
        if (allTestsPassed) {
            System.out.println("All tests PASSED!");
        }
		
	}

}
