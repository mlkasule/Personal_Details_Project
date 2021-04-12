import java.util.Scanner;

class Person {

	private String name;
	private String address;
	private String phoneNumber;

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

class Customer extends Person {

	private String number;
	private boolean mailingList;

	public Customer(String number, boolean mailingList) {
		super();
		this.number = number;
		this.mailingList = mailingList;
	}
	 public void setCustNumber(String customerNumber) 
	 {
		 number = customerNumber;
	 }
	
	public String getCustNumber() {
		return number;
	}

	public void setWish(String response) {
		if (response.equals("yes")) {
			mailingList = true;
		} else {
			mailingList = false;
		}

	}

	public boolean getWish() {
		return mailingList;
	}

	public String toString() {
		String str = "Name:" + super.getName() + "\n" + "Address: " + super.getAddress() + "\n" + "Phone Number: "
				+ super.getNumber() + "\n" 
				+ "Customer Number: " + getCustNumber() + "\n"
				+ "Receive Mail: " + getWish() + "\n";
		return str;
	}

}

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
		
		if(response.equals("yes")) 
		{
			wish = true;
		}else {
			wish = false;
		}
		
		Customer newCustomer = new Customer(customerNumber, wish);
		//set values customer details
		newCustomer.setName(name);
		newCustomer.setAddress(address);
		newCustomer.setNumber(customerNumber);
		
		System.out.println("Customer: ");
		System.out.println(newCustomer);
		
		
		
		
		
		
		
		
		
		
		

	}

}
