package test.java;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.junit.Before;
import org.junit.BeforeClass;
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



	// TODO: Include your test cases below

	public boolean compareArrayValues(Item[] array1, Item[] array2) {
		boolean result = true;
		for(int i = 0; i < array1.length; i++) {
			result = result & (array1[i].key == array2[i].key);
		}
		return result;
	}
	
	/**
	 * N0. Node coverage test cases for bubbleSort
	 */
	@Test
	public void bubbleSortTest() {
		try{
			SortAlgos.bubbleSort(null);
		}catch(NullPointerException ne) {
			assertTrue(true);
		}

		SortDemoData data2 = new SortDemoData();
		SortDemoData data3 = new SortDemoData();
		SortDemoData data4 = new SortDemoData();
		SortDemoData data5 = new SortDemoData();
		SortDemoData data6 = new SortDemoData();
		SortDemoData data7 = new SortDemoData();

		data2.initializeArray("0");
		data3 = data2;
		data2.runAlgo(90);

		data4.initializeArray("1 6 8");
		data5 = data4;
		data4.runAlgo(0);

		data6.initializeArray("6 2 7");
		data7.initializeArray("2 6 7");
		data6.runAlgo(0);

		assertTrue(compareArrayValues(data2.myArray, data3.myArray));
		assertTrue(compareArrayValues(data4.myArray, data5.myArray));
		assertTrue(compareArrayValues(data6.myArray, data7.myArray));
	}

	/**
	 * C1. Condition coverage test cases for selectionSort
	 */
	@Test
	public void selectionSortTest() {
		try{
			SortAlgos.selectionSort(null);
		}catch(NullPointerException ne) {
			assertTrue(true);
		}

		SortDemoData data2 = new SortDemoData();
		SortDemoData data3 = new SortDemoData();
		SortDemoData data4 = new SortDemoData();
		SortDemoData data5 = new SortDemoData();
		SortDemoData data6 = new SortDemoData();
		SortDemoData data7 = new SortDemoData();

		data2.initializeArray("0");
		data3 = data2;
		data2.runAlgo(1);

		data4.initializeArray("8 5");
		data5.initializeArray("5 8");
		data4.runAlgo(1);

		data6.initializeArray("5 8");
		data7 = data6;
		data6.runAlgo(1);

		assertTrue(compareArrayValues(data2.myArray, data3.myArray));
		assertTrue(compareArrayValues(data4.myArray, data5.myArray));
		assertTrue(compareArrayValues(data6.myArray, data7.myArray));
	}

	/**
	 * C2. Condition coverage test cases for insertionSort
	 */
	@Test
	public void insertionSortTest() {
		try{
			SortAlgos.insertionSort(null);
		}catch(NullPointerException ne) {
			assertTrue(true);
		}

		SortDemoData data2 = new SortDemoData();
		SortDemoData data3 = new SortDemoData();
		SortDemoData data4 = new SortDemoData();
		SortDemoData data5 = new SortDemoData();
		SortDemoData data6 = new SortDemoData();
		SortDemoData data7 = new SortDemoData();

		data2.initializeArray("0");
		data3 = data2;
		data2.runAlgo(2);

		data4.initializeArray("1 6 8");
		data5 = data4;
		data4.runAlgo(2);

		data6.initializeArray("9 2 5");
		data7.initializeArray("2 5 9");
		data6.runAlgo(2);

		assertTrue(compareArrayValues(data2.myArray, data3.myArray));
		assertTrue(compareArrayValues(data4.myArray, data5.myArray));
		assertTrue(compareArrayValues(data6.myArray, data7.myArray));
	}

	/**
	 * E3. Edge coverage test cases for merge sort 
	 */
	@Test
	public void mergeSortTest() {
		try{
			SortAlgos.mergeSort(null);
		}catch(NullPointerException ne) {
			assertTrue(true);
		}

		SortDemoData data2 = new SortDemoData();
		SortDemoData data3 = new SortDemoData();
		SortDemoData data4 = new SortDemoData();
		SortDemoData data5 = new SortDemoData();

		data2.initializeArray("1");
		data3 = data2;
		data2.runAlgo(3);

		data4.initializeArray("2 8 6");
		data5.initializeArray("2 6 8");
		data4.runAlgo(3);

		assertTrue(compareArrayValues(data2.myArray, data3.myArray));
		assertTrue(compareArrayValues(data4.myArray, data5.myArray));
	}

	/**
	 * N40. Node coverage test cases for quickSort algo
	 */
	@Test(expected = NullPointerException.class)
	public void quickSortNullTest() {
		SortAlgos.quickSort(null);
	}
	
	/**
	 * N41. Node coverage test cases for quickSort algo
	 */
	@Test
	public void quickSortTest() {

		SortDemoData data2 = new SortDemoData();

		data.initializeArray("2 5 3 14 20 12 8");
		data2.initializeArray("2 3 5 8 12 14 20");
		data.runAlgo(4);
		assertTrue(compareArrayValues(data.myArray, data2.myArray));
	}

	/**
	 * C5. Condition coverage test cases for Heapsort algo
	 */
	@Test
	public void heapSortTest() {
		try{
			SortAlgos.heapSort(null);
		}catch(NullPointerException ne) {
			assertTrue(true);
		}

		SortDemoData data2 = new SortDemoData();
		SortDemoData data3 = new SortDemoData();
		SortDemoData data4 = new SortDemoData();
		SortDemoData data5 = new SortDemoData();
		SortDemoData data6 = new SortDemoData();
		SortDemoData data7 = new SortDemoData();
		SortDemoData data8 = new SortDemoData();
		SortDemoData data9 = new SortDemoData();

		data2.initializeArray("1");
		data3 = data2;
		data2.runAlgo(5);

		data4.initializeArray("6 8");
		data5 = data4;
		data4.runAlgo(5);

		data6.initializeArray("3 1 18");
		data7.initializeArray("1 3 18");
		data6.runAlgo(5);

		data8.initializeArray("18 5 3");
		data9.initializeArray("3 5 18");
		data8.runAlgo(5);

		assertTrue(compareArrayValues(data2.myArray, data3.myArray));
		assertTrue(compareArrayValues(data4.myArray, data5.myArray));
		assertTrue(compareArrayValues(data6.myArray, data7.myArray));
		assertTrue(compareArrayValues(data8.myArray, data9.myArray));

	}

}