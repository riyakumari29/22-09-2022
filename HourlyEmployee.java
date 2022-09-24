package com.inh.bll;

public class HourlyEmployee extends Employee {

	   private double pay; // pay per hour
	   private double hours; // hours worked for week

	   // Parameterized constructor
	   public HourlyEmployee( String name, String designation, double hourlyPay, int hoursWorked )
	   {
	      super( name, designation );
	      setPay( hourlyPay ); // validate and store hourly pay
	      setHours( hoursWorked ); // validate and store hours worked
	   } 

	   
	   public void setPay( double hourlyPay )
	   {
	     if((hourlyPay>=500)&&(hourlyPay<=1000))
	    	 pay=hourlyPay;
	     else
	    	 throw new IllegalArgumentException(" salary must be greater then 500" );
	      //Exception occur 
	   } 

	  
	   public double getPay()
	   {
	      return pay;
	   } 
	   
	   public void setHours( int hoursWorked )
	   {
	     if( ( hoursWorked >= 84) && ( hoursWorked <= 168 ) )
	    	 hours=hoursWorked;
	  
	   } 
	   public double getHours()
	   {
	      return hours;
	   } 
	   public double calculatePay()
	   {
	     
	         return getPay() * getHours();
	     
	   }
	                                        

	   
	@Override
	public String toString() {
		return "HourlyEmployee [ Name=" + getName() + ", Designation="+ getDesignation()+" , pay=" + pay + ", hours=" + hours + "]";
	} 
	   
	   
}
	
