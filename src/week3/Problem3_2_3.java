import java.util.Scanner;
public class Problem3_2_3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511:");
		int num1 = input.nextInt();
		String num = Integer.toBinaryString(num1);
		if (num.length() != 9) {
			int t = 9 - num.length();
			for (int x = 0; x < t; x++) {
				num = "0" + num;
			}
		}
		for (int i = 0; i < num.length(); i++) {
			if (i%3 == 0)
				System.out.println();
			if (num.charAt(i) == '1') 
				System.out.print("T" + " ");
			else				
				System.out.print("H" + " ");				
		}
	
	}
	
	

}
//Enter a number between 0 and 511:42
//
//H H H 
//T H T 
//H T H 

//Enter a number between 0 and 511:7
//
//H H H 
//H H H 
//T T T 

//Enter a number between 0 and 511:511
//
//T T T 
//T T T 
//T T T 

//Enter a number between 0 and 511:89
//
//H H T 
//H T T 
//H H T 
