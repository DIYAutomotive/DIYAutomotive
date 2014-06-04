package edu.neumont.diyauto.Services;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import edu.neumont.diyauto.Models.Account;
import edu.neumont.diyauto.Models.Role;

@Stateless
@LocalBean
@Local(AccountService.class)
public class AccountDbService implements AccountService {
	@PersistenceContext(name="university")
	private EntityManager em;
	
	public Account getAccountByUsername(String username) {
		return (Account)em.createNamedQuery("byUsername")
				.setParameter("username", username).getSingleResult();
	}
	
	public Account getAccount(Long id) {
		return em.find(Account.class, id);
	}
	
	public void updateAccount(Account account) {
		// here is where we would check the password, etc.

		// add the appropriate role
//		if ( !account.hasRole(Role.USER) ) {
//			account.addRole(Role.USER);
//		}
		
		em.persist(account);	
	}
}
