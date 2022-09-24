package com.inh.bll;

public interface BankAccount {
	
	public double  getBalance();
	
	public void deposit(double amount);	
	
	public boolean withdraw(double amount);
  //three interface methods

}