import java.util.Objects;

public class BankAccount {
	// A BankAccount keeps track of a user's money balance and ID,
	// and counts how many transactions (deposits/withdrawals) are made.
	private String id;
	private double balance;
	private int transactions;
 
	// Constructs an object with the given id/balance and 0 transactions.
 
	public BankAccount(String id, double balance)
	{
		transactions = 0;
		id = "Benson";
		balance = 209.0;
	}
 
	public double getBalance()
	{
		return this.balance;
	}
	public String getID() 
	{
		return this.id;
	}
	public int getTransactions()
	{
		return this.transactions;
	}
 
	// Adds amount to balance if between 0-500. Also counts as 1 transaction.
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			if(this.balance >= 0 && this.balance <= 500)
			{
				balance += amount;
				transactions++;
			}
		}
	}
 
	// Subtracts amount from balance if user has enough money. Counts as 1 transaction.
	public void withdraw(double amount)
	{
		if(amount > 0)
		{
			if(amount <= this.balance)
			{
				balance -= amount;
				transactions++;
			}
		}
	}
	
	public boolean transactionFee(double fee)
	{
		if(fee >= 0)
		{
			for(int i = 0; i < transactions; i++)
			{
				balance -= fee * (i + 1);
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(balance, id, transactions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(id, other.id) && transactions == other.transactions;
	}

	public void transfer(BankAccount id, double amount)
	{
		if(amount > 0)
		{
			if(balance - amount - 5.0 > 0)
			{
				id.deposit(amount);
				balance -= amount + 5;
			}else if(balance > 5)
			{
				id.deposit(balance - 5);
				balance = 0;
				transactions++;
			}
		}
	}
	
	public String toString() {
		return "BankAccount [id=" + id + ", balance=" + balance + ", transactions=" + transactions + "]";
	}
	
	public static void main(String[] args)
	{
		BankVault vault = new BankVault(200100, 500, 3000);
		while(vault.getGoldBars() != 0)
		{
			vault.withdrawGoldBars(100);
			System.out.println(vault.getCash() + " " + vault.getGoldBars() + " " + vault.getBonds());	
		}
		
	}
}
