import java.util.Scanner;
//prints one month of a year
public class Problem2_3_3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year:");
		int year = input.nextInt();
		System.out.print("Enter the month (as a number):");
		int m = input.nextInt();
		int firstDay = zeller(m, year);
		Cal(m, firstDay, year);
		
	}
	public static int zeller(int m, int year) {
		int h;
		if (m == 1 || m == 2) {
			m = m + 12;
			year = year -1; }
		
		int j = year/100;
		int k = year%100;
		int q = 1;

		h = (q + (26*(m+1)/10) + k + k/4 + j/4 + 5*j)%7;
		if (h == 0) {
			h = 7; }
		return h;
	}
	public static void Cal(int month, int start, int year) {
		int days = 0;
		String month1 = "";
		switch (month) {
		case 1: 
			days = 31;
			month1 = "Jan" ;
			break;
			
		case 2: 
			 if ((year%4==0 && year%100!= 0)|| year%400== 0)
				 days = 29;
			 else 
				 days = 28;
			 
			month1 = "Feb" ;
			break;
			
		case 3: 
			days = 31;
			month1 = "March" ;
			break;
		case 4: 
			days = 30;
			month1 = "April" ;
			
			break;
		case 5: 
			days = 31;
			month1 = "May" ;
			
			break;
		case 6: 
			days = 30;
			month1 = "June";
			
			break;
		case 7: 
			days = 31;
			month1 = "July";
			
			break;
		case 8: 
			days = 31;
			month1 = "Aug";
			
			break;
		case 9: 
			days = 30;
			month1 = "Sep";
			
			break;
		case 10: 
			days = 31;
			month1 = "Oct";
			
			break;
		case 11: 
			days = 30;
			month1 = "Nov";
			
			break;
		case 12: 
			days = 31;
			month1 = "Dec";
			break;
			
		} 
		String s = "\n\n          " +  month1  + " " + year;
		s =  s + "\n" +  "______________________________";
		s =  s + "\n" +  "Sun Mon Tue Wed Thu Fri Sat";
		System.out.println(s);
		int i = 1;
		start = start - 1;
		for (int y = 1; y <= start; y=y+1)
			System.out.print("    ");
		
		for ( i = 1; i <= days; i++) {
			if ((i + start)%7 == 0) {
				System.out.printf("%4s", i + " ");
				System.out.print(" \n"); }
			else
			System.out.printf("%4s", i + " ");
		}
	}

}

//Enter the year:2019
//
//Enter the month (as a number):2
//
//
//          Feb 2019
//______________________________
//Sun Mon Tue Wed Thu Fri Sat
//                      1   2  
//  3   4   5   6   7   8   9  
// 10  11  12  13  14  15  16  
// 17  18  19  20  21  22  23  
// 24  25  26  27  28 