package phoneBook;

import java.util.Arrays;

public class Directory {
	//create an array of people
	Person[] book = new Person[0];

	//adds a person to the array
	public void addPerson(Person newPerson) {
		//creates temporary array that is 1 larger than the current array
		Person[] temp = new Person[book.length + 1];
		//adds the people in the original array to the temporary one
		for(int i = 0; i < book.length; i++) {		
			//if(book.length > 0)
			temp[i] = book[i];
		}
		//adds the new person to the end of the temp array
		temp[temp.length - 1] = newPerson;
		//resets the original array to the new one
		book = temp;
	}

	public Person[] getDirectory() {
		return book;
	}
	//prints directory
	public void printDirectory() {
		for (int i = 0; i < book.length; i++) {
			book[i].getPerson();
		}
	}
	//searches for a person by phone number
	public Person getByPhone(long phoneNum) {
		int reference = 0;
		for(int i = 0; i < book.length; i++) {
			if(book[i].getPhone() == phoneNum) {
				reference = i;
				break;
			}
		}		
		return book[reference];
	}
	//removes a person from the array
	public void removePerson(Person removed) {
		//creates a temporary array that is one smaller than the current array
		Person[] temp = new Person[book.length - 1];
		//sets a counter integer for the temp array
		int x = 0;
		//loops through and adds everything except the person to be removed to the temp array
		for(int i = 0; i < book.length; i++) {
			
			if(book[i] != removed) {
				temp[x] = book[i];
				x++;
			}
		}
		//sets the current array to equal the temporary array
		book = temp;
		
	}
	//searches by first name
	public Person[] getByFirstName(String first) {
		//sets a counter for the size of the array
		int counter = 0;
		//for loop to determine the number of people in the new array
		for(int i = 0; i < book.length; i++) {
			if(book[i].getFirstName().equals(first)) {
				counter++;
			}
		}
		//creates a new array with the size determined by the counter above
		Person[] newArray = new Person[counter];
		//sets a counter for the new array
		int x = 0;
		//adds everyone with the correct name to the new array
		for(int j = 0; j < book.length; j++) {		
			if(book[j].getFirstName().equals(first)) {		
				newArray[x] = book[j];
				x++;
			}
		}
		return newArray;
	}
	//searches by last name
	public Person[] getByLastName(String last) {
		//sets a counter for the size of the new array
		int counter = 0;
		//loops through to check how large the new array needs to be
		for(int i = 0; i < book.length; i++) {
			if(book[i].getLastName().equals(last)) {
				counter++;
			}
		}
		//creates a new array with size based on the counter
		Person[] newArray = new Person[counter];
		//creates a variable to loop through the new array
		int x = 0;
		//places the corresponding people into the new array
		for(int j = 0; j < book.length; j++) {		
			if(book[j].getLastName().equals(last)) {		
				newArray[x] = book[j];
				x++;
			}
		}
		return newArray;
	}
	//searches by full name
	public Person[] getByFullName(String full) {
		//sets a counter for the size of the new array
		int counter = 0;
		//loops through to check the size of the new array
		for(int i = 0; i < book.length; i++) {
			if((book[i].getFirstName() + " " + book[i].getLastName()).equals(full)) {
				counter++;
			}
		}
		//creates a new array with size equal to the counter
		Person[] newArray = new Person[counter];
		//creates a variable to loop through the new array
		int x = 0;
		//adds the people with the correct first and last name to the new array
		for(int j = 0; j < book.length; j++) {		
			if((book[j].getFirstName() + " " + book[j].getLastName()).equals(full)) {		
				newArray[x] = book[j];
				x++;
			}
		}
		return newArray;
	}
	//search by state
	public Person[] getByState(String state) {
		//creates a counter for the size of the new array
		int counter = 0;
		//loops through to find out the size of the new array
		for(int i = 0; i < book.length; i++) {
			if(book[i].getMyState().toLowerCase().equals(state.toLowerCase())) {
				counter++;
			}
		}	
		//creates a new array with size equal to the counter
		Person[] newArray = new Person[counter];
		//sets a variable to loop through the new array
		int x = 0;
		//loops through the current array and adds the people in the state to the new array
		for(int j = 0; j < book.length; j++) {		
			if(book[j].getMyState().toLowerCase().equals(state.toLowerCase())) {		
				newArray[x] = book[j];
				x++;
			}
		}
		return newArray;
	}
	//searches by city
	public Person[] getByCity(String city) {
		//sets a counter for the size of the new array
		int counter = 0;
		//loops through the original array to find out the size of the new one
		for(int i = 0; i < book.length; i++) {
			if(book[i].getMyCity().toLowerCase().equals(city.toLowerCase())) {
				counter++;
			}
		}	
		//creates a new array based on the size of the counter
		Person[] newArray = new Person[counter];
		//sets a variable to count through the new array
		int x = 0;
		//loops through, adding each new person to the new array and increasing the x variable when a person is added
		for(int j = 0; j < book.length; j++) {		
			if(book[j].getMyCity().toLowerCase().equals(city.toLowerCase())) {		
				newArray[x] = book[j];
				x++;
			}
		}
		return newArray;
	}
	//prints the people in an array using getPerson
	public void printPersonArray(Person[] searched) {
		for(int i = 0; i < searched.length; i++) {
			searched[i].getPerson();
		}
	}
	//prints the array alphabetically
	public void printAlphabetArray(Person[] searched) {
		String[] alphabet = new String[searched.length];
		//sets a new array for the first names of each person
		for(int i = 0; i < searched.length; i++) {
			alphabet[i] = searched[i].getFirstName();
		}
		//sorts them alphabetically
		Arrays.sort(alphabet);
		//prints each person in the new array
		for(int j = 0; j < alphabet.length; j++) {
			for(int k = 0; k < book.length; k++) {
				if (alphabet[j] == book[k].getFirstName()) {
					book[k].getPerson();
				}
			}
		}
	}
	

}
