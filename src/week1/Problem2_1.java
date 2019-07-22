import java.util.Scanner;
public class Problem2_1 {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a degree in Celsius:");
	double c = input.nextDouble();
	double f = (9.0/5) * c + 32;
	System.out.println(c + " degrees Celsius is " + f + " degrees Fahrenheit");
	
} 
}

//Enter a degree in Celsius:
//7
//7.0 degrees Celsius is 44.6 degrees Fahrenheit

//Enter a degree in Celsius:
//6.342
//6.342 degrees Celsius is 43.4156 degrees Fahrenheit

//Enter a degree in Celsius:
//67
//67.0 degrees Celsius is 152.60000000000002 degrees Fahrenheit

//Enter a degree in Celsius:
//0
//0.0 degrees Celsius is 32.0 degrees Fahrenheit

//Enter a degree in Celsius:
//-6
//-6.0 degrees Celsius is 21.2 degrees Fahrenheit



