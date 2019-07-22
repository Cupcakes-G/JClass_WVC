import java.util.ArrayList;
import java.util.Scanner;

public class Problem4_2_3 {
	
	public static void main(String[]args) {
		
		
	int[][] matrix = generateMatrix();
	
	int rows = matrix.length;   // ***** -------- process each ROW of the Matrix
	int columns = rows; 
	int[] rowSumArr = new int[rows];
	for (int row = 0; row < rows; row++) {    
		
		int sum = 0;
		for (int col = 0; col < columns; col++) {
			sum = sum + matrix[row][col];
		}
		rowSumArr[row] = sum;
	}	
	
	int[] columnSumArr = new int[columns];  // ***** -------- process each COLUMN of the Matrix -------- ******
	for (int col = 0; col < columns; col++) {   
		
		int sum = 0;
		for (int row = 0; row < rows; row++) {
			sum = sum + matrix[row][col];
		}
		columnSumArr[col] = sum;
	}
	
	
	// ***** -------- find which ROWS have largest sum-------- ******
	ArrayList<Integer> LargesumRows = findLargeNumberIndicies(rowSumArr);
	String s = "The largest row index: " + (int) LargesumRows.get(0) ;
	for (int ind = 1; ind < LargesumRows.size(); ind++) {  
		s = s + ", " + (int) LargesumRows.get(ind) ;
	}
	System.out.print(s);
	
	
	// ***** -------- find which COLUMNS have largest sum-------- ******
	ArrayList<Integer> LargesumColumns = findLargeNumberIndicies(columnSumArr);
	s = "\nThe largest column index: " + (int) LargesumColumns.get(0) ;
	for (int ind = 1; ind < LargesumColumns.size(); ind++) {  
		s = s + ", " + (int) LargesumColumns.get(ind) ;
	}
	System.out.print(s);
		
} // end of main
    
	// ***** -------- method returns LARGEST number indices -------- ******
	// ***** -------
	private static ArrayList<Integer> findLargeNumberIndicies(int[] arr) {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>() ;
		arrlist.add((Integer) 0);
		
		int temp = arr[0];
		for (int ind = 1; ind < arr.length; ind++) {   
			
			if (arr[ind] >= temp ) {
				
				if (arr[ind] > temp ) {
					arrlist = new ArrayList<Integer>() ; // discard old as we got new LARGER number
					temp = arr[ind];
				}	
				arrlist.add((Integer) ind);
			} // end if
			
		} // end for
		return arrlist;
	}

	// ***** -------- build Matrix -------- ******
	// ***** -------
	private static int[][] generateMatrix() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Array size of n:");
		int  n = input.nextInt();
		
		int[][] matrix = new int [n][n];
		int temp;
		
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		    	
		    	temp = 0;
		    	if(Math.random() > 0.5) { temp = 1 ;}
		        matrix[i][j] = temp ;
		    } 
		}
		
		System.out.print("The random Array is:\n");
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        System.out.print(" " + matrix[i][j]);
		    } 
		    System.out.println(" ");
		}
		return matrix;
	}
}

//Enter the Array size of n:10
//The random Array is:
// 0 1 0 0 1 1 0 0 0 1 
// 1 0 0 1 0 1 0 0 0 1 
// 0 0 0 1 1 0 0 1 0 1 
// 1 1 0 0 0 1 1 0 1 1 
// 0 0 1 0 1 0 0 1 0 0 
// 1 0 0 1 0 0 1 0 0 1 
// 1 1 0 0 1 1 0 0 1 0 
// 0 1 0 0 0 0 0 0 0 1 
// 0 1 0 1 1 1 0 1 0 1 
// 0 1 1 0 0 1 1 0 1 0 
//The largest row index: 3, 8
//The largest column index: 9
