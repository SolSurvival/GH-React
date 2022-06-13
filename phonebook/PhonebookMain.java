package phonebook;

import java.util.*;

import java.io.File;

public class PhonebookMain {
	

	
	
	public static Directory directory = new Directory();
	
	public static void main(String[] args) {
		Person p1 = new Person("Mark", "Larson", "Timothy", 183432323L);
		p1.addAddress(123, "Mockingbird Lane", "Atlanta", "GA", "66445" );
		
		directory.addPerson(p1);

		menu();
		
	}

	public static void menu() {
		try {
			try (//Menu display and establish Scanner
			Scanner input = new Scanner(System.in)) {
				System.out.println("Welcome to the Phonebook!");
				System.out.println("Enter a number corresponding to the options below to begin: ");
				System.out.println("1. Add new entry");
				System.out.println("2. Search for an existing entry");
				System.out.println("3. Delete a record for a given telephone number");
				System.out.println("4. Update a record for a given telephone number");
				System.out.println("5. Show all records");
				System.out.println("6. Quit Program");
//Scanner input from user
				int item = input.nextInt();

				if (item > 0) {
//Menu Choices
					switch (item) {
					case 1:
						addNewEntry();
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						printDirectory();
						break;
					case 6:
						System.out.println("Goodbye");
						System.exit(0);
						break;
					}
				} else {
					System.out.println("Please enter a VALID number.");
				}
			}
		} catch (Exception e) {
			System.out.println("That was an invalid entry. Try again.");
			menu();
		}

	}

	public static void menuTwo() {
		try {
			try (//Menu display and establish Scanner
			Scanner input = new Scanner(System.in)) {
				System.out.println("Welcome to the Phonebook!");
				System.out.println("Enter a number corresponding to the options below to begin: ");
				System.out.println("1. Search by first name");
				System.out.println("2. Search by last name");
				System.out.println("3. Search by full name");
				System.out.println("4. Search by telephone number");
				System.out.println("5. Search by city or state");
				System.out.println("6. Go back to main menu");
//Scanner input from user
				int item = input.nextInt();

				if (item > 0) {
//Menu Choices
					switch (item) {
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						
						break;
					case 5:
						
						break;
					case 6:
						menu();
						break;
					}
				} else {
					System.out.println("Please enter a VALID choice.");
				}
			}
		} catch (Exception e) {
			System.out.println("That was an invalid entry. Try again.");
			menuTwo();
		}

	}
	
	public static void addNewEntry() {
		
		Scanner input = new Scanner(System.in);
		
		Directory primary = new Directory();
		
		System.out.println("Please enter new entry below: ");
		System.out.println("(SEE FORMAT---> Name, Street Address, City, State Initials, "
						+ "Zipcode, Phone Number");
		
		String info = input.nextLine();
		
		// separate info into an array of strings
		String[] tempInfo = info.split(", ");
		
		// set variables for each index
		String name = tempInfo[0];
		String street = tempInfo[1];
		String city = tempInfo[2];
		String state = tempInfo[3];
		String zipCode = tempInfo[4];
		long phone = Long.parseLong(tempInfo[5]);
		
		String[] tempName = name.split(" ");
		 
		// first name is always first
		String firstName = tempName[0];
		
		// last name is always last
		String lastName = tempName[tempName.length -1];
		
		//empty container for middle name
		String middleName = "";
		
		for(int i = 1; i < tempName.length -1; i++) {
			middleName += tempName[i];
			if( i != tempName.length -2) {
				middleName += " ";
			}
		}
		
		String[] tempAddress = street.split(" ");
		String streetName = "";
		
		for(int i = 1; i < tempAddress.length; i++) {
			streetName = tempAddress[1];
			if(i != tempAddress.length - 1) {
				streetName += " ";
			}
		}
		
		int streetNum = Integer.parseInt(tempAddress[0]);
		
		Person p3 = new Person(firstName, lastName, middleName, phone);
		p3.addAddress(streetNum, streetName, city, state, zipCode);
		directory.addPerson(p3);
		
		try {
			try (//Menu display and establish Scanner
			Scanner entry = new Scanner(System.in)) {
				System.out.println("Enter a number corresponding to the options below: ");
				System.out.println("1. Add another entry");
				System.out.println("2. Return to main menu");
				System.out.println("3. Quit program");
			
//Scanner input from user
				int item = input.nextInt();

				if (item > 0) {
//Menu Choices
					switch (item) {
					case 1:
						addNewEntry();
						break;
					case 2:
						menu();
						break;
					case 3:
						System.exit(0);
						break;
					}
				} else {
					System.out.println("Please enter a VALID number.");
				}
			}
		} catch (Exception e) {
			System.out.println("That was an invalid entry. Try again.");
			addNewEntry();
		}
	}

	public static void printDirectory() {
		
		directory.printDirectory(directory.getDirectory());
		
		try {
			try (//Menu display and establish Scanner
			Scanner entry = new Scanner(System.in)) {
				System.out.println("Enter a number corresponding to the options below: ");
				System.out.println("1. Return to main menu");
				System.out.println("2. Quit program");
			
//Scanner input from user
				int item = entry.nextInt();

				if (item > 0) {
//Menu Choices
					switch (item) {
					case 1:
						menu();
						break;
					case 2:
						System.exit(0);
						break;
					}
				} else {
					System.out.println("Please enter a VALID number.");
				}
			}
		} catch (Exception e) {
			System.out.println("That was an invalid entry. Try again.");
			printDirectory();
		}
		
	}
	
	public static void searchFirstName() {
		
		
		
		
		
	}
	
	
	
}

