package com.wipro.bank.acc;
public class RDAccount extends Account
{
	public RDAccount(int tenure, float principal) 
	{ 
		this.tenure=tenure; 
		this.principal=principal; 
	} 
	@Override
	public float calculateInterest() 
	{
		float r=rateOfInterest/100;
		int n=4;
		float t = (tenure*12)/12f;
		float p = 0.0f;
		int tn = (int) (t*12);
		for(int i=0;i<tn;i++)
		{
			p += principal* (float)(Math.pow(1+(r/n),n*((tn-i)/12.0))-1);
		}
		return p;
		
	}
	//P * (((1+r/n)^n*t) - 1)
	@Override
	public float calculateAmountDeposited() 
	{
		// TODO Auto-generated method stub
		return principal*tenure*12;
	}

}
