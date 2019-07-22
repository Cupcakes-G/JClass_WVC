import java.util.Scanner;
public class Problem2_1_1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value between 0 and 15");
		int i = input.nextInt();
		char letter = 0;
		if (i<10 && i >= 0)
			System.out.println(i);
		else if (i > 9 && i <= 15) {
			letter = (char) (65 + (i-10));
			System.out.println(letter);
		}
		else
				System.out.print("Invalid value");
	
			
	}

}
//Enter a value between 0 and 15
//4
//4

//Enter a value between 0 and 15
//9
//9

//Enter a value between 0 and 15
//10
//A

//Enter a value between 0 and 15
//12
//C

//Enter a value between 0 and 15
//15
//F

//Enter a value between 0 and 15
//17
//Invalid value

//Enter a value between 0 and 15
//-7
//Invalid value