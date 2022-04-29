package base;

import java.time.LocalDate;

public class CreditCard extends Card {
	private int limit;

	public CreditCard(String owner, LocalDate validity, Bank bank, int balance, int limit) {
		super(owner, validity, bank, balance);
		this.limit = limit;
	}
	
	public CreditCard(String owner, LocalDate validity, Bank bank, int balance) {
		this(owner, validity, bank, balance, 100000);
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "CreditCard [limit=" + limit + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean withdraw(int amount) {
		if (!getValidity().isBefore(LocalDate.now())) {
			if (getBalance() >= amount) {
				setBalance(getBalance()-amount);
				return true;
			}
			else if (getBalance() + limit >= amount) {
				setLimit(limit-(amount-getBalance()));
				setBalance(0);
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
