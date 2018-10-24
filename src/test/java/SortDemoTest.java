package test.java;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class SortDemoTest{
	SortDemoData data = new SortDemoData();


	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test
	public void testNumber() {
		data.initializeArray("20");
		assertTrue(data.myArray.length == 20);

		data.initializeArray("30");
		assertTrue(data.myArray.length == 30);

		data.initializeArray("0");
		assertTrue(data.myArray.length == 0);
	}


	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NegativeArraySizeException.class)
	public void negativeArraySize() {
		data.initializeArray("-3");  
	}

	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NonIntegerValue() {
		data.initializeArray("5.5 7 9");  
	}

	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.util.NoSuchElementException.class)
	public void NoSuchElem() {
		data.initializeArray("");  
	}

	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test (expected=java.lang.NumberFormatException.class)
	public void NoNumber() {
		data.initializeArray("5 8 y 4");  
	}

	/**
	 * testNewAccountsType checks for valid input types in the 1st parameter
	 */
	@Test
	public void SameNumber() {
		data.initializeArray("4 64 5");  

		SortDemoData data2 = new SortDemoData();
		data2.initializeArray("5 64 4");
		assertTrue(data.myArray.length == data2.myArray.length);
		List<Integer> list = new ArrayList<Integer>();

		list.add(data.myArray[0].key);
		list.add(data.myArray[1].key);
		list.add(data.myArray[2].key);

		assertTrue(list.contains(data2.myArray[0].key));
		assertTrue(list.contains(data2.myArray[1].key));
		assertTrue(list.contains(data2.myArray[2].key));
	}

}