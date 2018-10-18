package alogorithm.ds.example.array;

import java.util.ArrayList;
import java.util.List;

/*
 * Worst case Time Complexity: O(log n)
 * */
public class BinarySearchInArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int result = searchKey(2, list);
		if (result > 0) {
			System.out.println("Key Found!");
		} else {
			System.out.println("Key not Found!");
		}
	}

	static int searchKey(int key, List<Integer> list) {
		int low = 0;
		int high = list.size() - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			Comparable<Integer> midVal = list.get(mid);
			int cmp = midVal.compareTo(key);
			if (cmp < 0)
				low = mid + 1;
			else if (cmp > 0)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found
	}
}
