package com.danielsiwiec.sort.strategies;

import java.util.ArrayList;
import java.util.List;


public class MergeSortStrategy implements SortStrategy {

	public List<Integer> sort(List<Integer> integers) {
		if (integers == null || integers.size() < 2) {
			return integers;
		}
		int split = integers.size() / 2;
		List<Integer> left = sort(integers.subList(0, split));
		List<Integer> right = sort(integers.subList(split,
				integers.size()));
		List<Integer> merge = mergeSplits(left, right);
		return merge;
	}

	private List<Integer> mergeSplits(List<Integer> left,
			List<Integer> right) {
		List<Integer> sorted = new ArrayList<Integer>();
		int a = 0;
		int b = 0;
		for (int i = 0; i < left.size() + right.size(); i++) {
			if (b >= right.size()
					|| (a < left.size() && left.get(a) < right.get(b))) {
				sorted.add(left.get(a));
				a++;
			} else {
				sorted.add(right.get(b));
				b++;
			}
		}
		return sorted;
	}

}
