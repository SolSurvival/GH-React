package phoneBook;

public class Address {
	private int streetNum;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;
	
	//sets parameters for a new address and applies them
	public Address(int streetNum, String streetName, String city, String state, String zipCode) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;		
	}
	//prints address
	public void printAddress() {
		System.out.println(streetNum + " " + streetName + ", " + city + ", " + state + " " + zipCode);
	}
	//sets just the street
	public void setStAddress(String newAddress) {
		//splits the new address entered into an array of strings
		String[] temp = newAddress.split(" ");
		String newStName = "";
		//sets the number to the integer listed first
		this.streetNum = Integer.parseInt(temp[0]);
		
		//creates a string for the street name
		for(int i = 1; i < temp.length; i++) {
			newStName += temp[i];
			if(i != temp.length - 2) {
				newStName += " ";
			}
		}
		
		this.streetName = newStName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String newState) {
		this.state = newState;
	}
	
	public void setZip(String newZip) {
		this.zipCode = newZip;
	}



	
}
