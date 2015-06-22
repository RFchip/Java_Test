package ua.kharkiv.rr;

import java.math.BigInteger;

public class BracketsLogic extends MyFactorial {
	public static BigInteger count(int n) {
		BigInteger result = BigInteger.ZERO;

		if (n < 0) {
			System.err.println("argument will be not negative!");
			System.exit(0);
		} else if (n == 0)
			return result = BigInteger.ZERO;

		result = factorialCount(2 * n).divide(
				(factorialCount(n).multiply(factorialCount(n + 1))));
		return result;
	}
}
