import java.util.Scanner;
public class Problem3_1_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the number of students:");
//		int n = input.nextInt();
//		double [] scores = new double[n];
//		String [] students = new String[n];
//		int i = 0;
////		while (i < n) {	
////			System.out.print("Enter the students: ");
////			students[i] = input.nextLine();
////			i++;
////		}
//		for(int k = 0; k < n; k++) {	
//			System.out.print("Enter the scores: ");
//			scores[k] = input.nextDouble();
//		}

		System.out.print("Enter the number of students:");
		int k = input.nextInt();
		double [] matrix = new double[k];
		
		for (int n = 0; n < 4; n++) {
			System.out.print("Enter a s");
			String line = input.nextLine();
			line  = line.trim();
			String[] row = line.split(" ");
			
			for (int i = 0; i < 4; i++) {
				matrix[i] = Double.parseDouble(row[i]) ;
			}	
		}
		input.close();
		
		
		
		
		
		
//		// # of student
//		System.out.println("How many students are there?");
//		int l = input.nextInt();
//		//making list names
//		String[] names = new String[l];
//		System.out.print("Enter the students' names:");
//		for (int i = 0; i < l; i = i++) {
//			names[i] = input.nextLine(); }
//		//making list scores
//		double[] scores = new double[l];
//		System.out.println("Enter the students' scores:");
//		for (int i = 0; i < scores.length; i++) {
//			scores[i] = input.nextDouble(); }
	
		

//		for (int n = 0; n < l; n++) {
//			double min = scores[n];
//			int temp = 0;
//			for (int i = n; i < l; i = i + 1) {
//		if (scores[i] < min) {
//			min = scores[i];
//			temp = i;}
//		}
//			if (scores[n] != min) {
//				double temp1 = scores[n];
//				scores[n] = min;
//				scores[temp] = temp1;}
//				String temp2 = names[n];
//				names[n] = names[temp];
//				names[temp] = temp2;
//				
//
//	}
//		
//
//		
//		for (int i = 0; i < l; i = i + 1) {	
//			System.out.print(scores[i] + " ");
//				}
//		for (int i = 0; i < l; i = i + 1) {	
//			System.out.print(names[i] + " ");
//			}
//	

	
	
	}

}
