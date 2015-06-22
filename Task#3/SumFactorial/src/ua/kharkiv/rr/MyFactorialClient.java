/*
 * %W% %E% Raietskyi Ruslan
 * 
 * This software is the client for computing sum 
 * of the digits, which represent factorial of incoming value.
 */
package ua.kharkiv.rr;

import java.util.Scanner;

/**
 * Class MyFactorialClient - client for computing sum 
 * of the digits, which represent factorial of incoming value.
 * 
 * @version 1.01 22 June 2015
 * @author Raietskyi Ruslan
 */
public class MyFactorialClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			/* An invitation to enter the value */
			System.out.println("Input value for factorial computing");
			if (sc.hasNextInt()) {
				
				/* Checking argument, if number - computing sum. */
				System.out.println("Answer: " + MyFactorial.factorialSum(sc.nextInt()));
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
