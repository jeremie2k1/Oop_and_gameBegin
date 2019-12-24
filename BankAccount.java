package Bankaccout;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customeName;
	private String email;
	private String phoneNumber;
	
	public void withdrawn(double amount) {
		if (this.balance  amount) {
			System.out.println(Ban chi duoc rut toi da + this.balance);
			
		}	
		else
		{
			this.balance = this.balance - amount;
			System.out.println(Rut tien thanh cong, so luong + amount);
			System.out.println(So du con lai+this.balance);
			  
		}
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println(Nop tien thanh cong, so du trong tai khoan la +this.balance);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomeName() {
		return customeName;
	}
	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public BankAccount(String accountNumber, double balance, String customeName, String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customeName = customeName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	

}
