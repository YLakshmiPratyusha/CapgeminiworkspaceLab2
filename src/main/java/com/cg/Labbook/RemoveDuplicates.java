/**
 * Create a method which accepts an integer array and removes all the duplicates
 * in the array. Return the resulting array in descending order
 */
package com.cg.Labbook;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    Scanner scanner = new Scanner(System.in);
	public void main(String[] args) {
	    int n=scanner.nextInt();
	    int arr[] = new int[n];
	    for(int index=0;index<n;index++)
	    arr[index]=scanner.nextInt();
	    int as[]=modifyArray(arr);
	    Arrays.sort(as);
	    for(int index=as.length-1;index>=0;index--)
	    	System.out.print(as[index]+" ");
		}
		public int[] modifyArray(int []ar){
			int len=ar.length;
			if(len==0)
				return ar;
			else if(len==1)
				return ar;
			else{
			int i=0;
			Arrays.sort(ar);
			for(int index=0;index<len-1;index++){
				if(ar[index]!=ar[index+1])
					ar[i++]=ar[index];
			}
			ar[i++]=ar[len-1];
			int a[]=new int[i];
			for(int index=0;index<i;index++){
			a[index]=ar[index];
			ar[index]=a[index];
			}
			return ar;
			}
		}
}