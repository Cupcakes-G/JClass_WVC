import java.util.Scanner;

//ARRAYS
public class Day1 {
		public static void main(String[]args) {
//			double[] mylst = new double[10];
//			mylst[0] = 3;
//			System.out.println("Hi there33");
//			System.out.println("How many students are there?");
//			Scanner input = new Scanner(System.in);
//			// # of student
//			
//			input.close();
//			
			String n = "hello";
			int [] mylist = new int[8];
			mylist[0] = 5;
			System.out.println(mylist[0]);
			
			mylist = doubleArraySize(mylist);
			System.out.println(mylist[0]);
			System.out.println(mylist.length);

	}
		
		public static int[] doubleArraySize(int [] oldArr) {
			
			int [] newArr = new int[oldArr.length * 2] ;
			newArr[0] = oldArr[0];
			return newArr ;
			
		}
}
