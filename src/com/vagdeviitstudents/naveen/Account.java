package com.vagdeviitstudents.naveen;

public class Account {

	private String Acname;
	private Double balance;

	public void BankAccount(String Acname, Double balance) {
		this.Acname = Acname;
		this.balance = balance;
	}// constructor

	public String getAcname() {
		return Acname;
	}

	public double balance() {
		return balance;
	}
// as Double with parameter amount  as we can create new method with deposite and withdraw)

	public void deposite(Double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException(" Amount should be greater then zero");
		}
		balance += amount;

	}

	public void withdraw(Double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException(" Amount should be greater then zero");
		}
		balance -= amount;
	}

	public class Top {
		public static void main(String[] a) {

			double f = 10.0;

			// float f1=10.4;
			System.out.println(f);
			Account account1 = new Account();
			account1.BankAccount("raju", 100.90);
		}

//system.out.println("Acname:"+ accoun1.getAcname()+"Balance:"+account1.getdeposite());

	}
}
