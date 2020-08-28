package com.wipro.bank.service;
import com.wipro.bank.acc.*;
import com.wipro.bank.acc.RDAccount; 
import com.wipro.bank.exception.BankValidationException;
public class BankService 
{
	public boolean validateData(float principal, int tenure,int age, String gender)
	{
		boolean value=false;
		try
		{
			if(principal<500 || (tenure!=5 && tenure!=10) || ((!gender.equalsIgnoreCase("male")&&(!gender.equalsIgnoreCase("female"))) ||((age<1)||(age>100))))
					{
				throw new BankValidationException();
					}
			value=true;
			
		}
		catch(BankValidationException e)
		{
			System.out.println(e);
		}
		return value;
	}

	public void calculate(float principal,int tenure, int age, String gender)
	{
		if(validateData(principal,tenure,age,gender)==true)
		{
			Account ac=new RDAccount(tenure,principal);
			ac.setInterest(age,gender);
			System.out.println(ac.calculateInterest());
			System.out.println(ac.calculateAmountDeposited());
			System.out.println(ac.calculateMaturityAmount(principal,ac.getRateOfInterest()));			
		}
	}


}
