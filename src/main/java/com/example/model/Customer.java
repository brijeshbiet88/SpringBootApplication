package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

public class Customer {
	
	private String id;
	private String name;
	private int age;
	private String accountNo;
	private String accountType;
	private double balance;
	
	
	public Customer(String id ,String name, int age, String accountNo, String accountType, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
