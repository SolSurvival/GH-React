package lanceLab4;

import java.util.Scanner;

public class Class2 {

	public void squirrelPlay() {
		try {

			try  (Scanner input = new Scanner(System.in)) {
				System.out.println("Is is summer? Enter 1 for yes or 2 for no: ");
				int season = input.nextInt();
				System.out.println("Enter the temperature below: ");
				int temp = input.nextInt();

				if (season == 1 && temp >= 60 && temp <= 100) {
					System.out.println("The squirrels will play.");
				} else if (season == 2 && temp >= 60 && temp <= 90) {
					System.out.println("The squirrels will play.");
				} else {
					System.out.println("The squirrels will not play.");
				}
			}
		} catch (Exception e) {
			LanceLab4 lab = new LanceLab4();
			LanceLab4.menu();
		}

	}

}
