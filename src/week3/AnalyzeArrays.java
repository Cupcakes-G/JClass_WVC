import java.util.Scanner;
public class AnalyzeArrays {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items:");
		int n = input.nextInt();
		double [] numbers = new double[n];
		double sum = 0;
		
		System.out.print("Enter the numbers");
		for(int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		double average = sum/n;
		
		int count = 0; //elements above average
		for (int i = 0; i < n; i++) {
			if (numbers[i] > average)
				count++;
		}
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
		int [] myList;
		myList = new int[10];
		System.out.print(myList);

		myList = new int[20];
		System.out.print(myList);
	   
		// Quiz Question
		int[] x = {1, 2, 3, 4};
	    int[] y = x;

	    x = new int[2];

	    for (int i = 0; i < y.length; i++)
	      System.out.print(y[i] + " ");
		
		
		
	}
	

}
