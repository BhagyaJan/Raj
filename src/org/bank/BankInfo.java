 package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
		System.out.println("Savings Details");
	}
	
	private void fixed() {
		System.out.println("Fixed Deposit Details");
	}
	
	public void deposit() {
		System.out.println("BankInfo : Deposit Details");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BankInfo b= new BankInfo();
			b.saving();
			b.fixed();
			b.deposit();
	}

}
