package phoneBook;

import java.util.Scanner;

public class MainPhoneBook {

	
	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create scanner for nextLine
		Scanner nextLineScanner = new Scanner(System.in);
		//create main directory
		Directory primary = new Directory();
		//create people so there is already some data in the directory
		Person c1 = new Person("Alex", "Duncan", "Ray" ,6182223333L);
		Person c2 = new Person("Rick", "Ross", "",6183221111L);
		//add addresses for the two people
		c1.addAddress(234, "North Broadway", "Salem", "IL", "62881");
		c2.addAddress(432, "Euclid Avenue", "St Louis", "MO", "63108");	
		//add them to the directory
		primary.addPerson(c1);
		primary.addPerson(c2);

		//create variables for the while loops
		int choice = 0;
		int updateChoice = 0;

		while(choice != 11) {
			//calls the initial menu
			choice = getMenu();
			switch (choice) {
			case 1: //add a new person
				//			Test case :
				//				John Doe, 114 Market St, St Louis, MO, 63403, 6366435698
				//				John E Doe, 324 Main St, St Charles, MO, 63303, 8475390126
				//				John Michael West Doe, 574 Pole ave, St Peters, MO, 63333, 5628592375
				System.out.println("Please enter information for the person to be added separated by commas ");
				System.out.println("    FORMAT: Name, Street Address, City(no periods, i.e. St Louis not St. Louis), State, ZipCode, Phone Number");
				String info = nextLineScanner.nextLine();

				//separates info into an array of strings
				String[] tempInfo = info.split(", ");
				//sets variables for the different parts of the string
				String name = tempInfo[0];
				String street = tempInfo[1];
				String city = tempInfo[2];
				String state = tempInfo[3];
				String zipCode = tempInfo[4];
				long phoneNum = Long.parseLong(tempInfo[5]);

				//separates the name into an array of strings
				String[] tempName = name.split(" ");
				//first name is always first in the array
				String firstName = tempName[0];
				//last name is always last
				String lastName = tempName[tempName.length -1];
				//creates a string for the middle name or names and adds them from the array, omitting first and last names
				String middleName = "";
				for(int i = 1; i < tempName.length - 1; i++) {		
					middleName += tempName[i];
					if(i != tempName.length - 2) {
						middleName += " ";
					}
				}
				//separates address into an array of strings
				String[] tempAddress = street.split(" ");
				String streetName = "";
				//places the parts of the address that make up the street name into a separate String
				for(int i=1; i<tempAddress.length; i++) {	
					streetName += tempAddress[i];
					if(i!=tempAddress.length - 1) {
						streetName += " ";
					}
				}
				//gets the street number and stores it in a variable
				int streetNum = Integer.parseInt(tempAddress[0]);
				
				//creates a new person, adds their address, then adds them to the directory
				Person p1 = new Person(firstName, lastName, middleName, phoneNum);
				p1.addAddress(streetNum, streetName, city, state, zipCode);
				primary.addPerson(p1);
				break;
			case 2: //remove a record
				System.out.println("Please enter the phone number of the person you would like to remove: ");
				long case2 = sc.nextLong();
				//calls the removePerson function on a person object based on their phone number
				primary.removePerson(primary.getByPhone(case2));
				break;
			case 3://search by first name
				System.out.println("Please enter the first name of the person you are searching for: ");
				String case3 = sc.next();
				//calls the printPersonArray on all persons with the first name provided
				primary.printPersonArray(primary.getByFirstName(case3));
				break;
			case 4://search by last name
				System.out.println("Please enter the last name of the person you are searching for: ");
				String case4 = sc.next();
				//calls the printPersonArray on all persons with the last name provided
				primary.printPersonArray(primary.getByLastName(case4));
				break;
			case 5: //search by full name
				System.out.println("Please enter the full name of the person you are searching for: ");
				String case5 = sc.nextLine();
				//calls the printPersonArray on all persons with the full name provided
				primary.printPersonArray(primary.getByFullName(case5));
				break;
			case 6:// search by phone number
				System.out.println("Please enter the phone number of the person you are searching for: ");
				long tempNum6 = sc.nextLong();
				//calls the get person function based on the phone number, an array is not necessary as the phone number is unique
				primary.getByPhone(tempNum6).getPerson();
				break;
			case 7: //search by city
				System.out.println("Please enter the city of the person you are searching for: ");
				String case7 = sc.nextLine();
				//prints an array of everyone living in that city
				primary.printPersonArray(primary.getByCity(case7));
				break;
			case 8://search by state
				System.out.println("Please enter the state of the person you are searching for: ");
				String case8 = sc.next();
				//prints an array of everyone living in that state
				primary.printPersonArray(primary.getByState(case8));
				break;
			case 9://prints the info for everyone in the directory alphabetically by first name
				primary.printAlphabetArray(primary.getDirectory());
				break;
			case 10://allows updating info after searching by phone number
				System.out.println("Please enter the phone number of the person you are searching for: ");
				long case10 = sc.nextLong();
				//searches by phone number and prints current info
				primary.getByPhone(case10).getPerson();

				updateChoice = 0;
				while(updateChoice != 8) {
					//calls the update menu which returns an int for the switch below
					updateChoice = getUpdateMenu();
					switch(updateChoice) {
					case 1: //Update first name
						System.out.println("Please enter the new first name: ");
						String newFirst = sc.next();
						//sets first name using the new string
						primary.getByPhone(case10).setFirstName(newFirst);
						break;
					case 2: //Update last name
						System.out.println("Please enter the new last name: ");
						String newLast = sc.next();
						//sets last name using the new string
						primary.getByPhone(case10).setLastName(newLast);
						break;
					case 3: //Street address
						System.out.println("Please enter the new street address: ");
						String newStreetAddress = nextLineScanner.nextLine();
						//sets address using the new string
						primary.getByPhone(case10).getAddress().setStAddress(newStreetAddress);
						break;
					case 4: //Phone Number
						System.out.println("Please enter the new number: ");
						long newPhone = sc.nextLong();
						//sets phone number to the new long
						primary.getByPhone(case10).setPhone(newPhone);
						break;
					case 5: //City
						System.out.println("Please enter the new city: ");
						String newCity = sc.next();
						//sets the city using the new string
						primary.getByPhone(case10).getAddress().setCity(newCity);
						break;
					case 6: //State
						System.out.println("Please enter the new state: ");
						String newState = sc.next();
						//set the state using the new string
						primary.getByPhone(case10).getAddress().setState(newState);
						break;
					case 7: //Zip Code
						System.out.println("Please enter the new zip code: ");
						String newZip = sc.next();
						//sets the zip code using the new string
						primary.getByPhone(case10).getAddress().setZip(newZip);
					case 8:
						break;
					}
				}
				break;
			case 11:
				break;
			}
		}

