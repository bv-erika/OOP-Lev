package base;

import java.time.LocalDate;

public class Card {
	public enum Bank {OTP, KANDH, ERSTE, CIB} 
	
	private String owner;
	private LocalDate validity;
	private Bank bank;
	private int balance;
	
	public Card(String owner, LocalDate validity, Bank bank, int balance) {
		super();
		this.owner = owner;
		this.validity = validity;
		this.bank = bank;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public Bank getBank() {
		return bank;
	}

	@Override
	public String toString() {
		return "Card [owner=" + owner + ", validity=" + validity + ", bank=" + bank + ", balance=" + balance + "]";
	}
	
	public boolean withdraw(int amount) {
		if (!validity.isBefore(LocalDate.now())) {
			if (balance >= amount) {
				balance -= amount;
				return true;
			}
			else {
				return false;
			}
		}	
		else {
			return false;
		}
	}

}
