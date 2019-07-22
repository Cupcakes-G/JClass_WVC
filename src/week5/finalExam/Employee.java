package week5.finalExam;

public abstract class Employee implements Payable{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final int id;

	public Employee(String firstName, String lastName, String socialSecurityNumber, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public int getId() {
		return id;
	}

	public String toString() {
		return String.format("%s %s%nsocial security number: %s%ncompany id: %d", getFirstName(), getLastName(),
				getSocialSecurityNumber(), getId());
	}

	public abstract double earnings();

}
