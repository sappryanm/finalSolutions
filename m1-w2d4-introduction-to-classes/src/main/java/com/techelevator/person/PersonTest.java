package com.techelevator.person;

public class PersonTest {

	public static void main(String[] args) {
		
        boolean allTestsPassed = true;

        Person person = new Person();
        
        person.setFirstName("Bill");
        String firstName = person.getFirstName();
		if (!firstName.equals("Bill")) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned firstName should be 'Bill' but it was "+firstName);
		}

        person.setLastName("Gates");
        String lastName = person.getLastName();
		if (!lastName.equals("Gates")) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned lastName should be 'Gates' but it was "+lastName);
		}

		String fullName = person.getFullName();
		if (!fullName.equals("Bill Gates")) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned fullName should be 'Bill Gates' but it was "+fullName);
		}
		
		person.setAge(101);
		int age = person.getAge();
		if (age != 101) {
			allTestsPassed = false;
			System.out.println("Test FAILED: The returned age should be 101 but it was "+age);
		}
		
		if (!person.isAdult()) {
			allTestsPassed = false;
			System.out.println("Test FAILED: Person should be an adult but it is not.");
		}
		
        if (allTestsPassed) {
            System.out.println("All tests PASSED!");
        }
		
	}

}
