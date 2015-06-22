/*
 * %W% %E% Raietskyi Ruslan
 * 
 * This software provided computing number of right bracket expression, 
 * which containing N opening and N closing parentheses.
 * Using algorithm of computing Catalan numbers.
 * https://en.wikipedia.org/?title=Catalan_number 
 */
package ua.kharkiv.rr;

import java.math.BigInteger;

/**
 * Class BracketsLogic contain static method 
 * for computing of number of right parentheses expression. 
 * 
 * @version 1.0 22 June 2015
 * @author Raietskyi Ruslan
 */
public class BracketsLogic extends MyFactorial {
	
	/**
	 * count - static method, 
	 * which computing the number of right parentheses expression.
	 * @param n - quantity of opening and closing parentheses.
	 * @return - number of right parentheses expression.
	 */
	public static BigInteger count(int n) {
		BigInteger result = BigInteger.ZERO;

		if (n < 0) {
			
			/* Checking argument. */
			System.err.println("argument will be not negative!");
			System.exit(0);											/* Exit from program if argument value is wrong. */
		} else if (n == 0)
			return result = BigInteger.ZERO;

		/* 
		 * Computing Catalan number for given argument. 
		 * Using static method from extended class MyFactorial.
		 */
		result = factorialCount(2 * n).divide(
				(factorialCount(n).multiply(factorialCount(n + 1))));
		return result;
	}
}
