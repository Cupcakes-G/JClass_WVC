import java.util.Scanner;
public class Problem3_1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers to find the gcd:");
		int m = input.nextInt();
		int n = input.nextInt();
		System.out.print("The result is " + gcd(m, n));
		
	}
	public static int gcd(int m, int n) {
		if (m % n == 0) 
			return n;
		return(gcd(n, m % n));
			

		
		
	}

}

//Enter two numbers to find the gcd:
//24 8
//The result is 8

//Enter two numbers to find the gcd:
//12 9
//The result is 3
