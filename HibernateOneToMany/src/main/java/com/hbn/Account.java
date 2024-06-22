package com.hbn;

import javax.persistence.*;

@Entity
public class Account {
	@Id
	private int ano;
	private int aid;
	private double abal;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public double getAbal() {
		return abal;
	}
	public void setAbal(double abal) {
		this.abal = abal;
	}
	
	

}
