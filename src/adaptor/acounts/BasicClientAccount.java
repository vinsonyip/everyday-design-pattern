package adaptor.acounts;

public class BasicClientAccount implements BankAccount {
	
	@Override
	public void withdrawal(String accountType, int amount) {
		if(accountType.equalsIgnoreCase("BasicAccount")) {
			System.out.println("Withdrawal: $"+amount+" from BasicClientAccount");
		}else if(accountType.equalsIgnoreCase("BitcoinAccount") || accountType.equalsIgnoreCase("StockAccount")) {
			AccountAdaptor accountAdaptor = new AccountAdaptor(accountType);
			accountAdaptor.withdrawal(accountType, amount);
		}else {
			System.out.println("Don't support this kind of account");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(String accountType, int amount) {
		// TODO Auto-generated method stub
		if(accountType.equalsIgnoreCase("BasicAccount")) {
			System.out.println("Deposit: $"+amount+" to BasicClientAccount");
		}else if(accountType.equalsIgnoreCase("BitcoinAccount") || accountType.equalsIgnoreCase("StockAccount")) {
			AccountAdaptor accountAdaptor = new AccountAdaptor(accountType);
			accountAdaptor.deposit(accountType, amount);
		}else {
			System.out.println("Don't support this kind of account");
		}
		
	}

}
