import java.util.Scanner;
public class Problem2_2_1 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int num = input.nextInt();
		int i = 2;
		int con = num + 1;
		while (i < con) {
			//method call
			int z = factors(num, i);

			if (z == 0) {
				i = i + 1; 
				}

			else {
				System.out.print(i + " ");
				num = z; 
				
			if (z == i) {
					System.out.print(z + " ");
					break; } 
			else 
					i = 2; 
			}
			}
		
		}
	
	public static int factors(int num, int i) {
		if (num % i == 0) {
			return ((int) (num/i));
		}
		else 
			return ((int) 0);
	}
}

//Please enter a number:120
//2 2 2 3 5 
//Please enter a number:20
//2 2 5 
//Please enter a number:6
//2 3
//Please enter a number:9
//3 3
//Please enter a number:1234
//2 617
//Please enter a number:2048
//2 2 2 2 2 2 2 2 2 2 2 


