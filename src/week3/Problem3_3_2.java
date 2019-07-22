import java.time.LocalDateTime;

public class Problem3_3_2 {
	public static void main(String[]args) {
		Account3 account1 = new Account3(1122, 20000, 4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		account1.toString1();
	}

}
class Account3{
	//data fields
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	LocalDateTime dateCreated = LocalDateTime.now();
	
	//constructor
	Account3(){
	}
	Account3(int id1, double balance1, double annualinterest1){
		id = id1;
		balance = balance1; 
		annualInterestRate = annualinterest1; }
	
	//methods
	int getId() {
		return id; }
	double getBalance() {
		return balance; }
	double getAnnualInterestRate() {
		return annualInterestRate; }
	double getMonthlyInterestRate() {
		return balance*(annualInterestRate/1200); }
	void withdraw(double ammount) {
		balance -= ammount; }
	void deposit(double ammount) {
		balance += ammount; }
	void toString1() {
		System.out.println(balance);
		System.out.println(annualInterestRate/12);
		System.out.println(dateCreated);

	}
	
}
//20500.0
//0.375
//2019-06-30T16:52:59.630