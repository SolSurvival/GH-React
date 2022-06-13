package lanceLab4;

/*You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
 *  the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same,
 *   the result is 10.*/

import java.util.Scanner;

public class Class3 {

	public void lottery() {
		try {

			boolean trip = false;
			boolean doub = false;
			boolean sing = false;

			try (Scanner input = new Scanner(System.in)) {
				System.out.println("Welcome to the lottery! It COULD be your lucky day! ");
				System.out.println("Enter your first number below: ");
				int a = input.nextInt();
				System.out.println("Enter your second number below: ");
				int b = input.nextInt();
				System.out.println("Enter your third number below: ");
				int c = input.nextInt();

				if (a == b && a == c && b == c) {
					trip = true;
				} else if (a == b || b == c || a == c) {
					doub = true;
				} else {
					sing = true;
				}
				String result = null;

				if (trip) {
					result = "TRIPLE! YOU GOT 20";
				} else if (doub) {
					result = "DOUBLE! YOU GOT 10";
				} else if (sing) {
					result = "WHAMMY! YOU GOT 0!";
				}

				System.out.println("Let's check your results... ");
				Thread.sleep(1000);
				System.out.println("Hmmm.. " + a);
				Thread.sleep(1000);
				System.out.println("..and a " + b);
				Thread.sleep(500);
				System.out.println("..uh oh... " + c);
				Thread.sleep(500);
				System.out.println("..are you nervous..?");
				Thread.sleep(1000);
				System.out.println("You're results are...");
				Thread.sleep(720);
				System.out.println(result + "!!!!");
			}
		} catch (Exception e) {
			LanceLab4 lab = new LanceLab4();
			LanceLab4.menu();
		}

	}

}
