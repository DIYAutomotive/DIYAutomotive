package edu.neumont.diyauto.Services;

public interface AccountService {
	public Account getAccountByUsername(String username);
	public Account getAccount(Long id);
	public void updateAccount(Account account);
}