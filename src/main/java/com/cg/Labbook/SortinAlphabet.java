/**
 * Create a method that can accept an array of String objects and sort in alphabetical order.
 * The elements in the left half should be completely in uppercase and the elements in the right
 * half should be completely in lower case. Return the resulting array.
 */
package com.cg.Labbook;

import java.util.Arrays;

public class SortinAlphabet {
	
	public String sortStrings(String[] arr1)
	{
		//System.out.print(arr1.length);
		if(arr1.length==0)
		{
			return Integer.toString(arr1.length);
		}
		else if(arr1.length==1)
		{
			//System.out.print(arr1.toString().toUpperCase());
			return Integer.toString(1);
//			return 1;
			//return arr1.toString().toUpperCase();
		}
		
		else
		{
		String[] arr=arr1;
	Arrays.sort(arr);
	int len=arr.length;
	System.out.print(len);
	if(len%2==0)
	{
		for(int i=0;i<len/2;i++)
		{
			System.out.println(arr[i].toUpperCase());
		}
		for(int i=len/2;i<len;i++)
		{
			System.out.println(arr[i].toLowerCase());
		}
	}
	else
	{
		for(int i=0;i<(len/2)+1;i++)
		{
			System.out.println(arr[i].toUpperCase());
		}
		for(int i=(len/2)+1;i<len;i++)
		{
			System.out.println(arr[i].toLowerCase());
		}

	}
		}
	return null;
		}
	
		}