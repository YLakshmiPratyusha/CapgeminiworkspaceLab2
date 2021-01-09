package com.cg.Labbook;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class ReversetheNumbersTest {

	private ReversetheNumbers revNum;
	
    @Before
    public void setup()
    {
     revNum=new ReversetheNumbers();
    }
    
@Test
public void getArrayof_integerElementsAsEmptyArray_Andreturn0asInteger() {
	
	int str[]= {};
	int arr=revNum.getSorted(str);
	assertEquals(0,arr);

}

@Test
public void getArrayof_integerElementsAs1Array_Andreturn1asInteger() {
	
	int str[]= {1};
	int arr=revNum.getSorted(str);
	assertEquals(str[0],arr);
}
}