import java.util.Scanner;
public class W1Porblem3_4 {
	public static void calc(double[][]matrix) {
		double sum = 0;
		for (int r = 0; r < matrix.length; r++) {
			sum += matrix[r][r];
		}
	}
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the # of rows/columns");
		int row = input.nextInt();
		int col = row;
//
		double [][]matrix = new double[row][col];
//		for (int n = 0; n < t; n++) {
//			for (int i = 0; i < t; i++) {
//				double [] temp = new double[t];
//				System.out.print("Enter a row");
//				temp[i] = input.nextDouble();
//				if (i == t)
//					matrix[n] = temp; }  }
//		for (int i = 0; i < t; i++) {
//
//		for (int n = 0; n < t; n++) {
//			System.out.print(matrix[i][n]); } }
		
		int[][] data = new int[row][col]; 
        Scanner in = new Scanner(System.in);
        for(int r = 0; r< matrix.length; r++){ 
              for(int c = 0 ;c< matrix[r].length; c++){ 
                   System.out.println("enter the elementss for the Matrix"); 
                  data[r][c] = in.nextInt(); 
               } System.out.println(); 
          } 

           for(int r = 0; row< matrix.length; row++){
       for(int c = 0 ;col< matrix[r].length; col++){ 
             System.out.println(data[r][c]);
       } 
      System.out.println(); 
   }
	}

}
