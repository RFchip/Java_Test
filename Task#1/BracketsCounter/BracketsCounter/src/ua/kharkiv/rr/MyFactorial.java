/*
 * %W% %E% Raietskyi Ruslan
 * 
 * This software provided computing of factorial
 * and sum of the digits, which represent factorial.
 */
package ua.kharkiv.rr;

import java.math.BigInteger;

/**
 * Class MyFactorial contains two static methods 
 * for computing of factorial and sum of the digits, 
 * which represent factorial.
 * 
 * @version 1.0 22 June 2015
 * @author Raietskyi Ruslan
 */
public class MyFactorial {

	/**
	 * factorialCount - static method, which computing factorial of incoming value.
	 * 
	 * @param f - incoming value, will be non-negative integer.
	 * @return - value of factorial f.
	 */
	public static BigInteger factorialCount(int f) {
		BigInteger result = BigInteger.ONE;

		if (f < 0) {
			
			/* Checking argument. */
			System.err.println("argument will be not negative!");
			System.exit(0);											/* Exit from program if argument value is wrong. */
		} else if (f == 0) {
			return BigInteger.ONE;
		} else {
			for (int i = 1; i <= f; ++i) {
				result = result.multiply(BigInteger.valueOf(i));
			}
		}
		return result;												
	}

	/**
	 * factorialSum - static method, which computing sum of the digits, 
     * which represent factorial.
	 * 
	 * @param f - incoming value, will be non-negative integer.
	 * @return - value of sum of the digits factorial f.
	 */
	public static BigInteger factorialSum(int f) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger res_factorial = factorialCount(f);
		while (!res_factorial.equals(BigInteger.ZERO)) {
			
			/* If value more than zero - start to count sum */
			sum = sum.add(res_factorial.mod(BigInteger.TEN));
			res_factorial = res_factorial.divide(BigInteger.valueOf(10));
		}
		return sum;
	}

}
