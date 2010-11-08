package com.jasonv.recursionaversion;

public class CreateIntArrayFromOneToTen 
{
	public static void main(String args[])
	{
		for(int number:createIntArrayForNumbersUpToN(10))
		{
			System.out.println(number);
		}
	}
	
	public static int[] createIntArrayForNumbersUpToN(int i) 
	{
		if(i==1)
		{
			return new int[] {1};
		}
		else
		{
			return concat(createIntArrayForNumbersUpToN(i-1),new int[] {i});			
		}
	}
	
	public static int[] concat(int[] A, int[] B) 
	{
		   int[] C= new int[A.length+B.length];
		   System.arraycopy(A, 0, C, 0, A.length);
		   System.arraycopy(B, 0, C, A.length, B.length);
		   return C;
	}

}
