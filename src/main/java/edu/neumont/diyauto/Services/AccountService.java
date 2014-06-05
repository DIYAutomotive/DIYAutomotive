package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.AccountModel;

public interface AccountService {
	public AccountModel getAccountByUsername(String username);
	public AccountModel getAccount(Long id);
	public void updateAccount(AccountModel account);
}