package week5;

import java.math.*;
import java.math.BigInteger;
import java.util.*;

class RationalBigInt extends Rational {
	private BigInteger numerator = BigInteger.valueOf(0);
	private BigInteger denominator = BigInteger.valueOf(1);
	
	//constructor
	public RationalBigInt() {
	    this(BigInteger.valueOf(0), BigInteger.valueOf(1));
	  }
	// constructor
	public RationalBigInt(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		boolean b = denominator.compareTo(BigInteger.valueOf(0)) > 0;
		this.numerator = ((b ? BigInteger.valueOf(1) : BigInteger.valueOf(-1)).multiply(numerator)).divide(gcd);
		this.denominator = (denominator.abs()).divide(gcd);
	}

	// gcd
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = BigInteger.valueOf(1);
		boolean bn1 = true;
		boolean bn2 = true;
		int tn1 ;
		int tn2 ;
		BigInteger k1;

		for (int k = 1; bn1 && bn2 ;) {
			k1 = BigInteger.valueOf(k);
			tn1 = (n1.remainder(k1)).compareTo(BigInteger.valueOf(0));
			tn2 = (n2.remainder(k1)).compareTo(BigInteger.valueOf(0));
			if (tn1 == 0 && tn2 == 0) {
				gcd = k1;
			}
			k += 1;
			bn1 = k1.compareTo(n1) <= 0;
			bn2 = k1.compareTo(n2) <= 0;
		}
		return gcd;
	}

	// add
	public RationalBigInt add(RationalBigInt secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator1());
		BigInteger n1 = denominator.multiply(secondRational.getNumerator1());
		n = n.add(n1);
		BigInteger d = denominator.multiply(secondRational.getDenominator1());
		return new RationalBigInt(n, d);
	}

	// getDenominator
	public BigInteger getDenominator1() {
		return denominator;
	}

	// getNumerator
	public BigInteger getNumerator1() {
		return numerator;
	}

}

public class Problem5_2_2 extends Rational {
	public static void main(String[] args) {
		BigInteger i = BigInteger.valueOf(1);
		BigInteger t = BigInteger.valueOf(2);
		RationalBigInt obj = new RationalBigInt(BigInteger.valueOf(0), BigInteger.valueOf(1));
//		System.out.println(obj.getDenominator1());
//		System.out.println(obj.getNumerator1());

		int count = 0;
		while (count <= 25) {
			obj = obj.add(new RationalBigInt(i, t));

			count++;
			i.add(BigInteger.valueOf(1));
			t.add(BigInteger.valueOf(1));
		}

		System.out.println(obj);
		System.out.println(obj.getDenominator1());
		System.out.println(obj.getNumerator1());
		System.out.println(i);
		System.out.println(t);


	}

}
