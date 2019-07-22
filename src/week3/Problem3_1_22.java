import java.util.Scanner;
public class Problem3_1_22 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter the number of students now:");
		//int n = input.nextInt();
		
		System.out.print("Enter all student names separated by space");
		String line = input.nextLine();
		line  = line.trim();
		String[] names = line.split(" ");
		int n = names.length ;
		
		
		System.out.print("Enter all student Scores separated by space");
		line = input.nextLine();
		line  = line.trim();
		String[] scoresStr = line.split(" ");
		double[] scores = new double[n];
		
		for (int i = 0; i < n; i++) {
			scores[i] = Double.parseDouble(scoresStr[i]) ;
		}
		
		input.close();
		selectionSort(scores, names);
		System.out.println("Student names sorted based on their scores:");
		for(int i = 0; i < scores.length; i++) {
			System.out.println(names[i]);
			
		}
			
	}
	
	public static void selectionSort(double[] list, String[]names) {
		for(int n = 0; n < list.length; n++) {
			//min of list
			double min = list[n];
			int minIndex = n;
			
			for (int l = n + 1; l < list.length; l++) {
				if (min > list[l]) {
					min = list[l];
					minIndex = l;
				}
			}
			
			//swap indexes
			if(minIndex != n) {
				double temp = list[n];
				list[n] = list[minIndex];
				list[minIndex] = temp;
				
				String temp1 = names[n];
				names[n] = names[minIndex];
				names[minIndex] = temp1;
						
				
			}
		}
		
		//System.out.println(names[0]);
	}  // end of method
	
}   // end of class


//Enter all student names separated by space an jack gil ryan
//Enter all student Scores separated by space 30 20 66 39
//Student names sorted based on their scores:
//jack
//an
//ryan
//gil