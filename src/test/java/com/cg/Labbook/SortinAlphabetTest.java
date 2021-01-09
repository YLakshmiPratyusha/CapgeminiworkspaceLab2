package com.cg.Labbook;


import static org.junit.Assert.*;

import org.junit.Test;

public class SortinAlphabetTest {
	
	private SortinAlphabet stringsort;
	

	@Test
	public void getArrayofElement_asEmptyString_andreturn0asInteger () {
		stringsort=new SortinAlphabet();
		String[] arr= {};
		String val=stringsort.sortStrings(arr);
		assertEquals(0,Integer.parseInt(val));

	}
	@Test
	public void getArrayofElement_as1String_andreturn1asInteger () {
		stringsort=new SortinAlphabet();
		String[] arr= {"java"};
		String val=stringsort.sortStrings(arr);
		//assertEquals("1",Integer.parseInt(val));
		assertEquals("1",val);

	}

}