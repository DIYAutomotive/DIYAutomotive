package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.Account;

public interface AccountService {
	public Account getAccountByUsername(String username);
	public Account getAccount(Long id);
	public void updateAccount(Account account);
}