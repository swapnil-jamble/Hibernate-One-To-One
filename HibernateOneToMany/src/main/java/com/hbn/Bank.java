package com.hbn;

import java.util.List;

import javax.persistence.*;

@Entity
public class Bank {
	@Id
    private int bid;
	private String bname;
	private int ifsc;
	
	@OneToMany
	List<Account> account;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getIfsc() {
		return ifsc;
	}

	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

}
