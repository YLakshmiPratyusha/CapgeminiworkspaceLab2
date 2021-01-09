/**
 * Create a method which accepts an array of integer elements and return the second smallest element in the array
 */
package com.cg.Labbook;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class lab {
	
	private labTest secondsmallnum;
	
        @Before
        public void setup()
        {
        	secondsmallnum=new labTest();
        }
        
	@Test
	public void getArrayof_integerElementsAsEmptyArray_Andreturn0asInteger() {
		
		int str[]= {};
		int arr=secondsmallnum.getlabTest(str);
		assertEquals(0,arr);
	
	}
	
	@Test
	public void getArrayof_integerElementsAs1Array_Andreturn1asInteger() {
		
		int str[]= {1};
		int arr=secondsmallnum.getlabTest(str);
		assertEquals(str[0],arr);
	}
		@Test
		public void getArrayof_integerElementsAs_morethan2Array_AndreturnSecondsmallestasInteger() {
			
			int str[]= {25,3};
			int arr=secondsmallnum.getlabTest(str);
			assertEquals(25,arr);
		
		}


}