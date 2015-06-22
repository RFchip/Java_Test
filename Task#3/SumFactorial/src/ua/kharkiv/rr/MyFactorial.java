package ua.kharkiv.rr;

import java.math.BigInteger;

public class MyFactorial {

	public static BigInteger factorialCount(int f) {
		BigInteger result = BigInteger.ONE;

		if (f < 0) {
			System.err.println("argument will be not negative!");
			System.exit(0);
		} else if (f == 0) {
			return BigInteger.ONE;
		} else {
			for (int i = 1; i <= f; ++i) {
				result = result.multiply(BigInteger.valueOf(i));
			}
		}
		return result;
	}

	public static BigInteger factorialSum(int f) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger res_factorial = factorialCount(f);
		while (!res_factorial.equals(BigInteger.ZERO)) {
			sum = sum.add(res_factorial.mod(BigInteger.TEN));
			res_factorial = res_factorial.divide(BigInteger.valueOf(10));
		}
		return sum;
	}

}
