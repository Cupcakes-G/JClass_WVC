import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Problem4_2_1 {
	
	public static void main(String[]args) {
		
		SavingsAccount savingsacc = new SavingsAccount(1122, 20000); // Savings
		savingsacc.setAnnualInterestRate(4.5);
		savingsacc.deposit(3000);
		savingsacc.withdraw(2500);
		System.out.print(savingsacc.toString());
		
		CheckingAccount checkingacc = new CheckingAccount(2222, 3000); // Checking
		checkingacc.setAnnualInterestRate(0);
		checkingacc.deposit(100);
		checkingacc.withdraw(250);
		System.out.print(checkingacc.toString());
		
	}
}


class SavingsAccount extends Account {
	
	SavingsAccount() {
		super();
	}
	SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	public String toString() {
		String note = " Account Type: Savings (since it is Savings Account, it can not be overdrawn)\n" ;
		return super.toString(note);
	}
}


class CheckingAccount extends Account {
	
	CheckingAccount() {
		super();
	}
	CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	public String toString() {
		String note = " Account Type: Checking (As a Checking Account, it has an overdraft limit)\n" ;
		return super.toString(note);
	}
}

class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    
    private static int Default_account_id = 1111111 ;
    

    public Account() {
    	
       this(Default_account_id, 0.0);
       dateCreated = new java.util.Date();
        
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
   

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public String toString() {
    	String note = "" ;  // empty note
    	return toString(note); 
    }
    
    public String toString(String note) {
    	
    	String s = "\n\nHere are the Summary of the Account:\n";
    	s = s + String.format(" Account ID: %d\n",id );
    	s = s + note ;	
    	s = s + String.format(" Interest Rate: %.2f\n Balance:%.2f\n ",annualInterestRate, balance );	
    	return s;
    }
} // end class



//Here are the Summary of the Account:
// Account ID: 1122
// Account Type: Savings (since it is Savings Account, it can not be overdrawn)
// Interest Rate: 4.50
// Balance:20500.00
// 
//
//Here are the Summary of the Account:
// Account ID: 2222
// Account Type: Checking (As a Checking Account, it has an overdraft limit)
// Interest Rate: 0.00
// Balance:2850.00