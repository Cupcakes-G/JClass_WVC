import java.util.Scanner;
public class W1Problem3_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the weight of your package in pounds:");
		double w = input.nextDouble();
		if (w > 0 && w <= 1)
			System.out.println("Your package will cost $3.50");
		else if (w > 1 && w <= 3)
			System.out.println("Your package will cost $5.50");
		else if (w > 3 && w <= 10)
			System.out.println("Your package will cost $8.50");
		else if (w > 10 && w <= 20)
			System.out.println("Your package will cost $10.50");
		else if (w < 0 || w > 50)
			System.out.println("Your package cannot be shipped");

	}
	

}
//Please enter the weight of your package in pounds:
//.75554
//Your package will cost $3.50

//Please enter the weight of your package in pounds:
//2.0
//Your package will cost $5.50

//Please enter the weight of your package in pounds:
//10.0000000000000001
//Your package will cost $8.50

//Please enter the weight of your package in pounds:
//20
//Your package will cost $10.50

//Please enter the weight of your package in pounds:
//50.7
//Your package cannot be shipped

//Please enter the weight of your package in pounds:
//-76
//Your package cannot be shipped

