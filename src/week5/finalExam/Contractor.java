package week5.finalExam;
import java.util.Date;

public class Contractor implements Payable{
	private final String socialSecurityNumber;
	// should be final ^
	double amount;
	Date start;
	boolean isActive;
	//String ssn;
	
	public Contractor() {
		socialSecurityNumber = "000-00-0000";
		start = new Date();
		isActive = true;
	}
	public Contractor(String ssn, double amount) {
		socialSecurityNumber = ssn;
		this.amount = amount;
		start = new Date();
		isActive = true;
		
		
	}
	public String toString() {
		return("\n------------------------------" +
				"\nsocial security number: " + socialSecurityNumber+
				"\ncontract amount: $" + amount +
				"\nstart date: " + start +
				"\nactive: " + isActive);
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
