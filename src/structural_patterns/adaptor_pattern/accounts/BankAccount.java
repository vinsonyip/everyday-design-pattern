package structural_patterns.adaptor_pattern.accounts;

public interface BankAccount {
	public void withdrawal(String accountType, int amount);
	public void deposit(String accountType, int amount);
}
