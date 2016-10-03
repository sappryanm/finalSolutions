package com.techelevator.product;

public class Product {

	/*
	 
	 The Product class has the following properties
	 	name
	 	price
	 	weightInOunces
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in ProductTest.java to verify the functionality of the Product class.  
	 (Please see notes in ProductTest.java for further instructions.)
	 
	 */

    private String name;
    private double price;
    private double weightInOunces;

    public Product() {

    }

    public String getName() {
        return name; 
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeightInOunces() {
        return weightInOunces; 
    }
    
    public void setWeightInOunces(double weightInOunces) {
        this.weightInOunces = weightInOunces;
    }
	
}
