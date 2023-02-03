package Oops;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw" + amount);
		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
				System.out.print(e);
			}
		} // if
		this.amount -= amount;
		System.out.println("withdraw completed...\n"+"Balance:"+this.amount);
	}// withdraw

	synchronized void deposit(int amount) {
		System.out.println("going to deposit " + amount);
		this.amount += amount;
		System.out.println("deposit completed... "+this.amount);
		notify();
	} // deposit
}// Customer

class Test {
	public static void main(String args[]) {
		Customer c = new Customer();
		new Thread() {
			public void run() {
				System.out.println("Withdraw Started\n");
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("Deposit Started\n");

				c.deposit(10000);
			}
		}.start();
	}// main
}// Test