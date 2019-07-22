package week5.finalExam;
import java.util.*;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, 
			double weeklySalary, int id) {
		super(firstName, lastName, socialSecurityNumber, id);

		this.weeklySalary =  weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary() {
		return this.weeklySalary;
	}
	public String toString() {
		return ("\n------------------------------" +
				"\nsalaried employee: " + getFirstName() + " " + getLastName() +
				"\nsocial security number: " + getSocialSecurityNumber() +
				"\ncompany id: " + getId() +
				"\nweekly salary: $" + Double.toString(weeklySalary));
	}
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}

}
