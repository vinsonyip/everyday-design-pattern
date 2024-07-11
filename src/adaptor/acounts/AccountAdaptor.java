package adaptor.acounts;

import adaptor.third_party_accounts.BitcoinAccount;
import adaptor.third_party_accounts.StockAccount;
import adaptor.third_party_accounts.ThirdPartyAccount;

public class AccountAdaptor implements BankAccount {
	
	ThirdPartyAccount thirdPartyAccount;
	
	public AccountAdaptor (String accountType) {
		if(accountType.equalsIgnoreCase("BitcoinAccount")) {
			thirdPartyAccount = new BitcoinAccount();
		}else if(accountType.equalsIgnoreCase("StockAccount")) {
			thirdPartyAccount = new StockAccount();
		}
	}

	public void withdrawal(String accountType, int amount) {
		// TODO Auto-generated method stub
		if(accountType.equalsIgnoreCase("BitcoinAccount")) {
			thirdPartyAccount.translateBitcoinToCurrencyAndWithdrawal(amount);
		}else if(accountType.equalsIgnoreCase("StockAccount")) {
			thirdPartyAccount.translateStockPriceToCurrencyAndWithdrawal(amount);
		}
	}

	@Override
	public void deposit(String accountType, int amount) {
		if(accountType.equalsIgnoreCase("BitcoinAccount")) { 
			thirdPartyAccount.translateCurrencyToBitcoinAnddeposit(amount);
		}else if(accountType.equalsIgnoreCase("StockAccount")) {
			thirdPartyAccount.translateCurrencyToStockPriceAnddeposit(amount);
		}

	}

}