		sc.close();
		nextLineScanner.close();
	}

	public static int getMenu(){
		Scanner sc1 = new Scanner(System.in);
		//prints menu
		System.out.println("1. Add a new record");
		System.out.println("2. Delete a record");
		System.out.println("3. Search by first name");
		System.out.println("4. Search by last name");
		System.out.println("5. Search by full name");
		System.out.println("6. Search by phone number");
		System.out.println("7. Search by city");
		System.out.println("8. Search by state");
		System.out.println("9. Show all records alphabetically");
		System.out.println("10. Update a record");
		System.out.println("11. End the program");
		System.out.print("Please enter a number: ");
		
		//returns the integer input to the switch statement above
		int choice = sc1.nextInt();
		System.out.println();
		return choice;
	}

	public static int getUpdateMenu() {
		Scanner sc2 = new Scanner(System.in);

		System.out.println("1. Update first name");
		System.out.println("2. Update last name");
		System.out.println("3. Update street address");
		System.out.println("4. Update phone number");
		System.out.println("5. Update city");
		System.out.println("6. Update state");
		System.out.println("7. Update zip code");
		System.out.println("8. Exit record update");
		System.out.print("Please enter a number: ");
		
		//returns the integer input to the switch statement above
		int choice = sc2.nextInt();
		System.out.println();
		return choice;
	}


}