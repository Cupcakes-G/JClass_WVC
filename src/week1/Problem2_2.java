import java.util.Scanner;
public class Problem2_2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 and y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter x2 and y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x = Math.pow((x2 - x1),2);
		double y = Math.pow((y2 - y1),2);
		double distance = Math.pow((x+y),0.5);
		System.out.println("The distance is" + distance);
		
	}

}
//Enter x1 and y1:
//1 2
//Enter x2 and y2:
//3 4
//2.8284271247461903

//Enter x1 and y1:
//3 4
//Enter x2 and y2:
//6 7
//4.242640687119285

//Enter x1 and y1:
//0 0
//Enter x2 and y2:
//3 4
//5.0