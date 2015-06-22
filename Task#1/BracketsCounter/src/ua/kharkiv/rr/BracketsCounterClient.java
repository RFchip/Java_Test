/*
 * %W% %E% Raietskyi Ruslan
 * 
 * This software is the client for computing number 
 * of right parentheses expression, which containing 
 * N opening and N closing parentheses.
 */
package ua.kharkiv.rr;

import java.util.Scanner;

/**
 * Class BracketsCounterClient - client for computing number 
 * of right parentheses expression, which containing 
 * N opening and N closing parentheses.
 * 
 * @version 1.0 22 June 2015
 * @author Raietskyi Ruslan
 */
public class BracketsCounterClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			/* An invitation to enter the value */
			System.out
					.println("Input value for quantity of right brackets computing");
			if (sc.hasNextInt()) {
				
				/* Checking argument, if number - computing. */
				System.out.println("Answer: " + BracketsLogic.count(sc.nextInt()));
				sc.close();
				System.exit(1);
			} else {
				
				/* Checking argument - if not number. */
				System.err.println("Wrong type of argument! Try again!");
				sc.nextLine();
			}
		}
	}

}
