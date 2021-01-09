package com.cg.Labbook;

public class labTest {
	
	
	public int getlabTest(int[] arr)
	{
		System.out.print(arr.length);
		if(arr.length==0)
		{
			return 0;
		}
		else if(arr.length==1)
		{
			return arr[0];
		}
		else
		{
		int str=arr.length;
		int temp=0;
		for(int i=0;i<str;i++ )
		{
			for(int j=i+1;j<str;j++)
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr[1];
	}
	}
}