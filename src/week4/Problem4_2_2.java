import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Problem4_2_2 {
	
	public static void main(String[]args) {
		
		Account2 acc = new Account2(1122, 1000);
		acc.setName("George");
		acc.setAnnualInterestRate(1.5);
		
		acc.deposit(30);
		acc.deposit(40);
		acc.deposit(50);
		acc.withdraw(5);
		acc.withdraw(4);
		acc.withdraw(2);
		
		System.out.print(acc.toString());
	}
}


class Account2 {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account2() {
        dateCreated = new java.util.Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account2(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
    
    public Account2(int id, double balance, String n) {
        this(id, balance);
        this.name = n;
    }

    public String getName() {
        return name; 
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
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
        Transaction t = new Transaction('W', amount, this.balance, "Withdraw from account.");
        transactions.add(t);
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transaction t = new Transaction('D', amount, this.balance, "Deposit to account.");
        transactions.add(t);
    }
    
    public String toString() {
    	String s = "Here are the Summary of the Account:\n";
    	s = s + String.format(" Account ID: %d\n Name:%s\n",id, name );
    	s = s + String.format(" Interest Rate: %.2f\n Balance:%.2f\n ",annualInterestRate, balance );
    	s = s + "---------Transactions--------- \n";
    	String pattern = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
    	for(int i = 0; i < this.transactions.size() ; i++ ) {		
    		Transaction tx = this.transactions.get(i);
    		String todayAsString = df.format(tx.getDate());
    		s = s + String.format(" Date: %s  %s  Amount:%.2f\n", todayAsString, tx.getDescription(), tx.getAmount());		
    	}
    	return s;
    }
} // end class
;

class Transaction {
    private java.util.Date mDate;
    private char mType;
    private double mAmount;
    private double mBalance;
    private String mDescription;
    
    public Transaction(char type, double amount, double balance, String description) {
        mType = type;
        mAmount = amount;
        mBalance = balance;
        mDescription = description;
        mDate = new java.util.Date();
    }

    public char getType() {
        return mType;
    }
    
    public void setType(char type) {
        mType = type;
    }
    
    public double getAmount() {
        return mAmount;
    } 
    
    public void setAmount(double amount) {
        mAmount = amount;
    }

    public double getBalance() {
        return mBalance;
    }
    
    public void setBalance(double balance) {
        mBalance = balance;
    }
    
    public String getDescription() {
        return mDescription;
    }
    
    public void setDescription(String description) {
        mDescription = description;
    }
    
    public java.util.Date getDate() {
        return mDate;
    }
    
    
} // end class


//Here are the Summary of the Account:
//	 Account ID: 1122
//	 Name:George
//	 Interest Rate: 1.50
//	 Balance:1109.00
//	 ---------Transactions--------- 
//	 Date: 07/08/2019 00:14:21  Deposit to account.  Amount:30.00
//	 Date: 07/08/2019 00:14:21  Deposit to account.  Amount:40.00
//	 Date: 07/08/2019 00:14:21  Deposit to account.  Amount:50.00
//	 Date: 07/08/2019 00:14:21  Withdraw from account.  Amount:5.00
//	 Date: 07/08/2019 00:14:21  Withdraw from account.  Amount:4.00
//	 Date: 07/08/2019 00:14:21  Withdraw from account.  Amount:2.00