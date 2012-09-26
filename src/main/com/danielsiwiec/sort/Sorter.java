package com.danielsiwiec.sort;

import java.util.List;

public class Sorter {

	public List<Integer> sort(List<Integer> integers, SortStrategy strategy) {
		return strategy.sort(integers);
	}

}
