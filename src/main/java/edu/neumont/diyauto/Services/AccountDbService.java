package edu.neumont.diyauto.Services;

import edu.neumont.diyauto.Models.AccountModel;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
@Local(AccountService.class)
public class AccountDbService implements AccountService {
	@PersistenceContext(name="university")
	private EntityManager em;

	public AccountModel getAccountByUsername(String username) {
		return (AccountModel)em.createNamedQuery("byUsername")
				.setParameter("username", username).getSingleResult();
	}
	
	public AccountModel getAccount(Long id) {
		return em.find(AccountModel.class, id);
	}
	
	public void updateAccount(AccountModel account) {
		// here is where we would check the password, etc.

		// add the appropriate role
//		if ( !account.hasRole(Role.USER) ) {
//			account.addRole(Role.USER);
//		}
		
		em.persist(account);	
	}
}
