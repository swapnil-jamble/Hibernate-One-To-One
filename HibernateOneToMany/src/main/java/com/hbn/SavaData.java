package com.hbn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Persistence;

public class SavaData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank b = new Bank();
			b.setBid(123);
		    b.setBname("SBI");
		    b.setIfsc(3282375);
		    
		Account account1 = new Account();
		    account1.setAno(1);
		    account1.setAid(1000);
		    account1.setAbal(10000);
		    
	    Account account2 = new Account();
		    account2.setAno(2);
		    account2.setAid(2000);
		    account2.setAbal(20000);
		    
	    Account account3 = new Account();
		    account3.setAno(3);
		    account3.setAid(3000);
		    account3.setAbal(30000);
		    
		List<Account> list = new ArrayList<Account>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		
		b.setAccount(list);
		
		et.begin();
		em.persist(b);
		em.persist(account1);
		
		
		em.persist(account2);
		em.persist(account3);
		et.commit();
		
		System.out.println("Data Saved Successfully");
				
	}

}
