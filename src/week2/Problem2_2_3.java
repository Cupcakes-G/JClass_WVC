
import java.util.Scanner;
public class Problem2_2_3 {
	
	static void printMonth(int year, String month) {
		String s = "\n\n          " +  month  + " " + year;
		s =  s + "\n" +  "______________________________";
		s =  s + "\n" +  "Sun Mon Tue Wed Thu Fri Sat";
		System.out.println(s);	
	}
	
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first day of the year");
		int firstDay = input.nextInt();
		System.out.println("Enter the year");
		int year = input.nextInt();
		//watch out for leap year
		int i;
		int days = 0;
		int count = 1;
		String month = "";
		int v = 0;
		
		for (i = 1; i < 13; i++) {
			
			switch (i) {
			case 1: 
				days = 31;
				month = "Jan" ;
				printMonth(year, month);
				break;
				
			case 2: 
				 if ((year%4==0 && year%100!= 0)|| year%400== 0)
					 days = 29;
				 else 
					 days = 28;
				 
				month = "Feb" ;
				printMonth(year, month);
				firstDay = v;
				break;
				
			case 3: 
				days = 31;
				month = "March" ;
				printMonth(year, month);
				firstDay = v;
				break;
			case 4: 
				days = 30;
				month = "April" ;
				printMonth(year, month);
				firstDay = v;
				break;
			case 5: 
				days = 31;
				month = "May" ;
				printMonth(year, month);
				firstDay = v;
				break;
			case 6: 
				days = 30;
				month = "June";
				printMonth(year, month);
				firstDay = v;
				break;
			case 7: 
				days = 31;
				month = "July";
				printMonth(year, month);
				firstDay = v;
				break;
			case 8: 
				days = 31;
				month = "Aug";
				printMonth(year, month);
				firstDay = v;
				break;
			case 9: 
				days = 30;
				month = "Sep";
				printMonth(year, month);
				firstDay = v;
				break;
			case 10: 
				days = 31;
				month = "Oct";
				printMonth(year, month);
				firstDay = v;
				break;
			case 11: 
				days = 30;
				month = "Nov";
				printMonth(year, month);
				firstDay = v;
				break;
			case 12: 
				days = 31;
				month = "Dec";
				printMonth(year, month);
				firstDay = v;
				break;
				
			}  // end of switch
			
		//	System.out.print(days);
			  v = Cal(days, firstDay);
			
		}  // end of FOR
		
		
	}  // end of main
			


	public static int Cal(int days, int start) {
		int i = 1;
		int t = 0;
		for (int y = 1; y <= start; y=y+1)
			System.out.print("    ");
		
		for ( i = 1; i <= days; i++) {
			if ((i + start)%7 == 0) {
				System.out.printf("%4s", i + " ");
				System.out.print(" \n"); }
			else
			System.out.printf("%4s", i + " ");
			if (i == days) {
				t = i - 28 + start;
				if (t >= 7)
					t = t - 7;
				return t; }
		}
		
		return 0;
	}
	
		
} 
//Enter the first day of the year
//3
//Enter the year
//1990
//
//
//          Jan 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//              1   2   3   4  
//  5   6   7   8   9  10  11  
// 12  13  14  15  16  17  18  
// 19  20  21  22  23  24  25  
// 26  27  28  29  30  31 
//
//          Feb 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//                          1  
//  2   3   4   5   6   7   8  
//  9  10  11  12  13  14  15  
// 16  17  18  19  20  21  22  
// 23  24  25  26  27  28 
//
//          March 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//                          1  
//  2   3   4   5   6   7   8  
//  9  10  11  12  13  14  15  
// 16  17  18  19  20  21  22  
// 23  24  25  26  27  28  29  
// 30  31 
//
//          April 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//          1   2   3   4   5  
//  6   7   8   9  10  11  12  
// 13  14  15  16  17  18  19  
// 20  21  22  23  24  25  26  
// 27  28  29  30 
//
//          May 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//                  1   2   3  
//  4   5   6   7   8   9  10  
// 11  12  13  14  15  16  17  
// 18  19  20  21  22  23  24  
// 25  26  27  28  29  30  31  
//
//
//          June 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//  1   2   3   4   5   6   7  
//  8   9  10  11  12  13  14  
// 15  16  17  18  19  20  21  
// 22  23  24  25  26  27  28  
// 29  30 
//
//          July 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//          1   2   3   4   5  
//  6   7   8   9  10  11  12  
// 13  14  15  16  17  18  19  
// 20  21  22  23  24  25  26  
// 27  28  29  30  31 
//
//          Aug 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//                      1   2  
//  3   4   5   6   7   8   9  
// 10  11  12  13  14  15  16  
// 17  18  19  20  21  22  23  
// 24  25  26  27  28  29  30  
// 31 
//
//          Sep 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//      1   2   3   4   5   6  
//  7   8   9  10  11  12  13  
// 14  15  16  17  18  19  20  
// 21  22  23  24  25  26  27  
// 28  29  30 
//
//          Oct 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//              1   2   3   4  
//  5   6   7   8   9  10  11  
// 12  13  14  15  16  17  18  
// 19  20  21  22  23  24  25  
// 26  27  28  29  30  31 
//
//          Nov 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//                          1  
//  2   3   4   5   6   7   8  
//  9  10  11  12  13  14  15  
// 16  17  18  19  20  21  22  
// 23  24  25  26  27  28  29  
// 30 
//
//          Dec 1990
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//      1   2   3   4   5   6  
//  7   8   9  10  11  12  13  
// 14  15  16  17  18  19  20  
// 21  22  23  24  25  26  27  
// 28  29  30  31 