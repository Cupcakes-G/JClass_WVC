package week5.finalExam;

import java.math.BigInteger;
import java.util.*;

public class Final2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
//		//System.out.print(recr((num)));
//		ArrayList<BigInteger> list1 = new ArrayList<BigInteger>(3); 
//		
//		list1.add(BigInteger.valueOf(2));
//		list1.add(BigInteger.valueOf(1));
//		BigInteger i1 = list1.get(0);
//		System.out.print(i1);
//		List<BigInteger> list = new ArrayList<BigInteger>();
//		list.add(new BigInteger("12345"));
//		list.add(new BigInteger("23456"));
//		System.out.print(list[0]);
		
		long num = input.nextLong();
		System.out.print(recr1(num));



	}
	public static BigInteger recr(int n) {
		ArrayList<BigInteger> list = new ArrayList<BigInteger>(n + 1); 
		
			list.add(BigInteger.valueOf(2));
			list.add(BigInteger.valueOf(1));
		
	    BigInteger b;
	    BigInteger i1;
	    BigInteger i2;


		for (int i = 2; i < n; i++)
		   {
			i1 = list.get(n-1);
			i2 = list.get(n-2);

			b = (i1.add(i2));
			list.add(b);
		    }


		return list.get(n);
		//return (recr(n.subtract(BigInteger.valueOf(1))).add(recr(n.subtract(BigInteger.valueOf(2)))));
	}
	public static long recr1(long n) {
		if (n == 0)
			return 2;
		if (n == 1)
			return 1;
		
		return (recr1(n - 1) + recr1(n- 2));
	}
	

}
