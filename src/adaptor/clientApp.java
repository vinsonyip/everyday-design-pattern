package adaptor;

import adaptor.acounts.BasicClientAccount;

public class clientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicClientAccount basicClientAccount = new BasicClientAccount();
		basicClientAccount.deposit("BitcoinAccount", 10);
		basicClientAccount.withdrawal("StockAccount", 10);
		basicClientAccount.deposit("BasicClientAccount", 100);
		basicClientAccount.deposit("BasicAccount", 100);
	}

}
