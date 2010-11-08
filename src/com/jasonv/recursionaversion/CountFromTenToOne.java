package com.jasonv.recursionaversion;

public class CountFromTenToOne 
{
	public static void main(String args[])
	{
		System.out.print(countToN(10));
	}
	
	public static String countToN(int n)
	{
		if(n>1)
		{
			return n + "\n" + countToN(n-1);
		}
		else
		{
			return n + "\n";			
		}
			
	}

}
