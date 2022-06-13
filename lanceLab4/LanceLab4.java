package lanceLab4;

import java.util.*;

public class LanceLab4 {

	public static void main(String[] args) {
		menu();

	}
	
	public static void menu() {
		try {
			try (//Menu display and establish Scanner
			Scanner input = new Scanner(System.in)) {
				System.out.println("Welcome!");
				System.out.println("Enter a number corresponding to the options below to begin: ");
				System.out.println("1. A and B");
				System.out.println("2. Squirrel Play");
				System.out.println("3. Lottery Ticket");
				System.out.println("4. Finding XX");
				System.out.println("5. Repeated String");
				System.out.println("6. Quit/Enter Program");
//Scanner input from user
				int item = input.nextInt();

				if (item > 0) {
//Menu Choices
					switch (item) {
					case 1:
						Scanner scan = new Scanner(System.in);
						System.out.println("Enter your first positive number below:");
						int a = scan.nextInt();
						System.out.println("Enter your second positive number below:");
						int b = scan.nextInt();
						Class1  class1 = new Class1();
						class1.returnSum( a , b);
						break;
					case 2:
						Class2  class2 = new Class2();
						class2.squirrelPlay();
						break;
					case 3:
						Class3 class3 = new Class3();
						class3.lottery();
						break;
					case 4:
						Class4 class4 = new Class4();
						class4.xCount();
						break;
					case 5:
						System.out.println("Enter a word below: ");
						String phrase = input.next();
						System.out.println("Enter how many times you'd like to see your word below: ");
						int num = input.nextInt();
						Class5 class5 = new Class5(phrase,num);
						System.out.println("And your final string is.." + class5.copy(class5.getPhrase(), class5.getNum()));
						break;
					case 6:
						quit();
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

		public static boolean quit() {
			System.out.println("Thank you for using the program.");
			return false;
		}

}
