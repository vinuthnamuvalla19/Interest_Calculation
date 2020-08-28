package com.wipro.bank.main;
import com.wipro.bank.service.BankService;
public class MainClass {

	public static void main(String[] args) 
	{
		 int tenure = 5;
	        float principal = 1000;
	        int age = 23;
	        String gender = "Male";
	        BankService b=new BankService();
	        b.calculate(principal, tenure, age, gender);
	        System.out.println();
	        b.calculate(456, 6, 45, "female");
	        System.out.println();
	        b.calculate(556, 6, 45, "female");
	        System.out.println();
	        b.calculate(556, 10, 45, "female"); 
	        System.out.println();
	        b.calculate(9858, 5, 0, "male");
	        System.out.println();
	        b.calculate(9858, 5, 101, "male");
	        System.out.println();
	        b.calculate(9858, 5, 05, "m");
	        System.out.println();
	        b.calculate(9858, 5, 05, "f");
	        System.out.println();
	        b.calculate(9858, 5, -5, "m");
	         System.out.println();
	        b.calculate(9858, -5, 05, "male");
	         System.out.println();
	        b.calculate(10000, 10, 55, "male");
	         System.out.println();
	        b.calculate(10000, 10, 60, "male");
	         System.out.println();
	        b.calculate(10000, 10, 55, "female");
	         System.out.println();
	        b.calculate(10000, 10, 58, "female"); 
	         System.out.println();
	        b.calculate(10000, 10, 100, "female"); 
	        System.out.println();
	       b.calculate(10000, 9, 100, "female");
	}

}
