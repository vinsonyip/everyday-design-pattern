package adaptor.third_party_accounts;

public interface ThirdPartyAccount {
	public void translateBitcoinToCurrencyAndWithdrawal(int amount);
	public void translateCurrencyToBitcoinAnddeposit(int amount);
	
	public void translateStockPriceToCurrencyAndWithdrawal(int amount);
	public void translateCurrencyToStockPriceAnddeposit(int amount);
}
