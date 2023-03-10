package bus;

import java.util.Date;

public class CreditAccount {
	private String accountNumber;
	private Date dateOfBirth;
	private double balance;
	private int transaction;

	
// -- Getter and Setter
// -------------------------------------
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
// -------------------------------------

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
// -------------------------------------

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getTransaction() {
		return transaction;
	}
	public void setTransaction(int transaction) {
		this.transaction = transaction;
	}
	
// --------  Constructeurs -------------
// -------------------------------------
	// default constructor		
	public CreditAccount() {
		this.accountNumber = "Undefined";
		this.dateOfBirth = new Date();
		this.balance = 0.00;
		this.transaction = 0;
	}
	// copy constructor	
	public CreditAccount(CreditAccount newAccount) {
		this.accountNumber = newAccount.accountNumber;
		this.dateOfBirth = newAccount.dateOfBirth;
		this.balance = newAccount.balance;
		this.transaction = newAccount.transaction;
	}
	// constructor	with parameters
	public CreditAccount(String accountNumber, Date dateOfBirth, double balance, int transaction) {
		super();
		this.accountNumber = accountNumber;
		this.dateOfBirth = dateOfBirth;
		this.balance = balance;
		this.transaction = transaction;
	}
	
		
	@Override
	public String toString() {
		return "CheckingAccount [accountNumber=" + accountNumber + ", dateOfBirth=" + dateOfBirth + ", balance="
				+ balance + ", transaction=" + transaction + "]";
	}
	
		
}
