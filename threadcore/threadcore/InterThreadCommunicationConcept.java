package com.csi.threadcore;

class Customer {
	int accountBalance = 10000;

	synchronized public void withdrawMoney(int amount) {
		System.out.println("Going to withdraw-> INR 15000/-");

		if (this.accountBalance < amount) {
			System.out.println("Insufficients Funds please wait to deposit money");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.accountBalance -= accountBalance;

		System.out.println("Amount Withdraw Successfully");
	}

	synchronized public void depositMoney(int amount) {

		System.out.println("Going to deposit money INR 25000/-");

		this.accountBalance += accountBalance;
		System.out.println("Money Deposited Successfully");
		notify();
	}
}

public class InterThreadCommunicationConcept {
	public static void main(String[] args) {

		Customer cc = new Customer();

		new Thread() {
			public void run() {

				cc.withdrawMoney(15000);
			};
		}.start();

		new Thread() {
			public void run() {

				cc.depositMoney(25000);
			};
		}.start();
	}
}
