package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToArray {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		Integer[] arr1 = new Integer[4];
		Object[] arr2 = list1.toArray();
		list1.toArray(arr1);
		Integer[] arr3 = list1.toArray(new Integer[0]);
		Integer[] arr4 = list1.toArray(new Integer[5]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(list1.subList(0, 1));
		List<Integer> list2 = Arrays.asList(arr3);
		list2.add(5);
		Map<Integer, String> map = new HashMap<>();
	}
}
