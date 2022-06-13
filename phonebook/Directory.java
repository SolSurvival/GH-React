package phonebook;

import java.util.*;



public class Directory {
	
	public static Directory directory = new Directory();
	// array of people
	Person[] person = new Person[0]; 
	
	// addPerson to array
	public void addPerson(Person newPerson) {
		// create temp array one larger than current array
		Person[] temp = new Person[person.length + 1];
		
		//add people in original array to temp array
		for(int i = 0; i < person.length; i++) {
			temp[i] = person[i];
			
		}
		//at end of array, add new person object
		temp[temp.length - 1] = newPerson;
		
		// reassign the original array to temp 
		person = temp;
		
	}
	
	public Person[] getDirectory() {
		return person;
	}
	
	// to search for first name
	@SuppressWarnings("unlikely-arg-type")
	public void searchFirst(Person[] people) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first name below:");
		
		String entry = input.nextLine();
		
		for(Person item: people) {
            if(item.equals(entry)) {
                System.out.println("The array contains "+ entry);
            }else   break;}

	}
	
	// to print entire directory
	public void printDirectory(Person[] people) {
		for(int i = 0; i < people.length; i++) {
			people[i].getPerson();
		}
	}
}
