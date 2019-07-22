package week5;

import java.util.*;
public class Problem5_1_1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a calculator expression:");
		String s1 = input.nextLine();
		// I used my own calculator program but it is very similar to the one from the website 
		if ( s1.contains("+")) {
			String eq[] = s1.split("\\+");
			int num1 = isInteger1(eq[0].trim());
			int num2 = isInteger1(eq[1].trim());

			System.out.printf("%d + %d = %d", num1, num2, num1+num2);

		}
		else if ( s1.contains("-")) {
			String eq[] = s1.split("\\-");
			int num1 = isInteger1(eq[0].trim());
			int num2 = isInteger1(eq[1].trim());
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);

		}
		else if ( s1.contains("*")) {
			String eq[] = s1.split("\\*");
			int num1 = isInteger1(eq[0].trim());
			int num2 = isInteger1(eq[1].trim());
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);

		}
		else if ( s1.contains("/")) {
			String eq[] = s1.split("\\/");
			int num1 = isInteger1(eq[0].trim());
			int num2 = isInteger1(eq[1].trim());
			System.out.printf("%d / %d = %f", num1, num2, (double) num1/num2);

		}
		
	}
	//exception method
	public static int isInteger1(String inp) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				int num = Integer.parseInt(inp);
				
				continueInput = false;
				System.out.println("You entered :" + num);

				return num;
			}
			catch(Exception ex) {
				System.out.print("Integer is required. Try again: ");
				inp = input.nextLine();
			}
		} while (continueInput);
		
		return -666;
	}
}
//Enter a calculator expression:
//262 + 280
//You entered :262
//You entered :280
//262 + 280 = 542

//Enter a calculator expression:
//h + 2
//Integer is required. Try again: 9
//You entered :9
//You entered :2
//9 + 2 = 11

//Enter a calculator expression:
//eh    / 3
//Integer is required. Try again: 9
//You entered :9
//You entered :3
//9 / 3 = 3.000000

//Enter a calculator expression:
//fxkfyk / yd
//Integer is required. Try again: 7
//You entered :7
//Integer is required. Try again: gh
//Integer is required. Try again: 3
//You entered :3
//7 / 3 = 2.333333