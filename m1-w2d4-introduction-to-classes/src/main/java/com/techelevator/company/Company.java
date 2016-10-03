package com.techelevator.company;

public class Company {

	/*
	 
	 The Company class has the following properties
		name
		numberOfEmployees
		revenue
		expenses
	 	companySize * 
	 	profit **	 

	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * companySize is derived (i.e. calculated), and does not need a setter. A company is "small" if less than 50 employees,
	  	"medium" if between 51 and 250 employees, "large" if greater than 250 employees.
	  	
	 ** profit is derived (i.e. calculated), and does not need a setter. Profit equals revenue minus expenses.
	 
	 */

    private String name;
    private int numberOfEmployees;
    private int revenue;
    private int expenses;

	//
	// Write your code below
	//
    public Company() {

    }
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }

    public int getNumberOfEmployees() {
    	return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getRevenue() {
    	return revenue;
    }
    public void setRevenue(int revenue) {
    	this.revenue = revenue;
    }

    public int getExpenses() {
    	return expenses;
    }
    public void setExpenses(int expenses) {
    	this.expenses = expenses;
    }

    public String getCompanySize() {
        if (numberOfEmployees < 50) {
            return "small";
        }
        else if (numberOfEmployees > 50 && numberOfEmployees <= 250) {
            return "medium";
        }
        else {
            return "large";
        }
    }

    public int getProfit() {
    	return revenue - expenses;
    }

}
