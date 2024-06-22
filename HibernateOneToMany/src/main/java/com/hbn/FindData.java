package com.hbn;

import java.util.List;

import javax.persistence.*;


public class FindData {
public static void main(String[] args) {
	  EntityManagerFactory emf =  Persistence.createEntityManagerFactory("vikas");
	  EntityManager em = emf.createEntityManager();
	  
	  Bank b = em.find(Bank.class, 123);
	  
	  System.out.println(b.getBid());
	  System.out.println(b.getBname());
	  System.out.println(b.getIfsc());
	  
	  List<Account> accounts = b.getAccount();
	  for(Account account: accounts)
	  {
		  System.out.println("Account NO: "+account.getAno());
		  System.out.println("Account Id: "+account.getAid());
		  System.out.println("Account Bal: "+account.getAbal());
		  System.out.println();
		  
	  }
	  

}

}
