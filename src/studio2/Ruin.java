package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What amount of money are you starting with?");
		double startAmount = in.nextDouble();
		double start = startAmount;
		System.out.println("What is the chance you'll win?");
		double winChance = in.nextDouble();

		System.out.println("What is the max amount of money you're willing to spend?");
		double winLimit = in.nextDouble();

		System.out.println("Number of days:");
		int totalSimulations = in.nextInt();
		System.out.println(totalSimulations);
		for (int i = 0; i <= totalSimulations; i++) {
			System.out.println(i);
			while ((startAmount > 0) && (startAmount < winLimit)) {


				double random = Math.random();
				if (winChance > random) {
					startAmount++;
					//System.out.println(startAmount + " WIN");
				}
				else {
					startAmount--;
					//System.out.println(startAmount + " LOSE");
				}
				//100
				startAmount = start;
			}


			if (startAmount == winLimit) {
				System.out.println("Success!");
			}
			else { //(startAmount == 1)
				System.out.println("Fail");
			}
		}
	}
}



