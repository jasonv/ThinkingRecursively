package com.jasonv.recursionaversion;

public class CountFromOneToTen 
{
	public static void main(String args[])
	{
		System.out.print(countToN(10));
	}
	
	public static String countToN(int n)
	{
		if(n>1)
		{
			return countToN(n-1) + n + "\n";
		}
		else
		{
			return n + "\n";			
		}
			
	}

}
