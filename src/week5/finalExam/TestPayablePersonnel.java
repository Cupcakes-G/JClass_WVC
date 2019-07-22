package week5.finalExam;
import java.util.*;
public class TestPayablePersonnel extends SalariedEmployee implements Payable {
	public TestPayablePersonnel(String firstName, String lastName, String socialSecurityNumber, double weeklySalary,
			int id) {
		super(firstName, lastName, socialSecurityNumber, weeklySalary, id);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[]args) {
		ArrayList<Payable> personnel = new ArrayList<Payable>();
		personnel.add(new SalariedEmployee("Tom", "Jones", "111-22-3333", 1000.00, 0));
		personnel.add(new SalariedEmployee("John", "Doe", "111-22-4444", 950.00, 1));
		personnel.add(new SalariedEmployee("Mary", "Jane", "111-22-5555", 1050.00, 2));
		personnel.add(new Contractor("111-22-6666", 5500.00));
		personnel.add(new Contractor("111-22-7777", 6000.00));

		for (Payable i : personnel) {
			System.out.print(i);
		}



	}

}
