package adaptor.third_party_accounts;

public class BitcoinAccount implements ThirdPartyAccount {

	@Override
	public void translateBitcoinToCurrencyAndWithdrawal(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal: $"+amount+" from BitcoinAccount");
	}

	@Override
	public void translateCurrencyToBitcoinAnddeposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Deposit: $"+amount+" to BitcoinAccount");
	}

	@Override
	public void translateStockPriceToCurrencyAndWithdrawal(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Don't support this operation ... ");
	}

	@Override
	public void translateCurrencyToStockPriceAnddeposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Don't support this operation ... ");
	}

}