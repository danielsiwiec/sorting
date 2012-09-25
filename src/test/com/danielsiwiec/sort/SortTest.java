package com.danielsiwiec.sort;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SortTest {

	private SortStrategy strategy = new MergeSort();
	private Sorter sorter = new Sorter();

	@Test
	public void simpleTest() {
		Integer[] array = {3,2,1};
		List<Integer> sorted = sorter.sort(Arrays.asList(array), strategy);
		assertNotNull(sorted);
		assertEquals(3,sorted.size());
		assertEquals(1,(int)sorted.get(0));
		assertEquals(2,(int)sorted.get(1));
		assertEquals(3,(int)sorted.get(2));
	}
	
	@Test
	public void acceptsNullList(){
		List<Integer> sorted = sorter.sort(null, strategy);
		assertNull(sorted);
	}
	
	@Test
	public void acceptsEmptyList(){
		List<Integer> sorted = sorter.sort(new ArrayList<Integer>(), strategy);
		assertNotNull(sorted);
		assertEquals(0,sorted.size());
	}
	
	@Test
	public void sorts(){
		Integer[] array = {2,1,9,3,4,8,0,5,10,6};
		Sorter sorter = new Sorter();
		List<Integer> sorted = sorter.sort(Arrays.asList(array), strategy);
		assertNotNull(sorted);
		assertEquals(10,sorted.size());
		assertEquals(0,(int)sorted.get(0));
		assertEquals(1,(int)sorted.get(1));
		assertEquals(2,(int)sorted.get(2));
		assertEquals(3,(int)sorted.get(3));
		assertEquals(4,(int)sorted.get(4));
		assertEquals(5,(int)sorted.get(5));
		assertEquals(6,(int)sorted.get(6));
		assertEquals(8,(int)sorted.get(7));
		assertEquals(9,(int)sorted.get(8));
		assertEquals(10,(int)sorted.get(9));
	}

}