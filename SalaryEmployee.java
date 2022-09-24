package com.inh.bll;

public class SalaryEmployee extends Employee{
		
	private double weeklysalary;
	// Parameterized constructor
		public SalaryEmployee(String name,String designation,  double salary)
		{
			super(name,designation);
			setWeeklySalary( salary );
	      
		}
		public void setWeeklySalary(double salary) {
		if ( salary >=3000.0 )
                  weeklysalary = salary;
		 else
	    	 throw new IllegalArgumentException("Weekly salary must be greater then 500" );
		         //Exception occur  
		}
		public double getWeeklySalary()
	      {
	    	  return weeklysalary;
	      } 
		
		@Override
		public double calculatePay() {
			
			return getWeeklySalary();
		}
		@Override
		public String toString() {
			return "Salary Employee [ Name=" + getName() + ", Designation="+ getDesignation()
			+ ", Weekly salary=" + weeklysalary +"]";
		}
		
	}