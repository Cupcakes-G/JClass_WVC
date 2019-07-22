package  week5;

import java.util.Scanner;
public class Problem3_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s775 = input.nextLine();
		dispalyPermutation(s775);
	}
	public static void dispalyPermutation(String s) {
		dispalyPermutation("1", s);
	}
	
	
	public static void dispalyPermutation(String s1, String s2) {
		
		int n = s2.length();
		if (n == 0) {
			System.out.println(s1);
		}
		for (int i = 0; i < s2.length() ; i++) {
			
			dispalyPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, n ));
			

		}
	}

	
}

//Enter a string: 
//xyz
// xyz
// xzy
// yxz
// yzx
// zxy
// zyx