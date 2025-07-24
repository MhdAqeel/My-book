public class CheckingAccount extends BankAccount
{
	public  CheckingAccount(double balance)
	{
		super(balance);
	}
	@Override
	public String deposit(double amount)
	{
		double b=super.getBalance();
		b=b+amount;
		super.updateBalance(b);
		return ("CheckingAccount\nSuccessfully deposited Rs "+amount+"\nBalance = Rs "+b);
	}
	@Override
	public String withdraw(double amount)
	{
		double b=super.getBalance();
		if(b>=amount)
		{
			b=b-0.1*amount-amount;
			super.updateBalance(b);
			return ("CheckingAccount\nSuccessfully withdraw Rs "+amount+"\nBalance = Rs "+b);
		}
		else
			return ("CheckingAccount\nLow balance , You can't withdraw Rs "+amount);
	}
}