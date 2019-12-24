package Bankaccout;

public class Use_BankAccount  {
	
	public static void main (String[] args) {
		BankAccount Nga = new BankAccount("1234", 100000, "Nguyen Viet Nga", "vietngaqhh@gmail.com"
				, "89219426101");
		System.out.println("Thong tin tai khoan:");
		System.out.println("So du tai khoan:"+ Nga.getAccountNumber());
		System.out.println("So du:" + Nga.getBalance());
		System.out.println("Ten tai khoan:" + Nga.getCustomeName());
		System.out.println("Email:" + Nga.getEmail());
		System.out.println("So dien thoai:" + Nga.getPhoneNumber());
		Nga.deposit(100000);
		Nga.withdrawn(50000);
		
	}
}
