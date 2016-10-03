package com.techelevator.company;

import com.techelevator.company.Company;

public class CompanyTest {

	public static void main(String[] args) {
		
		
		boolean allTestsPassed = true;
		
		/*** Result is initialized to zero by the no-arg constructor ***/
		Company company = new Company();
		
		company.setName("Acme");
		String name = company.getName();
		if (! name.equals("Acme")) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned name should be 'Acme' but it was "+name);
		}

		company.setNumberOfEmployees(123);
		int numberOfEmployees = company.getNumberOfEmployees();
		if (numberOfEmployees != 123) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned number of employees should be 123 but it was "+numberOfEmployees);
		}

		company.setRevenue(123456789);
		int revenue = company.getRevenue();
		if (revenue != 123456789) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned revenue should be 123456789 but it was "+revenue);
		}
		
		company.setExpenses(12345678);
		int expense = company.getExpenses();
		if (expense != 12345678) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned expense should be 12345678 but it was "+expense);
		}
		
		int profit = company.getProfit();
		if (profit != 111111111) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned profit should be 111111111 but it was "+profit);
		}
		
		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}

	}

}
