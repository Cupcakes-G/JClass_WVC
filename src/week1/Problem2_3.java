import java.util.Scanner;
public class Problem2_3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		int i = input.nextInt();
		int hundreds = i/100;
		int tens = (i%100)/10;
		int ones = i%10;
		System.out.println(hundreds + tens + ones);
				
		
	} 
	
}

//Enter a number between 0 and 1000:
//983
//20

//Enter a number between 0 and 1000:
//725
//14

//Enter a number between 0 and 1000:
//192
//12




