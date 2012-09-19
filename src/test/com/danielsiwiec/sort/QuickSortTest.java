package com.danielsiwiec.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.danielsiwiec.sort.QuickSort;

public class QuickSortTest {

	@Test
	public void test() {
		Integer[] array = {3,2,1};
		List<Integer> sorted = QuickSort.sort(Arrays.asList(array));
		assertEquals(3,sorted.size());
	}

}
