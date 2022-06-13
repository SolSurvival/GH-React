package phoneBook;

public class Person {
	private long phoneNum;
	private String firstName;
	private String lastName;
	private Address myAddress;
	private String middleName;
	
	//sets the address for the person
	public void addAddress(int streetNum, String streetName, String city, String state, String zipCode) {
		Address tempAddress = new Address(streetNum, streetName, city, state, zipCode);
		myAddress = tempAddress;
	}
	
public Person() {
	
}
	
	public Address getAddress() {
		return this.myAddress;
	}
	
	//sets parameters for the new person
	public Person(String firstName, String lastName, String middleName, long number) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = number;
		this.middleName = middleName;
	}
	//returns the persons info
	public void getPerson() {
		if(middleName.length() != 0) {
			System.out.println(firstName + " " + middleName + " " + lastName);
		}
		else {
			System.out.println(firstName + " " + lastName);
		}
		myAddress.printAddress();
		System.out.println("Phone Number: " + formatPhone(phoneNum));
		System.out.println("---------------------------");
	}
	
	public long getPhone() {
		return phoneNum;
	}
	
	public void setPhone(long newNum) {
		phoneNum = newNum;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String newMiddleName) {
		this.middleName = newMiddleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String getMyCity() {
		return myAddress.getCity();
	}
	
	public String getMyState() {
		return myAddress.getState();
	}
	//formats the phone number and returns it as a string
	public String formatPhone(long phone) {
		String newPhone = Long.toString(phone);
		String formattedPhone = "(" + newPhone.substring(0, 3) + ")" + newPhone.substring(3, 6) + "-" + newPhone.substring(6);
		
		return formattedPhone;
	}

}
