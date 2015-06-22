package ua.kharkiv.rr;

import java.util.Scanner;

public class MyFactorialClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Input value for factorial computing");
			if (sc.hasNextInt()) {
				System.out.println("Answer: " + MyFactorial.factorialSum(sc.nextInt()));
				sc.close();
				System.exit(1);
			} else {
				System.err.println("Wrong type of argument! Try again!");
				sc.nextLine();
			}
		}
	}
}
