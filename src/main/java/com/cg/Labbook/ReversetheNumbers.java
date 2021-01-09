/**
 * Create a method which accepts an integer array, reverse the numbers in the array and 
 * returns the resulting array in sorted order
 */
package com.cg.Labbook;

public class ReversetheNumbers {
	
	
	
	public int getSorted(int[] arr)
	{
		if(arr.length==0)
		{
			return 0;
		}
		else if(arr.length==1)
		{
			return 1;
		}
		else
		{
	int rem=0,rev=0;
	int in=0;
	int stored[]=new int[1000];
	for(int i=0;i<arr.length;i++)
	{
		rev=0;
		while(arr[i]!=0)
		{
			rem=arr[i]%10;
			rev=(rev*10)+rem;
			arr[i]=arr[i]/10;
		}
		stored[in]=rev;
		in++;
	}
	int temp=0;
	for(int i=0;i<in;i++)
	{
		for(int j=i+1;j<in;j++)
		{
			if(stored[i]>stored[j])
			{
				temp=stored[i];
				stored[i]=stored[j];
				stored[j]=temp;
			}
		}	
	}
	return 0;
		}

}
}