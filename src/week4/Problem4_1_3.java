import java.util.Scanner;

public class Problem4_1_3 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a calculator expression:");
		String s1 = input.nextLine();
		
		if ( s1.contains("+")) {
			String eq[] = s1.split("\\+");
			int num1 = Integer.parseInt(eq[0].trim());
			int num2 = Integer.parseInt(eq[1].trim());
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);

		}
		else if ( s1.contains("-")) {
			String eq[] = s1.split("\\-");
			int num1 = Integer.parseInt(eq[0].trim());
			int num2 = Integer.parseInt(eq[1].trim());
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);

		}
		else if ( s1.contains("*")) {
			String eq[] = s1.split("\\*");
			int num1 = Integer.parseInt(eq[0].trim());
			int num2 = Integer.parseInt(eq[1].trim());
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);

		}
		else if ( s1.contains("/")) {
			String eq[] = s1.split("\\/");
			int num1 = Integer.parseInt(eq[0].trim());
			int num2 = Integer.parseInt(eq[1].trim());
			System.out.printf("%d / %d = %f", num1, num2, (double) num1/num2);

		}
		
	}

}
//Enter a calculator expression:
//2+3
//2 + 3 = 5

//Enter a calculator expression:
//4/5
//4 / 5 = 0.800000

//Enter a calculator expression:
//6 *324
//6 * 324 = 1944