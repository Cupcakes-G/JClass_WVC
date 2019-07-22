import java.util.Scanner;
public class Problem3_2_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
//		double [] [] m2 = {{3, 4, 6},
//						   {2, 5, 4},
//						   {4, 2, 1}};
//
		
	double [][] matrix = new double[3][3];
			
			for (int n = 0; n < 3; n++) {
				System.out.print("Enter a row");
				String line = input.nextLine();
				line  = line.trim();
				String[] row = line.split(" ");
				
				for (int i = 0; i < 3; i++) {
					matrix[n][i] = Double.parseDouble(row[i]) ;
				}	
			}
			input.close();
			double [] [] m1 = new double[3][3];

			m1 = sortColumns(matrix);
		for (int col = 0; col < m1.length; col++) {
			for (int row = 0; row < m1.length; row++) {
				System.out.print(m1[col][row] + " ");
				if (row == 2) {
					System.out.println();
				}
			}

		}
		
		
		
	}
	public static double[][] sortColumns(double[][] m){
		int t = 0;
		for (int row = 0; row < m.length; row++) {

		for (int col = 0; col < m.length; col++) {
			if (row != 2)
				 t = row + 1 ;
			//else
			//	t = row - 1;
				
			if (m[row][col] > m[t][col]) {
				double temp = m[t][col];
				m[t][col] = m[row][col];
				m[row][col] = temp; }
			if (m[0][col] > m[row][col]) {
				double temp = m[row][col];
				m[row][col] = m[0][col];
				m[0][col] = temp; }
			if (m[2][col] < m[row][col]) {
				double temp = m[row][col];
				m[row][col] = m[2][col];
				m[2][col] = temp; }
		}
		}
		return m;
	}
}
//Enter a row4 5 2
//Enter a row2 7 1
//Enter a row6 3 0
//2.0 3.0 0.0 
//4.0 5.0 1.0 
//6.0 7.0 2.0 

//Enter a row.15 .875 .375
//Enter a row.55 .005 .225
//Enter a row.30 .12 .4
//0.15 0.005 0.225 
//0.3 0.12 0.375 
//0.55 0.875 0.4 

