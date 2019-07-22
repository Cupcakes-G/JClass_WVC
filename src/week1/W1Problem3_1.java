import java.util.Scanner;
public class W1Problem3_1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 values for a, b, and c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = Math.pow((Math.pow(b,2)) - (4.0*a*c), .5);
		if (d > 0) {
			double root1 = (-b + d)/(2.0*a);
			double root2 = (-b - d)/(2.0*a);
			System.out.println("There are two roots " + root1 + " and " + root2);
		}
		else if (d == 0) {
			double root = (-b) /(2.0*a);
			System.out.println("There is one root " + root);
		}
		else 
			System.out.println("The equation has no real roots");
			
		
	}
}



//Enter 3 values for a, b, and c:
//1 3.0   1
//There are two roots -0.3819660112501051 and -2.618033988749895

//Enter 3 values for a, b, and c:
//1.0 2 1
//There is one root -1.0

//Enter 3 values for a, b, and c:
//1 2 3.0
//The equation has no real roots

//Enter 3 values for a, b, and c:
//1 -4 -21
//There are two roots 7.0 and -3.0


