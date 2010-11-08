package com.jasonv.recursionaversion;

public class FromNestedLoopsToRecursion 
{
	public static void main(String args[])
	{
		nestedLoops(4,new int[] {2,2,2,2});
	}
	
	public static int nestedLoops(int numberOfLoops,int values[])
	{
		int currentIndex = (values.length - numberOfLoops);
		int goodMoves = 0;
		if(numberOfLoops==0)
		{
			for(int value:values) System.out.format("%5d",value);
			System.out.println();
			goodMoves++;
			return goodMoves;
		}
		else
		{
			goodMoves += nestedLoops(numberOfLoops-1,values);
		}
		
		if(values[currentIndex]>1)
		{
			int localValues[] = values.clone();
			localValues[currentIndex]--;
			goodMoves += nestedLoops(numberOfLoops,localValues);
		}
		return goodMoves;
	}
}
