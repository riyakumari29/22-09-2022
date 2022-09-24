package com.inh.pll;
import com.inh.bll.HourlyEmployee;
import com.inh.bll.SalaryEmployee;

public class TestEmployee {
	public static void main(String[] args) {
        
		
		 System.out.println("**********************************************************************************************");
		 
		 System.out.println("					Salary Detail's					 ");
		 System.out.println("**********************************************************************************************");
			//Salary of the Employee
		 SalaryEmployee sal_Emp =new SalaryEmployee("Sahil", "Programmer",5000);
		
		 
		 //Weekly Salary of the employee
		 HourlyEmployee hour_Emp=new HourlyEmployee("Pinki","Nurse",1000,138);
		
		System.out.println(sal_Emp);
		System.out.println(hour_Emp);

	}
}
