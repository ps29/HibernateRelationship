package com.itglance.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_Table")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankid;
	private int bankacc;

	
	public Bank(int bankacc) {
		super();
		this.bankacc = bankacc;
	}

	public Bank(int bankid, int bankacc) {
		super();
		this.bankid = bankid;
		this.bankacc = bankacc;
	}

	public Bank() {
		super();
	}

	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		this.bankid = bankid;
	}

	public int getBankacc() {
		return bankacc;
	}

	public void setBankacc(int bankacc) {
		this.bankacc = bankacc;
	}

	@Override
	public String toString() {
		return "Bank [bankid=" + bankid + ", bankacc=" + bankacc + "]";
	}

}
