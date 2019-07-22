import java.util.Scanner;
public class Problem2_1_3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employees name:");
		String name = input.nextLine();
		System.out.println("Enter hours worked per week:");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double pay_rate = input.nextDouble();
		System.out.println("Enter Federal tax withholding rate:");
		double federal = input.nextDouble();
		System.out.println("Enter State tax withholding rate:");
		double state = input.nextDouble();
		long gross_pay = (Math.round(pay_rate*hours*100));
		double gross_pay2 = gross_pay/100.0;
		long federal_holdings = (Math.round(federal*hours*pay_rate*100));
		double federal_holdings2 = federal_holdings/100.0;
		long state_holdings = (Math.round(state*hours*pay_rate*100));
		double state_holdings2 = state_holdings/100.0;
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Hourly Rate: $" + pay_rate);
		System.out.println("Gross Pay: $" + gross_pay2);
		System.out.println("Deductions:");
		System.out.println("\t Federal Withholdings (" + federal + "): " +federal_holdings2);
		System.out.println("\t State Withholdings (" + state + "): " + state_holdings2);
		System.out.println("\t Total Deductions: " + (federal_holdings2 + state_holdings2));
		System.out.println("Net Pay: $" + (gross_pay2 - federal_holdings2 - state_holdings2));
		
	}
}

//Enter employees name:
//Smith
//Enter hours worked per week:
//10
//Enter hourly pay rate:
//9.75
//Enter Federal tax withholding rate:
//.20
//Enter State tax withholding rate:
//.09
//Employee Name: Smith
//Hours worked: 10.0
//Hourly Rate: $9.75
//Gross Pay: $97.5
//Deductions:
//	 Federal Withholdings (0.20): 19.5
//	 State Withholdings (0.09): 8.77
//	 Total Deductions: 28.27
//Net Pay: $69.23
