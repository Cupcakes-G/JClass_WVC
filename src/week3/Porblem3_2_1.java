import java.util.Scanner;

public class Porblem3_2_1 {
	public static void calc(double[][]matrix) {
		double sum = 0;
		for (int r = 0; r < matrix.length; r++) {
			sum += matrix[r][r];
		}
		System.out.print(sum);
	}
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double [][] matrix = new double[4][4];
		
		for (int n = 0; n < 4; n++) {
			System.out.print("Enter a row");
			String line = input.nextLine();
			line  = line.trim();
			String[] row = line.split(" ");
			
			for (int i = 0; i < 4; i++) {
				matrix[n][i] = Double.parseDouble(row[i]) ;
			}	
		}
		input.close();
		calc(matrix);
		
	}

}
//Enter a row1 2 3 4
//Enter a row2 34 5 6
//Enter a row2 4 5 6
//Enter a row2 3 5 6
//46.0

//Enter a row1 3 5 6
//Enter a row2 5 3 7
//Enter a row9 6 8 2
//Enter a row0 2 1 9
//23.0