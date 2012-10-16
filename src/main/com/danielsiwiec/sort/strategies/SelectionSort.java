package com.danielsiwiec.sort.strategies;

import java.util.Collections;
import java.util.List;

public class SelectionSort implements SortStrategy {

	public List<Integer> sort(List<Integer> list) {
		if (list == null || list.size() < 2) {
			return list;
		}
		for (int index = 0; index < list.size(); index++) {
			int minimumIndex = findMinimumAfterIndex(list, index);
			Collections.swap(list, index, minimumIndex);
		}
		return list;
	}

	private int findMinimumAfterIndex(List<Integer> list, int startIndex) {
		int minimumIndex = startIndex;
		for (int index = startIndex; index < list.size(); index++) {
			minimumIndex = list.get(index) < list.get(minimumIndex) ? index
					: minimumIndex;
		}
		return minimumIndex;
	}

}
