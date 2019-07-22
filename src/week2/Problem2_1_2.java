import java.util.Scanner;
public class Problem2_1_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN:");
		String sn = input.nextLine();
		boolean is_sn = true;
		char s1 = sn.charAt(0);
		char s2 = sn.charAt(1);
		char s3 = sn.charAt(2);
		char s4 = sn.charAt(3);
		char s5 = sn.charAt(4);
		char s6 = sn.charAt(5);
		char s7 = sn.charAt(6);
		char s8 = sn.charAt(7);
		char s9 = sn.charAt(8);
		char s10 = sn.charAt(9);
		char s11 = sn.charAt(10);
		//DDD-DD-DDD
		
		//3 digits
		is_sn = Character.isDigit(s1);
		if (!is_sn) {
			System.out.print(sn + " is not a valid social security number");
			return; }
		is_sn = Character.isDigit(s2);
		if (!is_sn) {
			System.out.print(sn + " is not a valid social security number");
				return; }
		is_sn = Character.isDigit(s3);
		if (!is_sn) {
			System.out.print(sn + " is not a valid social security number");
			return; }
		
		//-
		if (s4 != '-') {
			is_sn = false;
			System.out.print(sn + " is not a valid social security number"); 
			return; }
	
		//2 digits
		is_sn = Character.isDigit(s5);
		if (!is_sn) {
			System.out.print(sn + " is not a valid social security number");
			return; }
		is_sn = Character.isDigit(s6);
		if (!is_sn) {
			System.out.print(sn + " is not a valid social security number");
			return; }
		//-
		if (s7 != '-') {
			is_sn = false;
			System.out.print(sn + " is not a valid social security number"); 
			return; }
		
		//4 digits
		is_sn = Character.isDigit(s8);
		if (!is_sn) {
			System.out.print(sn + " is not a valid social security number");
			return; }
		is_sn = Character.isDigit(s9);
			if (!is_sn) {
				System.out.print(sn + " is not a valid social security number");
				return; }
		is_sn = Character.isDigit(s10);
			if (!is_sn) {
				System.out.print(sn + " is not a valid social security number");
				return; }
		is_sn = Character.isDigit(s11);
			if (!is_sn) {
				System.out.print(sn + " is not a valid social security number");
				return; }
			
		System.out.print(sn + " is a valid social security number");
	}

}
//Enter a SSN:
//334-28-9372
//334-28-9372 is a valid social security number

//Enter a SSN:
//U79-28-3537
//U79-28-3537 is not a valid social security number

//Enter a SSN:
//666-282-2723
//666-282-2723 is not a valid social security number

//Enter a SSN:
//72-af53-83bg
//72-af53-83bg is not a valid social security number

//Enter a SSN:
//777-825-2726
//777-825-2726 is not a valid social security number

