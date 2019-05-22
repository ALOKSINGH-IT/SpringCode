package com.bm.beans;

public class EmiCal 

{

	Cache cache;
	
	
	public void setCache(Cache cache) {
		this.cache = cache;
	}


	public Double getEmi(Double principal,int tenure,String company )
	{
		 int time=tenure*12;
		double ri=0;
		
	    ri= cache.get(company);
	    System.out.println("riii=="+ri);
		
	    ri=ri/(12*100);
	    
	    Double emi= (principal*ri*Math.pow(1+ri,time))/(Math.pow(1+ri,time)-1);

		
		return emi;
	}
	
	
}
