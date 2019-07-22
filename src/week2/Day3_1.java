package week2;

public class Day3_1 {
	public static void main(String[]args) {
		//find prime factors of a number
		final int NUMBEROFPRIME = 50;
		final int NUMBERPERLINE = 10;
		int count = 0;
		int number = 2;
		
		while (count < NUMBEROFPRIME) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if (count%NUMBERPERLINE == 0) {
					System.out.println(number);
				}
				else 
					System.out.print(number + "  ");
			count++;
				
			}	
		}
	}
	//method
	//int is the return value type
	//int i1, int i2 are formal parameters; (int i1, int i2) is the parameter list
	//sum(int i1, int i2) is the method signature
	//public static int sum(int i1, int i2) is the header of the method
	public static int sum(int i1, int i2) {
		int total = 0;
		for (int i = i1; i<=i2; i++) {
			total += i;
		}
		return total;
	}
}
