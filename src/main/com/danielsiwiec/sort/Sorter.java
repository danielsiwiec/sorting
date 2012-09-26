package com.danielsiwiec.sort;

import java.util.List;

import com.danielsiwiec.sort.strategies.SortStrategy;

public class Sorter {

	public List<Integer> sort(List<Integer> integers, SortStrategy strategy) {
		return strategy.sort(integers);
	}

}
