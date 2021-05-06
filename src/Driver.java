
/**
 * Design a class named Person with fields for holding a person's name, address,
 * and telephone number (all as Strings). Write a constructor that initializes
 * all of these values, and mutator and accessor methods for every field.
 * 
 * Next, design a class named Customer, which inherits from the Person class.
 * The Customer class should have a String field for the customer number and a
 * boolean field indicating whether the customer wishes to be on a mailing list.
 * Write a constructor that initializes these values and the appropriate mutator
 * and accessor methods for the class's fields.
 * 
 * Demonstrate the Customer class in a program that prompts the user to enter
 * values for the customer's name, address, phone number, and customer number,
 * and then asks the user whether or not the customer wants to receive mail. Use
 * this information to create a customer object and then print its information.
 * 
 * Put all of your classes in the same file. To do this, do not declare them
 * public.
 * 
 * Instead, simply write:
 * 
 * class Person { ... } class Customer { ... }
 * 
 * @author Mark Kasule
 *
 */

import java.util.Scanner;

/**
 * This class represents details of person
 * 
 * @author casul
 *
 */
class Person {

	private String name; // name of customer
	private String address; // address
	private String phoneNumber; // phone number

	public Person() {
		this.setName(name);
		this.setAddress(address);
		this.setNumber(phoneNumber);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return phoneNumber;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.phoneNumber = number;
	}

}

/**
 * Thsi class represents customer's number and wish to join mailing list
 * 
 * @author Mark Kasule
 *
 */
class Customer extends Person {

	private String number; // customer number
	private boolean mailingList; // customer wish

	/**
	 * 
	 * @param number
	 * @param mailingList
	 */
	public Customer(String number, boolean mailingList) {
		super();
		this.number = number;
		this.mailingList = mailingList;
	}

	/**
	 * 
	 * @param customerNumber
	 */
	public void setCustNumber(String customerNumber) {
		number = customerNumber;
	}

	/**
	 * 
	 * @return customer number
	 */
	public String getCustNumber() {
		return number;
	}

	/**
	 * set the wish
	 * 
	 * @param response
	 */
	public void setWish(String response) {
		if (response.equals("yes")) {
			mailingList = true;
		} else {
			mailingList = false;
		}

	}

	/**
	 * 
	 * @return wish
	 */
	public boolean getWish() {
		return mailingList;
	}

	/**
	 * print the details
	 */
	public String toString() {
		String str = "Name:" + super.getName() + "\n" + "Address: " + super.getAddress() + "\n" + "Phone Number: "
				+ super.getNumber() + "\n" + "Customer Number: " + getCustNumber() + "\n" + "Receive Mail: " + getWish()
				+ "\n";
		return str;
	}

}

/**
 * this class asks the details of a customer and prints them out
 * 
 * @author Mark Kasule
 *
 */
public class Driver {

	public static void main(String[] args) {

		boolean wish;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter name of customer: ");
		String name = input.nextLine();

		System.out.print("Enter address of customer: ");
		String address = input.nextLine();

		System.out.print("Enter phone number of the customer: ");
		String phone = input.next();

		System.out.print("Enter customer number:");
		String customerNumber = input.next();

		System.out.print("Enter yes/no -- Does the customer want to recieve mail?: ");
		String response = input.next();

		if (response.equals("yes")) {
			wish = true;
		} else {
			wish = false;
		}

		// create a new customer object
		Customer newCustomer = new Customer(customerNumber, wish);
		// set values customer details
		newCustomer.setName(name);
		newCustomer.setAddress(address);
		newCustomer.setNumber(customerNumber);

		// print results
		System.out.println("Customer: ");
		System.out.println(newCustomer);

	}

}
