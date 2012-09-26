package com.danielsiwiec.sort.strategies;

import java.util.ArrayList;
import java.util.List;


public class QuickSortStrategy implements SortStrategy {

	public List<Integer> sort(List<Integer> list) {
		if (list == null || list.size() < 2){
			return list;
		}
		int pivot = list.get(0);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		for (int i : list.subList(1, list.size())) {
			if (i < pivot)
				left.add(i);
			else
				right.add(i);
		}
		left = sort(left);
		right = sort(right);
		left.add(pivot);
		left.addAll(right);
		return left;
	}

}
