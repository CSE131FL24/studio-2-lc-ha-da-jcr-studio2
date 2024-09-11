package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many days do you wish to gamble?");
		int totalDays = in.nextInt();
		System.out.println("How much money do we start with?");
		double startAmount = in.nextDouble();
		System.out.println("What's our win probability?");
		double winChance = in.nextDouble();
		System.out.println("How much money do we have as our win limit?");
		double winLimit = in.nextDouble();
		int wins = 0;
		int losses = 0;
		for (int i = 1; i <= totalDays; i++ ) {
			double x = startAmount;
			int plays = 0;
			while (x > 0 && x < winLimit) {
				if (Math.random() < winChance) {
					x++;
					plays++;
				}
				else {
					x--;
					plays++;
				}
			}
			if (x == winLimit) {
				System.out.println(i + ": WIN " + plays);
				wins++;
			}
			else {
				System.out.println(i + ": LOSS " + plays);
				losses++;
			}
		}
		
		System.out.println("losses: " + losses +  " totalDays: " + totalDays );
		
	}
}
